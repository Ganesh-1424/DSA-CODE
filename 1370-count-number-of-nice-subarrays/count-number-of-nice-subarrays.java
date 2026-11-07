class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // int n=nums.length;
        // int count=0;
        // for(int i=0;i<=n-k;i++){
        //     int kcount=k;
        //     for(int j=i;j<n;j++){
        //         if(nums[j]%2!=0){
        //             kcount--;
        //         }
        //         if(kcount==0){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        return atMost(nums,k)-atMost(nums,k-1);
    }
    public int atMost(int nums[],int k){
        if(k<0) return 0;
        int n=nums.length;
        int l=0;
        int r=0;
        int count=0;
        int oddcount=0;
        while(r<=n-1){
            if(nums[r]%2!=0){
                oddcount++;
            }
            while(oddcount>k){
                if(nums[l]%2!=0){
                    oddcount--;
                }
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
}