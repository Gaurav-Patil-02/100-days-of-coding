import java.util.ArrayList;

public class KMPAlgo {
    public static int[] buildLPS(String pat){
        int m = pat.length();
        int []lps = new int[m];
        int len = 0;
        int i = 1;
        
        while(i < m){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else {
                if(len != 0){
                len = lps[len - 1];
            }else{
                lps[i] = 0;
                i++;
            }
        }
    }
    return lps;
    }
    
   static ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = txt.length();
        int m = pat.length();
        
        int []lps = buildLPS(pat);
        
        int i = 0;
        int j = 0;
        
        while( i < n){
            if(txt.charAt(i) == pat.charAt(j)){
                i++;
                j++;
            }
            if(j == m){
                result.add(i - j);
                j = lps[j-1];
            }else if(i < n && txt.charAt(i) != pat.charAt(j)){
                if(j != 0) j =lps[j - 1];
                else i++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String txt = "abcab";
        String pat = "ab";

        System.out.println(search(pat, txt));
    }
}
