import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
         int arr[] = {25,36,85,11,6,9,344,563,52};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
