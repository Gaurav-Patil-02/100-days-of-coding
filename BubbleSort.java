import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int arr[]){
        for(int i = arr.length-1; i >= 0; i--){
            for(int j = 0; j <= i - 1; j++){
                if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
         int arr[] = {25,36,85,11,6,9,344,563,52};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
