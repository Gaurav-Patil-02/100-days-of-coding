public class ThreeConsecutiveOdds{
    public static boolean threeConsOdds(int arr[]){
        for(int i = 0; i < arr.length-2; i++){
            int j = i + 1;
            if(arr[i] % 2 == 1){
                if(arr[j]% 2 == 1 && arr[j+1] % 2 == 1){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,34,3,4,5,7,23,12};

        System.out.println(threeConsOdds(arr));
    }
}