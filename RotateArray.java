import java.util.Arrays;
public class RotateArray {

    public static void reverse(int arr[], int start, int end){
      while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;;
        start++;
        end--;
       }
    }
    public static void rotateArray(int arr[],  int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {10,2,56,2,14,36};
        int d = 3;

        System.out.println("Given Array : "+Arrays.toString(arr));
        rotateArray(arr, d);
        System.out.println("Rotated Array : "+Arrays.toString(arr));

        
    }
}
