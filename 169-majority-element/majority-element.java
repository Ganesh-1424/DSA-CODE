class Solution {
    public int majorityElement(int[] nums) {
    //      int n=nums.length;
    //      Arrays.sort(nums);
    //      for(int i=0;i<=n/2;i++){
    //        if(nums[i]==nums[n/2])
    //         return nums[i];
    //      }
    // return 1;
    // int candidate=0;
    // int count=0;
    // for(int num: nums){
    //     if(count==0){
    //         candidate=num;
    //     }
    //     if(num==candidate){
    //         count++;
    //     }else{
    //         count--;
    //     }

    // }
    // return candidate;
    // int candidate=0;
    // int count=0;
    // for(int num:nums){
    //     if(count==0){
    //         candidate=num;
    //     }
    //     if(candidate==num){
    //         count++;
    //     }
    //     else{
    //         count--;
    //     }
    // }
    // return candidate;
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int num : nums){
        map.put(num,map.getOrDefault(num,0)+1);
    }
    int maxfreq=0;
    int largest=0;
    for(Map.Entry<Integer,Integer>entry:map.entrySet()){
        if(entry.getValue()>maxfreq){
            maxfreq=entry.getValue();
            largest=entry.getKey();
        }
    }
    return largest;

}
}