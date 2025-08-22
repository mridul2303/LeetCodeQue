import java.util.Scanner;

//Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
public class Q1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int colnumber = inp.nextInt();
        String str = inp.nextLine();
        System.out.println(converttotitle(colnumber));
        System.out.println(converttointeger(str));
    }
    //conversion from integer to string
    static String converttotitle(int colnumber){
        StringBuilder sb = new StringBuilder();
        while (colnumber > 0){
            colnumber = colnumber -1;
            int rem = colnumber%26;
            char ch = (char) ('A' + rem);
            sb.append(ch);
            colnumber = colnumber/26;


        }
        return sb.reverse().toString(); //reversing and converting stringBuilder into string
    }
    //conversion from string to integer
    static int converttointeger(String str){
        int result = 0;
        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            int value = ch - 'A' + 1;
            result = result*26 + value;
        }
        return  result;

    }
}


