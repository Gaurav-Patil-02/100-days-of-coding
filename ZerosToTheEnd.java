import java.util.Arrays;

public class ZerosToTheEnd {
    public static void shiftZeros(int arr[]){
        int index = 0;
        for(int i = 0; i <arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                index++;
            } 
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,25,36,0,25,005,52};
        shiftZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}
