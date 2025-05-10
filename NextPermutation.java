import java.util.Arrays;

public class NextPermutation {

        static void reverse(int arr[], int start, int end){
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

      static void nextPermutation(int[] arr) {
        
        int pivot = -1;
        int n = arr.length;

        for(int i =n-2; i >= 0; i++){
            if(arr[i]< arr[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            reverse(arr, 0, n-1);
            return;
        }

        for(int i = n-1; i>pivot; i--){
            if(arr[i] > arr[pivot]){
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }

        int i = pivot + 1, j = n - 1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,7,5,0};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}