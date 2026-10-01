// class Solution {
//     public int compress(char[] chars) {
//         int n = chars.length;
//         int idx = 0;
//         for (int i = 0; i < n; i++) {
//             char ch = chars[i];
//             int count = 0;
//             while (i < n && chars[i] == ch) {
//                 count++;
//                 i++;
//             }
//             if (count == 1) {
//                 chars[idx++] = ch;
//             } else {
//                 chars[idx++] = ch;
//                 for (char digit : Integer.toString(count).toCharArray()) {
//                     chars[idx++] = digit;
//                 }
//             }
//             i--;
//         }
//         return idx;

//     }
// }
class Solution{
    public int compress(char[] chars){
        int left=0;
        int right=0;
        int count=0;
        int idx=0;
        while(left<chars.length){
            while(right<chars.length && chars[left]==chars[right]){
                right++;
            }
            count=right-left;
            if(count==1){
                chars[idx++]=chars[left];
            }else{
                chars[idx++]=chars[left];
                for(char digit : Integer.toString(count).toCharArray()){
                    chars[idx++] = digit;
                }
            }
            left=right;
        }
        return idx;
    }
}