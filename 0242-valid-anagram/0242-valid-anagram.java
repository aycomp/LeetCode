class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapOne = new HashMap<>();
        Map<Character, Integer> mapTwo = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            mapOne.put(c, mapOne.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            mapTwo.put(c, (mapTwo.getOrDefault(c, 0) + 1));
        }

        if (mapOne.size() != mapTwo.size()) return false;

        for (Map.Entry<Character, Integer> m : mapOne.entrySet()) {
            Character key = m.getKey();
            Integer occurance = m.getValue();
            if (!mapTwo.containsKey(key) || !mapTwo.get(key).equals(occurance)) {
                return false;
            }
        }

        return true;
    }
}