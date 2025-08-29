// Find Minimum in Rotated Sorted Array
public class med3 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = findMin(arr);
        System.out.println(ans);  // should print 0
    }

    static int findMin(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                // min is on the right side
                start = mid + 1;
            } else {
                // min is at mid or in left half
                end = mid;
            }
        }
        // when loop ends, start == end
        return arr[start];
    }
}

