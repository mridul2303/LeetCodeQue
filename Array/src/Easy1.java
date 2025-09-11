public class Easy1 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] plusOne(int[] digits) {
        // Step 1: convert array digits to number
        int num = 0;
        for (int i = 0; i < digits.length; i++) {
            num = num * 10 + digits[i];  // build the full number
        }

        // Step 2: add 1
        num += 1;

        // Step 3: convert number back to array of digits
        String str = String.valueOf(num);
        int[] result = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i) - '0';
        }

        return result;
    }
}
//efficient one
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // add 1 and return immediately
                return digits;
            }
            digits[i] = 0; // set to 0 and carry to the next digit
        }

        // if we reach here, all digits were 9 → need an extra digit
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

