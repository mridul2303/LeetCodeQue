public class Med4 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,3,6,7};
        int ans = find(arr);
        System.out.println(ans);
    }
    static int find(int[] arr){
        int start = 0,end = arr.length-1;
        int mid = start+(end-start)/2;
        while (!(arr[mid] > arr[mid+1]&&arr[mid] > arr[mid-1])){
            mid = start+(end-start)/2;
            if ()

        }

    }}
