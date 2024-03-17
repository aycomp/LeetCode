class Solution {//hello
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] str = s.toCharArray();
        while(left<right){
            if(!vowels.contains(str[left])){
                left++;
            }
            if(!vowels.contains(str[right])){
                right--;
            }
            if(vowels.contains(str[left]) && vowels.contains(str[right])){
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }
        StringBuilder strBuilder = new StringBuilder();
        for(int i=0; i<str.length; i++){
            strBuilder.append(str[i]);
        }    
        return strBuilder.toString();
    }
}