//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
class Easy2 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        // XOR with all elements in nums
        for (int num : nums) {
            xor ^= num;
        }

        return xor; // missing number
    }
}

