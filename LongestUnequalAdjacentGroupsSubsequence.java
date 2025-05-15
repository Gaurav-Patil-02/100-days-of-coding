import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubsequence {
    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < groups.length; i++){
            if(i == 0 || groups[i] != groups[i - 1]){
                result.add(words[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String  words[] = {"e","a","b"};
        int groups[] = {0,0,1};
        System.out.println(getLongestSubsequence(words,groups));
    }
}
