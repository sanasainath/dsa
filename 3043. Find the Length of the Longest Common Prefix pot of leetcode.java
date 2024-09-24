class Node{
    Node arr[]=new Node[10];
    boolean flag=false;
}
class Trie{
     Node root;
    Trie()
    {
        root=new Node();
    }
    void insert(String str)
    {
        Node node=root;
        for(char ch:str.toCharArray())
        {
          if(node.arr[ch-'0']==null)
          {
            node.arr[ch-'0']=new Node();

          }
          node=node.arr[ch-'0'];
        }
        node.flag=true;
    }
    int search(String str)
    {
        int count=0;
        Node node=root;
        for(char ch:str.toCharArray())
        {
         if(node.arr[ch-'0']==null)
         {
        break;
      
         }
        count++;
          node=node.arr[ch-'0'];
          
        }
        return count;

    }
}
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie t=new Trie();
     for(int i=0;i<arr1.length;i++)
     {
        t.insert(Integer.toString(arr1[i]));

     }
     int maxi=0;
     for(int i=0;i<arr2.length;i++)
     {
        maxi=Math.max(maxi,t.search(Integer.toString(arr2[i])));
        
     }
     return maxi;
        
    }
}