import java.util.Scanner;

//Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
public class Easy3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int m = inp.nextInt();
        Solution s = new Solution();
        s.isThree(m);

    }
}
class Solution{
    public boolean isThree(int n ){
       //an int only has three divisor if and only if it is square of a prime number
    int root = (int) Math.sqrt(n);
        if (root * root != n) return false; // n must be a perfect square
        return isPrime(root); // root must be prime
    }
    public boolean isPrime(int num ){
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;

    }
}
