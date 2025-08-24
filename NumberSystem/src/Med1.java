import java.util.Scanner;

public class Med1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(countPrimes(n));
    }

    static int countPrimes(int n) {
        int count = 0;
        while (n > 1) {
            if (isPrime(n)) {
                count++;
            }
            n--;
        }
        return count;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


//efficient version
//import java.util.Scanner;
//
//public class Med1 {
//    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        int n = inp.nextInt();
//        System.out.println(countPrimes(n));
//    }
//
//    static int countPrimes(int n) {
//        int count = 0;
//        while (n > 1) {
//            if (isPrime(n)) {
//                count++;
//            }
//            n--;
//        }
//        return count;
//    }
//
//    static boolean isPrime(int n) {
//        if (n <= 1) return false;
//        if (n == 2) return true;
//        if (n % 2 == 0) return false;
//
//        for (int i = 3; i * i <= n; i += 2) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}