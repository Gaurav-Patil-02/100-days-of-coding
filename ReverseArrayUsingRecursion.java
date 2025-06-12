import java.util.Arrays;

public class ReverseArrayUsingRecursion {

    public static void reverseArray(int arr[], int start, int end){
        if(start < end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            reverseArray(arr, start+1, end-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,52,36,4,36,45};
        System.err.println(Arrays.toString(arr));
        reverseArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
