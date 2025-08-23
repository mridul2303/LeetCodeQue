import java.util.Scanner;

//valid palindrome only alphanumeric
public class Q3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        System.out.println(ispalindrome(s));
    }
    static boolean ispalindrome(String s){
       int left = 0 ;
       int right = s.length()-1;
       while (left<right){
           while (left<right && !Character.isLetterOrDigit(s.charAt(left))){
               left++;
           }
           while (left<right && !Character.isLetterOrDigit(s.charAt(right))){
               right--;
           }
           if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
               return false;
           }
           left ++;
           right--;

    }
    return true;
    }}
