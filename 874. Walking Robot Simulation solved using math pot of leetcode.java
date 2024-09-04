class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<String>set=new HashSet<>();
        for(int []row:obstacles)
        {
            set.add(row[0]+","+row[1]);
        }
        int [][]dir={{1,0},{0,-1},{-1,0},{0,1}};//east,south,west,north...........
        int currind=3;
        int maxi=0;
        int []position={0,0};
      
        for(int i=0;i<commands.length;i++)
        {
            if(commands[i]==-1)
            {
                currind=(currind+1)%4;
            }
            else if(commands[i]==-2)
            {
                currind=(currind-1+4)%4;
            }
            else
            {
                int currposx=dir[currind][0];
                int currposy=dir[currind][1];
                for(int k=0;k<commands[i];k++)
                {
                    int newposx=position[0]+currposx;
                    int newposy=position[1]+currposy;
                    if(set.contains(newposx+","+newposy))
                    {
                        break;
                    }
                    position[0]=newposx;
                    position[1]=newposy;
                }
                maxi=Math.max(maxi,position[0]*position[0]+position[1]*position[1]);
               
            }

        }
        return maxi;
        
        
    }
}