public class PrintAllDivisors {

    public static int[] divisors(int n, int[] size) {
        int result[] = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result[count++] = i;
            }
        }
        size[0] = count;
        return result;
    }

    public static void main(String[] args) {
        int num = 36;
        int size[] = new int[1];
        int divisors[] = divisors(num, size);

        for(int i = 0; i < size[0]; i++){
            System.out.print(divisors[i] + " ");
        }
        System.out.println();

        divisors =  null;
    }
}
