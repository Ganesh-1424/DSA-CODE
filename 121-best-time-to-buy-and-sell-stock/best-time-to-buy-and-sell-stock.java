// class Solution {
//     public int maxProfit(int[] prices) {
//         int buyprice=Integer.MAX_VALUE;
//         int max=0;
//         for(int i=0;i<prices.length;i++){
//             if(buyprice<prices[i]){
//                 int profit=prices[i]-buyprice;
//                 max=Math.max(max,profit);
//             }else{
//                 buyprice=prices[i];
//             }
//         }
//         return max;
//     }
// }
class Solution {
    public int maxProfit(int[] prices){
        int buyprice=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyprice){
                buyprice=prices[i];
            }
            else{
                int ans=prices[i]-buyprice;
                max=Math.max(max,ans);
            }
        }
        return max;
    }
}