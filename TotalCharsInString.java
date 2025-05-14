import java.util.HashMap;
import java.util.Map;

public class TotalCharsInString {
    static final int MOD = 1_000_000_007;
    public static int lengthAfterTransformations(String s, int t) {
        int n = s.length();
        Map <Character, Integer> freq = new HashMap<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for(int i = 1; i <= t; i++){
            int zfreq = freq.getOrDefault('z', 0);
            freq.put('z',0);
        

        for(char c = 'y'; c >= 'a'; c--){
            int count = freq.getOrDefault(c,0);
            freq.put((char)(c+1), freq.getOrDefault((char)(c+1),0) + count);
            freq.put(c, 0);
        }

        freq.put('a', (freq.getOrDefault('a' , 0) + zfreq) % MOD);
        freq.put('b', (freq.getOrDefault('b' , 0) + zfreq) % MOD);
    }
        int res = 0;
        for(int val : freq.values()){
            res = (res + val) % MOD;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcyy";
        int t = 2;

        System.out.println(lengthAfterTransformations(s, t));
    }
}

