public class Easy3 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4};
        System.out.println(findOneElement(arr));
    }
    static int findOneElement(int[] nums ){
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR operation
        }
        return result;
    }
    }
