public class FibonacciSeries {
    public static boolean fib(int a, int n ){
        int b = 12;
        int c = 14;
        int next = 0;
        for(int i = 0; i <= n; i++){
            System.out.print(b + " ");
           if(b == a){
                return true;
            }
            next = b + c;
            b = c;
            c = next;

            
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(fib(15, 10));
    }
}
