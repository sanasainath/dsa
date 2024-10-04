class Solution {
    public long dividePlayers(int[] skill) {
      
        int n=skill.length;
        if(n==2)
        {
            return skill[0]*skill[1];
        }
         long sum=0;
        Arrays.sort(skill);
         int left=0;
         int right=n-1;
         int val=skill[right]+skill[left];
         sum=sum+(skill[right]*skill[left]);
         left++;right--;
        
         while(left<right)
         {
            int xx=skill[right]+skill[left];
            if(xx!=val)
            {
                return -1;
            }
            sum=sum+(skill[right]*skill[left]);


            left++;
            right--;
         }
         return sum;


        
    }
}





//    1 2 3 3 4 5