 
public class SecondLargest {

    public static int secondLargest(int arr[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }

        }
        if (second == Integer.MIN_VALUE) {
            return -1;
        } else {
            return second;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5,5,5,5 };
        System.out.println(secondLargest(arr));

    }
}