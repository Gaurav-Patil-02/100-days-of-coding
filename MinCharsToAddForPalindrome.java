public class MinCharsToAddForPalindrome {
     public static int minChar(String s) {
        String rev =  new StringBuilder(s).reverse().toString();
        String combined = s + "$" + rev;
        
        int[] lps = computeLPSArray(combined);
        
        return s.length() - lps[combined.length() -1] ;
        
    }
    
    public static int[] computeLPSArray(String str){
        int lps[] = new int[str.length()];
        int length = 0;
        int i = 1;
        
        while(i < str.length()){
            if(str.charAt(i) == str.charAt(length)){
                length++;
                lps[i] = length;
                i++;
            }else{
                if(length != 0){
                    length = lps[length - 1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
    }
    return lps;
}

public static void main(String[] args) {
    String s = "sabbc";
    System.out.println(minChar(s));
}
}
