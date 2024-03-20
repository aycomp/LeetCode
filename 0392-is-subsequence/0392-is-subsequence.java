class Solution {
    public boolean isSubsequence(String s, String t) {
        //abc    
        //ahbgdc
        int sl = s.length();
        int tl = t.length();
        int max = sl > tl ? sl : tl;
        int left=0;
        int right =0;
        for (int i=0; i<max; i++) {
            if((left < sl && right < tl) && (s.charAt(left) == t.charAt(right))) {
                left++;
                right++;
            } else {
                right++;
            }
        }
        return left >= sl ? true : false; 
    }
}