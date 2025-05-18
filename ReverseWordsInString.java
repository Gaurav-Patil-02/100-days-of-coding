

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "Practice Makes Man Perfect";
        String[] words = s.split(" ");
        
        StringBuilder sb = new StringBuilder();

       for(int i = words.length-1; i >= 0; i--){
         sb.append(words[i]);
         if(i != 0){
            sb.append(" ");
         }
       }
       System.out.println(sb.toString());

       
    }
}
