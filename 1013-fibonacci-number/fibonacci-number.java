class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int freq[] = new int[n+1];
        freq[0]=1;
        freq[1]=1;
        for(int i=2;i<=n;i++){
            freq[i]=freq[i-1]+freq[i-2];
        }
        return freq[n-1];
    }
}