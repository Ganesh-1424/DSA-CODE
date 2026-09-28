class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        for(int k=0;k<s.length();k++){
            StringBuilder sb=new StringBuilder();
            char first=s.charAt(0);
            for(int j=1;j<s.length();j++){
                sb.append(s.charAt(j));
            }
            sb.append(first);
            if(sb.toString().equals(goal)){
                return true;
            }
            s=sb.toString();
        }
        return false;
    }
}