class Solution {
    public int minBitFlips(int start, int goal) {
          String bin1 = Integer.toBinaryString(start);
        String bin2 = Integer.toBinaryString(goal);

        // Find the maximum length
        int maxLength = Math.max(bin1.length(), bin2.length());

        // Pad both binary strings with leading zeros to match the maximum length
        bin1 = String.format("%" + maxLength + "s", bin1).replace(' ', '0');
       bin2=String.format("%"+maxLength+"s",bin2).replace(' ','0');
        int count=0;
        for(int i=0;i<bin1.length();i++)
        {
            if(bin1.charAt(i)!=bin2.charAt(i))
            {
                count++;
            }
        }
        return count;
        
    }
}