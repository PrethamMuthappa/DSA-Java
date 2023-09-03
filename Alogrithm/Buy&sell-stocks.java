package stocks;
public class Stocks {

	public static void main(String[] args) {
		Solution ss=new Solution();
		int[] prices = {7, 2, 1, 4, 5};
		ss.maxProfit(prices);
	}
}
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int currentProfit = price - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }
        System.gc();
        System.out.println(maxProfit);
        return maxProfit;
        
    }
}
