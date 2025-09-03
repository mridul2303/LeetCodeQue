import java.util.Arrays;

//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
public class med2 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort(arr);
    }
    static void sort(int[] arr){
        for (int i = 0 ; i <arr.length-1 ; i++){
            for (int j = i+1 ; j >0 ;j-- ){
                if (arr[j] < arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else {
                    break;

                }                           }

        }
        System.out.println(Arrays.toString(arr));
        }

    }
