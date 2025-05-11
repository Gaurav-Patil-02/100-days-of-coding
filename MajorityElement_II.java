
import java.util.*;

public class MajorityElement_II {

      public static  List<Integer> majorityElem(int[] nums) {
      int n = nums.length;
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        int c1= 0;
        int c2=0;
        
        for(int x : nums){
            if(x == num1){
                c1++;
            }else if(x == num2){
                c2++;
            }else if(c1 ==0){
                num1 = x;
                c1=1;
            }else if(c2 == 0){
               num2 = x;
                c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }
     c1 = c2 = 0;
        
        for(int x : nums){
            if(x == num1) c1++;
            else if(x == num2) c2++;
        }
        
        List<Integer> res = new ArrayList<>();
        if(c1 > n / 3) res.add(num1);
        if(c2 > n / 3) res.add(num2);
        
        Collections.sort(res);
        
        return res;
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};

        System.out.println(majorityElem(arr));
    }
}   
