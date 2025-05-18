public class ReverseAndReplaceString {
    public static void main(String[] args) {
        String s = "Practice makes man perfect";
        String result = "";
        for(int i = s.length()-1; i >= 0; i--){
           if(s.charAt(i) == ' '){
                result += '?';
           }else result += s.charAt(i);
        }
        System.out.println(result);
    }
}
