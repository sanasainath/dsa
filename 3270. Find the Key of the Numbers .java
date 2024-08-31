class Solution {
    public int generateKey(int num1, int num2, int num3) {
        // Format the numbers to 4 digits with leading zeros if necessary
        String s1 = String.format("%04d", num1);
        String s2 = String.format("%04d", num2);
        String s3 = String.format("%04d", num3);
        
        StringBuilder res = new StringBuilder();
        
        // Loop through each digit of the numbers
        for (int i = 0; i < 4; i++) {
            // Get the minimum digit between num1 and num2 at position i
            int minValue = Math.min(Character.getNumericValue(s1.charAt(i)), Character.getNumericValue(s2.charAt(i)));
            
            // Compare with the corresponding digit from num3 at position i
            minValue = Math.min(minValue, Character.getNumericValue(s3.charAt(i)));
            
            // Append the minimum value to the result
            res.append(minValue);
        }
        
        // Remove leading zeros
        String numberWithoutLeadingZeroes = res.toString().replaceFirst("^0+(?!$)", "");

        // If the result is empty (meaning it was all zeros), return 0
        if (numberWithoutLeadingZeroes.isEmpty()) {
            return 0;
        }

        // Convert to integer and return
        return Integer.parseInt(numberWithoutLeadingZeroes);
    }
}
