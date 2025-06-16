public class MaximumDifferenceBetweenIncreasingElements {

    public static int maximumDiff(int nums[]){
        int minEle = nums[0];
        int maxDiff = -1;

        for(int j = 1; j < nums.length; j++){
            if(nums[j] > minEle){
                maxDiff = Math.max(maxDiff, nums[j] - minEle);
            }else{
                minEle = nums[j];
            }
        }
        return maxDiff;
    }
public static void main(String[] args) {
    int nums[] = {7,1,5,4};
    System.out.println(maximumDiff(nums));
}
    
}