public class MajorityElement{

    public static int majorityElem(int arr[]){
       int freq = 0 , ans = 0;
       for(int i = 0; i < arr.length; i++){
        if(freq == 0){
            ans = arr[i];
        }
        if(ans == arr[i]){
            freq++;
        }else{
            freq--;
        }
       }
       return ans;
    }
    public static void main(String args[]){
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElem(arr));
    }
}