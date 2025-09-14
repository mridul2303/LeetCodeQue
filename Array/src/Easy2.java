// Best Time to Buy and Sell Stock
public class Easy2 {
    public static void main(String[] args) {
        int[] price = {7,2,4,1,4,6};
        System.out.println(maxProfit(price));
}
static int maxProfit(int[] price){
        int profit = 0;
 for (int i = 0; i< price.length-2 ; i++){
     for (int j = i+1 ; j < price.length-1 ; j++){
         int temp = price[j]-price[i];
         if (temp>profit){
             profit = temp;
         }     }
 }
 return profit;
 // efficient way
    class Solution {
        public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;  // lowest price seen so far
            int maxProfit = 0;                 // best profit so far

            for (int price : prices) {
                if (price < minPrice) {
                    minPrice = price;          // update minimum
                } else {
                    maxProfit = Math.max(maxProfit, price - minPrice);
                }
            }
            return maxProfit;
        }
    }
}
}