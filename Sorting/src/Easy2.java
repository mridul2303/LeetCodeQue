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

//another way to do this
//doing the sum of n numbers and sum of all numbers present in array
//ad subtracting them
/*class Solution{
    int[] arr = {0,2,3,4,5,6,7};
    int findMissing(){
        int sum = 0;
        int actualsum = 0;
        for (int i = 0; i <arr.length ; i++){
            sum += arr[i];
        }
        int maximum = findMax(arr);
        actualsum = (maximum*(maximum+1))/2;
        int n = actualsum - sum;
        return n;
    }
    int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1;i< arr.length;i++){
            if (max>arr[i]){
                max = max;
            }else {
                max = arr[i];

            }
        }
        return max;
    }}

 */