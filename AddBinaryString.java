public class AddBinaryString {
    public static String trimLeadingZeros(String s) {
        int firstOne = s.indexOf('1');
        return firstOne != -1 ? s.substring(firstOne) : "0";
    }

    public String addBinary(String s1, String s2) {
        s1 = trimLeadingZeros(s1);
        s2 = trimLeadingZeros(s2);

        int n = s1.length();
        int m = s2.length();

        if (n < m) {
            String temp = s1;
            s1 = s2;
            s2 = temp;

            int tmpLen = n;
            n = m;
            m = tmpLen;
        }

        int j = m - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            int bit1 = s1.charAt(i) - '0';
            int bitSum = bit1 + carry;

            if (j >= 0) {
                int bit2 = s2.charAt(j) - '0';
                bitSum += bit2;
                j--;
            }
            int bit = bitSum % 2;
            carry = bitSum / 2;
            result.append(bit);
        }

        if (carry > 0) {
            result.append('1');
        }

        return result.reverse().toString();

    }

    public static void main(String[] args) {
        AddBinaryString adder = new AddBinaryString();
        String s1 = "0001011";
        String s2 = "00101";
        String sum = adder.addBinary(s1, s2);
        System.out.println("Sum: " + sum);
    }
}