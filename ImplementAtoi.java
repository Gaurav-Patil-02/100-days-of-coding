public class ImplementAtoi {
     public static int myAtoi(String s) {
        int i = 0, sign = 1 , result = 0;
        int n = s.length();
        
        while(i < n && s.charAt(i) == ' '){
            i++;
        }
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign =  (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            int digit = s.charAt(i) - '0';
            
            if(result > (Integer.MAX_VALUE - digit) / 10){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            i++;
        }
        
        return result * sign;
    }

    public static void main(String[] args) {
        String s = "-123";
        System.out.println(myAtoi(s));
    }

}
