import java.util.Arrays;
/*
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
For example, for arr = [1,2,3], the following are all the permutations of arr:
 [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
 */
public class Med1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr)); // Output: [2, 1, 3]
    }

    static void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from the right
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find element just larger than arr[i] from the right
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            // Step 3: Swap them
            swap(arr, i, j);
        }

        // Step 4: Reverse the suffix
        reverse(arr, i + 1, n - 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}

