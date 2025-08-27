import java.util.Scanner;

//Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
public class Easy5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        smallestEvenMultiple(n);

    }

    static int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;   // already even
        } else {
            return 2 * n;  // make it even
        }
    }
}
//its basically LCM of (2,n)