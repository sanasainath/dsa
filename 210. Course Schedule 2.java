class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
          ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int m=prerequisites.length;

        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++)
        {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        Queue<Integer>q=new LinkedList<>();
        int indegree[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            for(int ii:adj.get(i))
            {
                indegree[ii]++;
            }
        }
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                q.offer(i);
            }
        }
        int arr[]=new int[numCourses];
        int qq=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int xx=q.poll();
                arr[qq++]=xx;
                for(int ii:adj.get(xx))
                {
                    indegree[ii]--;
                    if(indegree[ii]==0)
                    {
                        q.offer(ii);
                    }
                }
            }
        }
        if(qq==numCourses)
        {
            return arr;
        }
        return new int[0];
        
    }
}