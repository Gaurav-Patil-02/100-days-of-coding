public class MajorityElement{

    public static int majorityElem(int arr[]){
        int n = arr.length-1;
        for(int num : arr){
            int occur = 0;
            for(int num2 : arr){
                if(num == num2){
                    occur++;
                }
            }
            if(occur > (n / 2)){
                return num;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElem(arr));
    }
}