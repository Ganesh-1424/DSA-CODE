class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        // int xor=0;
        // for(int i=0;i<=n;i++){
        //     xor^=i;
        // }
        // for(int num:nums){
        //     xor^=num;
        // }
        // return xor;
        int totalsum=n*(n+1)/2;
        int actualsum=0;
        for(int num:nums){
            actualsum+=num;
        }
        return totalsum-actualsum;
    }
}