//Given an integer n, return true if it is a power of three. Otherwise, return false.

import java.util.Scanner;

//An integer n is a power of three, if there exists an integer x such that n == 3x.
public class Easy1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(isPowerOfThree(n));

    }
//through recurrsion
    static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;          // negative & zero are not powers of 3
        if (n == 1) return true;           // 3^0 = 1
        if (n % 3 != 0) return false;
        else {
            isPowerOfThree(n / 3);
        }
        return true;
    }
}

/* static boolean isPowerOfThree(int n) {
    if (n <= 0) return false;
    while (n % 3 == 0) {
        n /= 3;
    }
    return n == 1;
}
efficient approach
*/

/*most efficient approach
The largest power of 3 that fits in a 32-bit signed integer is 3^19 = 1162261467.
        👉 Any other power of 3 must divide this number.
static boolean isPowerOfThree(int n) {
   return n > 0 && 1162261467 % n == 0;
}
*/


