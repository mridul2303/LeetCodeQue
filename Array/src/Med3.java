/*
maximum water in a container
 */


public class Med3 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 7, 8, 5};
        System.out.println(maxWater(arr));
        System.out.println(optimalMaxWater(arr));// brute force approach , two pointer approach
    }

    static int maxWater(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int length = Math.min(arr[i], arr[j]);
                int width = j - i;
                int area = length * width;
                if (area > max) {
                    max = area;
                }
            }
        }
        return max;
    }
    static int optimalMaxWater(int[] arr) {
        int max = 0;
        int left = 0;
        int length = 0;
        int right = arr.length -1;
        while (left<right){
            int width = right - left;
            if (arr[left] < arr[right]){
                length = arr[left];
            }
            else {
                length = arr[right];
            }
            int area = length * width;
            if (area > max){
                max = area;
            }
            if (arr[right] > arr[left]){
                left++;
            }
            else {
                right --;

            }        }
        return max;
    }
}
