class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:leftChild)
        {
            if(i!=-1)
            {
                set.add(i);
            }

        }
         for(int i:rightChild)
        {
            if(i!=-1)
            {
                set.add(i);
            }

        }
        int root=-1;
        for(int i=0;i<n;i++)
        {
            if(!set.contains(i))
            {
                root=i;
                break;

            }
        }
        if(root==-1)
        {
            return false;
        }
        set.clear();
        Queue<Integer>q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        {
            
            int xx=q.poll();
            if(set.contains(xx))
            {
                return false;
            }
            
            set.add(xx);

            if(leftChild[xx]!=-1)
            {
            
                q.offer(leftChild[xx]);
            }
            if(rightChild[xx]!=-1)
            {
                q.offer(rightChild[xx]);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(!set.contains(i))
            {
                return false;
            }
        }
        return true;

        
    }
}