class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int []indegree=new int[colors.length()];
        List<List<Integer>>li=new ArrayList<>();
        for(int i=0;i<colors.length();i++)
        {
           li.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            li.get(edges[i][0]).add(edges[i][1]);
        }
        for(int i=0;i<colors.length();i++)
        {
            for(Integer ii:li.get(i))
            {
                indegree[ii]++;
            }
        
        }
        int [][]dp=new int[colors.length()][26];
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<colors.length();i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        dp[i][colors.charAt(i)-'a']=1;
        }
        int count=0;
        int maxi=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
           
            count++;

            for(Integer ii:li.get(node))

            {
                for(int i=0;i<26;i++)
                {
                    dp[ii][i]=Math.max(dp[ii][i],dp[node][i]+(colors.charAt(ii)-'a'==i?1:0));
                }
             indegree[ii]--;
             if(indegree[ii]==0)
             {
                q.add(ii);
             }
            }
           maxi = Math.max(maxi, Arrays.stream(dp[node]).max().getAsInt());
            
        }
        return count==colors.length()?maxi:-1;
         
          
    }
    
}