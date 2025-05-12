public class BuyAndSellStocks_SingleTrans {
     static public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i< prices.length; i++){
            int profit = 0;
            if(prices[i] < minPrice){
               minPrice = prices[i];
            }else{
                profit = prices[i] - minPrice;
            }

            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int  prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
