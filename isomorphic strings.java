class Solution {
    public boolean isIsomorphic(String s, String t) {
           if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> charMap = new HashMap<>();
        HashSet<Character> mappedChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (charMap.containsKey(charS)) {
                if (charMap.get(charS) != charT) {
                    return false;
                }
            } else {
                if (mappedChars.contains(charT)) {
                    return false;
                }
                charMap.put(charS, charT);
                mappedChars.add(charT);
            }
        }

        return true;
    }
}