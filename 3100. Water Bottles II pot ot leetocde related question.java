class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count=numBottles;
        while(numBottles>=numExchange)
        {
            numBottles-=numExchange;
            numBottles++;
            count++;
            numExchange++;
        }
        return count;
        
    }
}