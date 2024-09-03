class Solution {
    public long nthStair(int n) {
        // Code here
    //   List<List<Integer>>li=new ArrayList<>();
    // return path(n,li,new ArrayList<>());
    return (n/2)+1;
    }
    // public static long path(int n,List<List<Integer>>li,List<Integer>dl)
    // {
    //     if(n==0)
    //     {
    //         Collections.sort(dl);
    //         if(!li.contains(dl))
    //         {
    //             li.add(new ArrayList<>(dl));
    //             return 1;
    //         }
    //         return 0;
    //     }
    //     if(n<0)
    //     {
    //         return 0;
    //     }
    //     dl.add(1);
    //     long xx=path(n-1,li,dl);
    //     dl.remove(dl.size()-1);
    //     dl.add(2);
    //     long yy=path(n-2,li,dl);
    //   dl.remove(dl.size()-1);
    //     return xx+yy;
    // }
}