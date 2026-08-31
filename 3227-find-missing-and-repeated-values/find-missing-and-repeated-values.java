class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] freq=new int[n*n+1];
        for(int[] arr:grid){
            for(int num:arr){
                freq[num]++;
            }
        }
        int repeated=0;
        int missing=0;
        for(int i=0;i<=n*n;i++){
            if(freq[i]==2){
                repeated=i;
            }
            if(freq[i]==0){
                missing=i;
            }
        }
        return new int[]{repeated,missing};
    }
}