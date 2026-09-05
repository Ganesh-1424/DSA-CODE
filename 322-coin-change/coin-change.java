class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            int min=amount+1;
            for(int coin: coins){
                if(coin<=i){
                    int remain=i-coin;
                    int sum=dp[remain]+1;
                    min=Math.min(sum,min);
                }
            }
            dp[i]=min;
        }
        if(dp[amount]==amount+1){
            return -1;
        }
        return dp[amount];
    }
}