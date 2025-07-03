public class FindTheK_ThCharacterInStringGame_I {
     public static char kthCharacter(int k) {
        StringBuilder result = new StringBuilder("a");
        while (result.length() <= k) {
            int length = result.length();
            for (int i = 0; i < length; i++) {
                char c = result.charAt(i);
                char nextChar = (char) ((c - 'a' + 1) % 26 + 'a');
                result.append(nextChar);
            }
        }
        return result.charAt(k - 1);
    }
public static void main(String[] args) {
    System.out.println(kthCharacter(5));
}
}
