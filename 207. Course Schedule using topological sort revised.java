class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>>li=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            li.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            li.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int []indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            for(Integer ii:li.get(i))
            {
              indegree[ii]++;
            }
          
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
             count++;
             for(Integer ii:li.get(node))
             {
                indegree[ii]--;
                if(indegree[ii]==0)
                {
                    q.offer(ii);
                }
             }
        }
        if(count!=numCourses)
        {
            return false;
        }
        return true;

        
    }
}