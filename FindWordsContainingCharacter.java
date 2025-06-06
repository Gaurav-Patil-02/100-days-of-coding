import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if( words[i].indexOf(x) != -1){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
       String words[] ={"leet","code"};
       char x = 'e';
       System.out.println(findWordsContaining(words, x));
    }
}
