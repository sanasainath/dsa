class Solution {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        int h=horizontalCut.length;
        int v=verticalCut.length;
        Arrays.sort(horizontalCut);
           for (int i = 0; i < horizontalCut.length / 2; i++) {
            int temp = horizontalCut[i];
            horizontalCut[i] = horizontalCut[horizontalCut.length - i - 1];
            horizontalCut[horizontalCut.length - i - 1] = temp;
        }
        Arrays.sort(verticalCut);
           for (int i = 0; i < verticalCut.length / 2; i++) {
            int temp = verticalCut[i];
        verticalCut[i] = verticalCut[verticalCut.length - i - 1];
            verticalCut[verticalCut.length - i - 1] = temp;
        }

        int vblock=1;
        int hblock=1;  
        int left=0;
        int right=0;
        long res=0;
        while(left<h&&right<v)
        {
            if(horizontalCut[left]<=verticalCut[right])
            {
                res+=(verticalCut[right]*hblock);
                vblock++;
                right++;

            }
            else
            {
                res+=(horizontalCut[left]*vblock);
                hblock++;
                left++;
            }
        }
        while(left<h)
        {
            res+=(horizontalCut[left]*vblock);
            hblock++;
            left++;
     

        } 
        while(right<v)
        {
            res+=(verticalCut[right]*hblock);
            vblock++;
            right++;
        }
        return res;


        }
}