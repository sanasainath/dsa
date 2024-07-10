class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        Arrays.sort(enemyEnergies);
        if(enemyEnergies[0]>currentEnergy)
        {
            return 0;
        }
        long sum=0;
        for(int i=0;i<enemyEnergies.length;i++)
        {
            sum+=enemyEnergies[i];

        }
        sum-=enemyEnergies[0];
        sum+=currentEnergy;
        return sum/enemyEnergies[0];

        
    }
}