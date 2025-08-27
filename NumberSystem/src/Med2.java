import java.util.Arrays;
import java.util.Scanner;

public class Med2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n  = inp.nextInt();
        smallestValue( n );
    }
    static int smallestValue(int n ){
        if (isPrime(n)){
            return n;
        }
        int sum = 0;
        int num = n;
        for (int i = 2 ; i*i <= num ; i++){
            while (n%i==0){
                sum += i;
                n /= i;
            }
        }
        if (n>1)
        {sum += n;}

        return sum;
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    }

