import java.util.HashMap;
import java.util.Map;

public class Anagrams {
     public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        
        Map<Character, Integer> count = new HashMap<>();
        
        for(char ch : s1.toCharArray()){
            count.put(ch, count.getOrDefault(ch , 0) + 1);
        }
        
        for(char ch : s2.toCharArray()){
            count.put(ch, count.getOrDefault(ch, 0) - 1);
        }
        
        for(int value : count.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(areAnagrams(s1, s2));
    }
}
