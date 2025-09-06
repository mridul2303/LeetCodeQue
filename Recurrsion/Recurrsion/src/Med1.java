//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

public class Med1 {
    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
    }

    //by recursion
    static double myPow(double x, int n) {
        long N = n; // step 1: use long to handle Integer.MIN_VALUE
        if (N < 0) { // step 2: handle negative powers
            x = 1 / x;  // 2^-3 = 1 / (2^3)
            N = -N;
        }
        return fastPow(x, N); // step 3: compute using recursion
    }
    static double fastPow(double x, long n) {
        if (n == 0) return 1; // base case: x^0 = 1

        double half = fastPow(x, n / 2); // step 4: divide problem into half

        if (n % 2 == 0) {
            return half * half; // step 5: if even → square the half
        } else {
            return half * half * x; // step 6: if odd → square * x
        }
    }}
/*
fastPow(2, 5)
 └── fastPow(2, 2)
      └── fastPow(2, 1)
           └── fastPow(2, 0) → returns 1
           ↑
      returns 2
      ↑
 returns 4
 ↑
returns 32
 */