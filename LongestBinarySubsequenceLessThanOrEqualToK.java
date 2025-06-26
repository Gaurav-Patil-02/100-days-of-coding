public class LongestBinarySubsequenceLessThanOrEqualToK {
     public static int longestSubsequence(String s, int k) {
        int count = 0;
        int sum = 0;
        int n = s.length();
        boolean isValidOne = true;

        for(int i = n -1; i >= 0; i--){
            if(s.charAt(i) == '0'){
                count++;
            }else if(isValidOne){
                int idx = n - 1 - i;
                sum += Math.pow(2, idx);
                if(sum <= k){
                    count++;
                }else{
                    isValidOne = false;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
       String s = "00101001";
       int  k = 1;
       System.out.println(longestSubsequence(s, k));

    }
}
