class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        StringBuilder result = new StringBuilder();
        int biggest = (w1-w2) > 0 ? w1 : w2;

        for(int i=0; i<biggest; i++) {
            if(i < word1.length()){
                result.append(word1.charAt(i));
            }
            
            if(i < word2.length()){
                result.append(word2.charAt(i));
            }
        }
       return result.toString(); 
    }
}