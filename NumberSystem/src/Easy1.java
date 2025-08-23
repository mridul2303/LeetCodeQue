import java.util.Scanner;

//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
public class Easy1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(add(n));
    }
    static int add(int n ){
        while (n>=10){
            int rem = n%10;
            n /= 10;
            n = rem + n;
        }
        return n;
    }}

//efficient way
//import java.util.Scanner;
//
//public class Easy1 {
//    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        int n = inp.nextInt();
//        System.out.println(add(n));
//    }
//
//    static int add(int n) {
//        if (n == 0) return 0;
//        return 1 + (n - 1) % 9;
//    }
//}