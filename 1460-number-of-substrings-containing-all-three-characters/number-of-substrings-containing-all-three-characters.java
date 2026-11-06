class Solution {
    public int numberOfSubstrings(String s) {
        // int n=s.length();
        // int count=0;
        // for(int i=0;i<n;i++){
        //     int freq[]=new int[3];
        //     for(int j=i;j<n;j++){
        //         freq[s.charAt(j) - 'a']++;
        //         if(freq[0]>0 && freq[1]>0 && freq[2]>0){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        int n=s.length();
        int count=0;
        int arr[]={-1,-1,-1};
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']=i;
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
                count=count+(1+Math.min(arr[0],Math.min(arr[1],arr[2])));
            }
        }
        return count;
    }
}
