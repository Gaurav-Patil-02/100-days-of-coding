import java.util.Arrays;

public class RangeAddition {
    public static int[] modifiedArray(int length, int updates[][]) {

        int result[] = new int[length + 1];
        for(int i[] : updates){
        int start = i[0];
        int end = i[1];
        int inc= i[2];

        result[start] += inc;
        if(end + 1 < length){
        result[end + 1] -= inc;
        }
        }

        for(int i = 1; i <length; i++){
        result[i] += result[i-1];
        }
        return result;

    }

    public static void main(String[] args) {
        int length = 5;
        int updates[][] = { { 1, 3, 2 }, { 2, 4, 3 }, { 0, 2, -2 } };
        System.out.println(Arrays.toString(modifiedArray(length, updates)));
    }
}