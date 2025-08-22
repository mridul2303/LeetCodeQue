import java.util.Scanner;

//Given two binary strings a and b, return their sum as a binary string.
public class Q2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String a = inp.nextLine();
        String b = inp.nextLine();
        System.out.println(sum( a ,b));
    }
    static String sum(String a,String b){

        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while (i>0 || j>0 || carry!= 0){
            int sum =carry;
            if (i>=0){
                sum += a.charAt(i) - '0';

            }
        if (j>=0){
        sum += b.charAt(j) - '0';
        }
        result.append(sum%2);

        carry = sum/2;

        }
        return result.reverse().toString();


    }}
