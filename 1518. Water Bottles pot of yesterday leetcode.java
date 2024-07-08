class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=0;
          count+=numBottles;
     while(numBottles>=numExchange)
     {
         
      
        int x=numBottles/numExchange;
        count+=x;
        numBottles=x+(numBottles%numExchange);

     }
     return count;
          
     

        
    }
}