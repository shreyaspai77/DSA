public class stockSelling {

    public static void main(String[] args) {
        int[] prices = { 7, 2, 7, 1 };
        int profit = stockBuyer(prices);
        System.out.println(profit);
    }

    private static int stockBuyer(int[] prices) {
        // TODO Auto-generated method stub
        // find the min and max
        int min = 0;// index of min element
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[min]) {
                min = i;
            } else {
                profit = Math.max(profit, prices[i] - prices[min]);
            }
        }
        return profit;
    }
}
