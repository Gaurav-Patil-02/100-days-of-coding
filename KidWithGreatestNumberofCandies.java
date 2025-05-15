import java.util.ArrayList;
import java.util.List;

public class KidWithGreatestNumberofCandies {
     public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > largest){
                largest = candies[i];
            }
        }
        List <Boolean> result = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= largest){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int candies[] = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
