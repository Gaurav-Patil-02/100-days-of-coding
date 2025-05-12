import java.util.Arrays;

public class MajorityElement_II {

    static int[] majorityElem(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
       
        for(int i=0; i < n-1; i++){
              int occur = 0;
            for(int j = i+1; j < n-2;j++){
                if(arr[i] == arr[j]){
                    occur++;
                }
            }
            if(occur > (n/3)){
                ans[i] = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,1,3,2,1,1};

        System.out.println(Arrays.toString(majorityElem(arr)));
    }
}
