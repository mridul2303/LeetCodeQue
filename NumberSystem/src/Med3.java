//Given an array of positive integers nums, return the number of distinct prime factors in the product of the elements of nums.
public class Med3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9};
        distincPrimeFactors(arr);
    }
    static int distincPrimeFactors(int[] arr){
        int i = 0;
        int mul = 1;
        while (i<arr.length){
            mul *= arr[i];
            i++;
        }

      return primeFactor(mul);
    }
    static int primeFactor(int mul){
        int count = 0;
        for (int i = 2; i*i<=mul ;i++){
            if (mul%i==0 && isPrime(i)){
                count ++;
            }else {
                count =count;
            }
        }
        return count;
    }
    static boolean isPrime(int i ){
       int j = 2;
       while (j*j<=i){
            if (i%j==0){
                return false;
            }
            else {
                j++;
            }
        }
       return true;
    }}
