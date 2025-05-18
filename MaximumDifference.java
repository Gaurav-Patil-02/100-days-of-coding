public class MaximumDifference {
    public static int maxDiff(int arr[]){
        int res = 0;
        int min = arr[0];  

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            res = Math.max(res, (arr[i] - min));
        }
        return res;
    }
    public static void main(String[] args) {
       int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(maxDiff(arr));
    }
}
