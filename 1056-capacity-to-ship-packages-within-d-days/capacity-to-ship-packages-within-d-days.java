class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
        }
        for(int i=0;i<weights.length;i++){
            high+=weights[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int reqdays= requiredDays(weights,mid);
            if(reqdays<=days){
                high=mid-1; 
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int requiredDays(int weights[],int mid){
        int load=0;
        int days=1;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>mid){
                days++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
}