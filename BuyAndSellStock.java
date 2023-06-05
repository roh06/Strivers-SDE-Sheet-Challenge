import java.util.ArrayList;

public class BuyAndSellStock {
    public static void main(String[] args) {

    }
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min = Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.size();i++){
            if(prices.get(i)<min){
                min = prices.get(i);
            }
            int currProfit = prices.get(i)-min;
            if(currProfit>maxProfit){
                maxProfit = currProfit;
            }
        }
        return maxProfit;
    }
}
