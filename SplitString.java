public class SplitString {
    public static void splitString(String s){
        StringBuilder alphabets = new StringBuilder("");
        StringBuilder numbers = new StringBuilder("");
        StringBuilder specialChars = new StringBuilder("");
        
 //Using inbuilt Character class methods
       
        // for(char ch : s.toCharArray()){
        //     if(Character.isDigit(ch)){
        //         numbers.append(ch);
        //     }else if (Character.isLetter(ch)) {
        //         alphabets.append(ch);
        //     }else{
        //         specialChars.append(ch);
        //     }
        // }

        //Without using inbuilt Methods
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
                alphabets.append(s.charAt(i));
            }else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                numbers.append(s.charAt(i));
            }else{
                specialChars.append(s.charAt(i));
            }

        }
        System.out.println("Alphabets : " + alphabets);
        System.out.println("Numbers : " + numbers);
        System.out.println("Special Symbols : " + specialChars );
    }
    public static void main(String[] args) {
        String s = "Password@@123";
        splitString(s);
    }
}
