class Solution {
    public int minOperations(String[] logs) {
        int distance=0;
    
        for(int i=0;i<logs.length;i++)
        {  
           
            if(logs[i].equals("./"))
            {
                continue;
            }
            else if(logs[i].equals("../"))
            {
                if(distance>0)
                {
                  distance--;
                }
                
            }
            else
            {
                distance++;
            }
            
        }
        if(distance<=0)
        {
            return distance;

        }
        return distance;
        
        
    }
}