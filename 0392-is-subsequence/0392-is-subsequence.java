class Solution {
    public boolean isSubsequence(String s, String t) {
        //abc    //ahbgdc
        int left=0;
        int right=0;
        int sl = s.length();
        int tl = t.length();
        
        while(left < sl && right < tl){
            if(s.charAt(left) == t.charAt(right)){
                left++;
                right++;
            } else {
                right++;
            }
        }
        if(left >= sl){
            return true;
        }
        return false;
    }
}