import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeByConcatenatingTwoLetterWords {
    public static int longestPalindrome(String[] words) {
         Map<String, Integer> wordCount = new HashMap<>();
             for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        int palindromeLength = 0, singleCenter = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String word = entry.getKey();
            String reversedWord = new StringBuilder(word).reverse().toString();
            int count = entry.getValue();

            if (word.charAt(0) == word.charAt(1)) {
                singleCenter += count % 2;
                palindromeLength += (count / 2) * 2 * 2;
            } else {
                palindromeLength += Math.min(count, wordCount.getOrDefault(reversedWord, 0)) * 2;
            }
        }
        palindromeLength += singleCenter > 0 ? 2 : 0;
        return palindromeLength;
    
    }
    public static void main(String[] args) {
        String[] words = {"ac", "ab", "bc"};
        System.out.println(longestPalindrome(words));
    }
}
