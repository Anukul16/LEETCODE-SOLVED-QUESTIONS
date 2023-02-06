class Solution {
    public int maxProfit(int[] prices) {
        
        int min=prices[0];
        int max_profit=0;
        for(int price=0;price<prices.length;price++){
            min=Math.min(min,prices[price]);
            int profit=prices[price]-min;
            max_profit=Math.max(profit,max_profit);
        }
        return max_profit;



        // int ans=0;

        // for(int i=0;i<prices.length-1;i++){

        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[i]<prices[j]){
        //             ans=Math.max(Math.abs(prices[i]-prices[j]),ans);
        //         }else{
        //             break;
        //         }
        //     }
        // }
        // return ans;
    }
}