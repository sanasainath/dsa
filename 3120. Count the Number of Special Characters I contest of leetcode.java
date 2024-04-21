class Solution {
    public int numberOfSpecialChars(String word) {
         LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        // Add each character to the set, duplicates will be automatically removed
        for (char ch : word.toCharArray()) {
            set.add(ch);
        }
        
        // Convert the set back to a string
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }
        String word1=result.toString();
        int count=0;
        for(char ch:word1.toCharArray())
        {
            if (Character.isLowerCase(ch)) {
                char uppercaseChar = Character.toUpperCase(ch);
                  if (word1.contains(String.valueOf(uppercaseChar))) {
                      
                   count++;   
                  }
                
            }
        }
        return count;
        
        
    }
}