
import java.util.ArrayList;

class Node{
    Node arr[];
    int count;
    public Node(){
        arr=new Node[26];
        count=0;
    }
}
class Trie{
    private Node root;
    public Trie(){
        root=new Node();
    }
    boolean insert(String s)
    {
        Node node=root;
        for(char ch:s.toCharArray())
        {
            
         int ind=ch-'a';
         if(node.arr[ind]==null)
         { 
             node.arr[ind]=new Node();
             
         }
         
         node=node.arr[ind];
         
        }
        node.count++;
        if(node.count>1)
        {
            return true;
        }
        return false;
        
        
        
    }
}
public class Solution 
{

	public static int countDistinctSubstrings(String s) 
	{
		//	  Write your code here.
		int n=s.length();
       int total=(n*(n+1)/2)+1;
       int count=0;
       Trie tr=new Trie();
       for(int i=0;i<s.length();i++)
       {
           for(int j=i;j<s.length();j++)
           {
               String st=s.substring(i,j+1);
               if(tr.insert(st))
               {
                   count++;
               }
           }
       }
       return total-count;
	}
}