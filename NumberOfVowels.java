public class NumberOfVowels {
    public static void main(String[] args) {
        String s = "Counting number of vowels";
        int count = 0;

        s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
