//There is an integer array nums sorted in ascending order (with distinct values).
public class Med1 {
    public static void main(String[] args) {
        int[] arr = {0,1,3,5,7,9}; //{7,9,0,1,3,5}
        int target = 3;
        find(arr,target);

    }
    static int find(int[] arr,int target){
int start = 0;
int end = arr.length-1;
while (start<=end){
    int mid = start + (end -start)/2;
    //one part is always sorted either right one or left one
    if(target == arr[mid]){
        return mid;
    }
    //if left is sorted
    if (arr[start] < arr[mid]){
        if (target > arr[start] && target < arr[mid]){
            end = mid-1;
        }
        else {
            start = mid +1;

        }
    }
    //right part is sorted
    else if (arr[mid] < arr[end]) {
        if (target > arr[mid] && target < arr[end]){
            start = mid + 1;

        }
        else {
            end = mid -1 ;
        }
    }
}
return -1;
    }

}
