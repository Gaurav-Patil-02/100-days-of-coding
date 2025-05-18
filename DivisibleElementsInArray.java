public class DivisibleElementsInArray {
    public static void main(String[] args) {
        int arr[] = {10,35,15,36,85,96};
        int n = 9;
        int m = 4;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % n == 0 && arr[i] % m == 0){
                System.out.println(i);
            }
        }
    }
}
