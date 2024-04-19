class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer>li=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr1)
        {
            if(!set.contains(i))
            {
                set.add(i);
                li.add(i);
            }
        }
        for(int i:arr2)
        {
            if(!set.contains(i))
            {
                set.add(i);
                li.add(i);
            }
        }
        Collections.sort(li);
        return li;
    }
}