import java.util.HashMap;
import java.util.LinkedHashMap;

public class NonRepeatingChar {
    public static char nonRepeatingChar(String s) {
        char c[] = s.toCharArray(); 
       HashMap<Character, Integer> map = new LinkedHashMap<>(); //to maintain insertion order
       
       for(char ch : c){
           map.put(ch , map.getOrDefault(ch , 0) + 1);
       }
        for(char ch : c){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        
        return '$';
    }
    public static void main(String[] args) {
        String s = "yy";
        System.out.println(nonRepeatingChar(s));
    }
}
