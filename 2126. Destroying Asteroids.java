import java.util.Arrays;
import java.util.Collections;
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long res=mass;
        Arrays.sort(asteroids);
   int n=asteroids.length;
        for(int i:asteroids)
        {
            if(i>res)
            {
                return false;
            }
            else
            {
                 res+=i;
            }
            
        }
        return true;
        
    }
}