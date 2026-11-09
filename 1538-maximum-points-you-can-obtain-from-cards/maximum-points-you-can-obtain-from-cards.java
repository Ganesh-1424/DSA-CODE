class Solution {
    public int maxScore(int[] cardPoints, int k) {
        //    int n=cardPoints.length;
        //    int sum=0;
        //    int max=0;
        //    for(int i=0;i<k;i++){
        //     sum+=cardPoints[i];
        //     max=Math.max(max,sum);
        //    }
        //    int sum1=0;
        //    for(int i=n-1;i>=n-k;i--){
        //     sum1+=cardPoints[i];
        //     max=Math.max(max,sum1);
        //    }
        //    return max;
        int n = cardPoints.length;
        int lsum = 0;
        int rsum = 0;
        int max = 0;
        for (int i = 0; i < k ; i++) {
            lsum += cardPoints[i];
            // max = Math.max(max, lsum);
        }
        max=lsum;
        int ridx = n - 1;
        for (int i = k - 1; i >= 0; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[ridx];
            ridx=ridx-1;
            max = Math.max(max, lsum + rsum);
        }
        return max;
    }
}