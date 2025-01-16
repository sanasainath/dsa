class Solution {
    public int minimizeXor(int num1, int num2) {
        int num2count = Integer.bitCount(num2);
        int num1count = Integer.bitCount(num1);

        if (num1count == num2count) {
            return num1;
        } else if (num1count < num2count) {
            int diff = num2count - num1count;
            int result = num1;

            for (int i = 0; i < 32 && diff > 0; i++) {
                if ((result & (1 << i)) == 0) {
                    result |= (1 << i);
                    diff--; 
                }
            }
            return result;

        } else {
            int diff = num1count - num2count;
            int res=num1;
           for(int i=0;i<32&&diff>0;i++)
           {
            if((res&(1<<i)) !=0)
            {
                res&=~(1<<i);
               diff--;
            }
           }
           return res;
        }
    }
}
