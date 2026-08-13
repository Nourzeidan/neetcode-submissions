
class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> sH = new HashMap<>();
        Map<Character, Integer> tH = new HashMap<>();
        for (char c : s.toCharArray()) {
            sH.put(c, sH.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            tH.put(c, tH.getOrDefault(c, 0) + 1);
        }

        return sH.equals(tH);

    }
}
