class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        int biggest = w1 > w2 ? w1 : w2;
        StringBuilder result = new StringBuilder();
        for(int i=0; i<biggest; i++){
            result.append(w1 > i ? word1.charAt(i) : "");
            result.append(w2 > i ? word2.charAt(i) : "");
        }
        return result.toString();
    }
