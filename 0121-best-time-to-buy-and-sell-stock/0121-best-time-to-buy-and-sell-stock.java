class Solution {
    public int maxProfit(int[] prices) {
        int max_Profit=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];//buy stock here
            }
            else{
                int profit=prices[i]-buy;
                max_Profit=Math.max(max_Profit,profit);
            }
        }
        return max_Profit;
        
    }
}