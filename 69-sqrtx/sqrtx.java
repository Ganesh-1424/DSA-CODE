// class Solution {
//     public int mySqrt(int x) {
//         int left = 1, right = x, ans = 0;
//         if(x==1||x==0){
//             return x;
//         }

//         // while (left <= right) {
        
//         //     int mid = left +(right-left) / 2;

//         //     if ((long)mid*mid == x){
//         //         return mid;
//         //         }
//         //     else if ((long)mid*mid < x){
//         //         ans=mid;
//         //         left=mid+1;
//         //     }
//         //     else {
//         //        right=mid-1;
//         //     }
//         // }
//         while(left<right){
//             int mid=left+(right-left)/2;
//             if((long)mid*mid<=x){
//                 ans=mid;
//                 left=mid+1;
//             }else{
//                 right=mid-1;
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int mySqrt(int x) {
        int left = 1, right = x, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
