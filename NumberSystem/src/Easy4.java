//Given an integer array nums, return the greatest common divisor
// of the smallest number and largest number in nums.
public class Easy4 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 10};
        System.out.println(findGCD(arr)); // print result
    }

    static int findGCD(int[] arr) {
        int smallest = findSmallest(arr);
        int biggest = findBiggest(arr);
        return gcd(biggest, smallest);
    }

    static int findSmallest(int[] arr) {
        int smallest = arr[0];
        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    static int findBiggest(int[] arr) {
        int biggest = arr[0];
        for (int num : arr) {
            if (num > biggest) {
                biggest = num;
            }
        }
        return biggest;
    }

    // Euclidean Algorithm for GCD
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

