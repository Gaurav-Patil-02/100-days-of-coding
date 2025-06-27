import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i; j < arr.length; j++ ){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {25,36,85,11,6,9,344,563,52};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
