//Given an array of positive integers nums, return the number of distinct prime factors in the product of the elements of nums.
public class Med3 {
    public static void main(String[] args) {
        int[] arr = {2, 14, 19, 19, 5, 13, 18, 10, 15, 20};
        System.out.println(distinctPrimeFactors(arr)); // Output will be correct
    }

    static int distinctPrimeFactors(int[] arr) {
        // boolean array to track used primes
        boolean[] used = new boolean[1000]; // adjust size for max prime you expect
        int count = 0;

        for (int num : arr) {
            count += primeFactor(num, used);
        }

        return count;
    }

    static int primeFactor(int num, boolean[] used) {
        int count = 0;

        // factor 2
        if (num % 2 == 0 && !used[2]) {
            count++;
            used[2] = true;
        }
        while (num % 2 == 0) num /= 2;

        // odd factors
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0 && !used[i]) {
                count++;
                used[i] = true;
            }
            while (num % i == 0) num /= i;
        }

        // if remaining num is prime
        if (num > 2 && !used[num]) {
            count++;
            used[num] = true;
        }

        return count;
    }
}
