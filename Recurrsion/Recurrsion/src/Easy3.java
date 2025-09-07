public class Easy3 {
    public static void main(String[] args) {
        fib(5);

    }

        static int fib(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;
            int prev2 = 0, prev1 = 1;
            for (int i = 2; i <= n; i++) {
                int cur = prev1 + prev2;
                prev2 = prev1;
                prev1 = cur;
            }
            return prev1;



        }
    }

