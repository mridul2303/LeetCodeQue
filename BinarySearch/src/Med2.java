//Find First and Last Position of Element in Sorted Array
public class Med2 {
    public static void main(String[] args) {
        int[] nums = {0,3,5,6,7,7,8,9};
        int target = 7;
        findIndex(nums,target);
    }
    static void findIndex(int[] nums, int target){
        int[] ans = {-1,-1};
       ans[0] = firstOccurance(nums,target);
       ans[1] = lastOccurance(nums,target);
        System.out.println("["+ans[0]+" " + ans[1]+"]");

    }
    static int firstOccurance(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        //finding first occurance
        int first = -1;
        while (start <= end ){
            int mid = start +(end-start)/2;
            if (nums[mid] == target){
                first = mid;
                end = mid -1;//keep searching in left
            } else if (target < nums[mid]) {
                end = mid -1;

            }
            else {
                start = mid +1;
            }

        }
        return first;
    }
    static int lastOccurance(int[] nums, int target){
        int start = 0,end=nums.length-1,last=-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (nums[mid] == target){
                last = mid;
                start = mid + 1; //keep searching in right
            } else if (nums[mid] > target) {
                end = mid -1;
            }
            else {
                start = mid + 1;

            }        }
        return last;
    }}
