import java.util.ArrayList;
import java.util.Arrays;

public class MergesSort {

    public static void merge(int arr[], int low, int mid, int high){

        //Temp array to store sorted part
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        //Run till left and right are less than mid and high
        while (left <= mid && right <= high) {
            //Sort the elements by switching the elements
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        //Sort remaining elements
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        //Copy the temp elements to original array
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int arr[], int low, int high){
        //Retunr if base case hits
        if(low >= high) return;

        //Find mid
        int mid = (low + high) / 2;

        //Divide first half
        mergeSort(arr, low, mid);

        //Divide Seconde half
        mergeSort(arr, mid+1, high);

        //sort and merge
        merge(arr, low, mid, high);
    }


    public static void main(String[] args) {
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
