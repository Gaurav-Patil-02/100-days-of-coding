import java.util.*;

public class ThreeDigitEven {
    public static int[] findEvenNumbers(int digits[]) {
        int digitCount[] = new int[10];

        for (int d : digits) {
            digitCount[d]++;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 100; i < 999; i += 2) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;

            int count[] = new int[10];
            count[a]++;
            count[b]++;
            count[c]++;

            boolean valid = true;  
            for(int j = 0; j<10;j++){
                if(count[j] > digitCount[j]){
                    valid = false;
                    break;
                }

            }
            if(valid){
                result.add(i);
            }
        }
        int[] resArray = new int[result.size()];
        for(int i = 0; i < result.size();i++){
            resArray[i] = result.get(i);
        }
        return resArray;
    }

    public static void main(String[] args) {
        int digits[] = { 2, 2, 8, 8, 2 };
        System.out.println(Arrays.toString(findEvenNumbers(digits)));
    }
}
