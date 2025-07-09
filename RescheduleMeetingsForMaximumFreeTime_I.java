import java.util.ArrayList;

public class RescheduleMeetingsForMaximumFreeTime_I {
    public static int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        ArrayList<Integer> freeArray = new ArrayList<>();

        freeArray.add(startTime[0]);

        for(int i = 1; i < startTime.length; i++){
            freeArray.add(startTime[i] - endTime[i-1]);
        }

        freeArray.add(eventTime - endTime[endTime.length - 1]);

        int i = 0;
        int j = 0;
        int maxSum = 0;
        int currSum = 0;
        int n = freeArray.size();

        while(j < n){
            currSum += freeArray.get(j);

            if(i < n && j-i+1 > k+1){
                currSum -= freeArray.get(i);
                i++;
            }

            maxSum = Math.max(maxSum, currSum);
            j++;
        }
        return maxSum;
    }
    public static void main(String[] args) {
       int eventTime = 5, k = 1, startTime[] = {1,3}, endTime[] = {2,5};
        System.out.println(maxFreeTime(eventTime, k, startTime, endTime));
    }
}
