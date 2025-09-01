// merge two sorted arrays by creating another one
public class Easy1 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 0,5, 7};
        int[] nums2 = {2, 4, 6, 8, 0};
        int[] merged = merge(nums1, nums2);

        // Print result
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }

    static int[] merge(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (nums1[i] == 0) { // skip 0 in nums1
                i++;
                continue;
            }
            if (nums2[j] == 0) { // skip 0 in nums2
                j++;
                continue;
            }

            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        while (i < n) {
            if (nums1[i] != 0) {
                result[k++] = nums1[i];
            }
            i++;
        }

        while (j < m) {
            if (nums2[j] != 0) {
                result[k++] = nums2[j];
            }
            j++;
        }

        // Trim result to actual size k
        int[] finalResult = new int[k];
        for (int x = 0; x < k; x++) {
            finalResult[x] = result[x];
        }

        return finalResult;
    }
}

//merging two array not creating another one
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;       // pointer for last valid element in nums1
        int j = n - 1;       // pointer for last element in nums2
        int k = m + n - 1;   // pointer for the end of nums1

        // Merge from back to front
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 still has elements left, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
