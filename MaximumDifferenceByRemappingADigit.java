public class MaximumDifferenceByRemappingADigit {
      public static int minMaxDifference(int num) {
        int minValue = num;
        int maxValue = num;
       String numStr = String.valueOf(num);
       
       //get maxValue
       for(char d = '0'; d <= '9'; d++){
        String replace = numStr.replace(d, '9');
        int value = Integer.parseInt(replace);
         maxValue = Math.max(maxValue, value);
       }

       //get MinVAlue
       for(char d = '1'; d <= '9'; d++){
        String replace = numStr.replace(d, '0');
        int value = Integer.parseInt(replace);
        minValue = Math.min(minValue, value);
       }

        return  maxValue - minValue ;
    }
    public static void main(String[] args) {
        int num = 505656;
        System.out.println(minMaxDifference(num));
    }
}
