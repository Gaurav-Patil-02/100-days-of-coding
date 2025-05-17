public class MaximumScoreAfterSplittingAString {
    public static int maxScore(String s) {
        char charS[] = s.toCharArray();
        int one = 0;
        int zero = 0;
        int maxScore = 0;

        for(int i = 0 ; i < charS.length; i++){
            if(charS[i] == '1'){
                one++;
            }
        }
        for(int i = 0; i < charS.length-1; i++){
            if(charS[i] == '0') zero++;
            else one--;
            maxScore = Math.max(maxScore, zero + one);  
        }
        return maxScore;
    }
    public static void main(String[] args) {
        String s = "0101100";
        System.out.println(maxScore(s));
    }
}
