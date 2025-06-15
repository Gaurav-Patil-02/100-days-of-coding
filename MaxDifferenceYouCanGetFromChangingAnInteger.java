public class MaxDifferenceYouCanGetFromChangingAnInteger {
     public static int maxDiff(int num) {
        String str1 = String.valueOf(num);  // max variant
        String str2 = str1;                 // min variant

        // For maximum value: replace the first non-9 digit with '9'
        int idx = -1;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != '9') {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            char ch = str1.charAt(idx);
            str1 = str1.replace(ch, '9');
        }

        // For minimum value: apply the logic as in C++
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (i == 0) {
                if (ch != '1') {
                    str2 = str2.replace(ch, '1');
                    break;
                }
            } else {
                if (ch != '0' && ch != str2.charAt(0)) {
                    str2 = str2.replace(ch, '0');
                    break;
                }
            }
        }

        return Integer.parseInt(str1) - Integer.parseInt(str2);
    }

    public static void main(String[] args) {
        System.out.println(maxDiff(555));
    }
}
