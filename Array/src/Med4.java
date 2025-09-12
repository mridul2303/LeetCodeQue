//reverse integer
public class Med4 {
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }
    static int reverse(int x){
        int m = 0;
        while (x != 0) {
            int digit = x % 10;
            m = m * 10 + digit;
            x /= 10;
        }
        return m;
    }
}
