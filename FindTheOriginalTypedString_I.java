public class FindTheOriginalTypedString_I {
     public static int possibleStringCount(String word) {
        int count = 0;
        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i-1) == word.charAt(i)){
                count++;
            }
        }  

        return count + 1;      
    }
    public static void main(String[] args) {
        String word = "abbcccc";
        System.out.println(possibleStringCount(word));
    }
}
