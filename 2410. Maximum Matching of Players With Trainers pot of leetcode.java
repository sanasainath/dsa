class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count=0;
        Arrays.sort(trainers);
        Arrays.sort(players);
        int lastJ=0;
        for(int i=0;i<players.length;i++)
        {
          while(lastJ<trainers.length)
          {
                if(players[i]<=trainers[lastJ])
                {
                    count++;
                    lastJ++;
                    break;
                }
                lastJ++;
          }
        }
        return count;
        
    }
}