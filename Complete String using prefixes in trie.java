import java.util.* ;
import java.io.*; 
class Node{
   Node arr[];
   boolean flag;
   public Node()
   {
     arr=new Node[26];
     flag=false;
   }


}
class Trie{
  private Node root;
  public Trie(){
    root=new Node();
  }
  void insert(String string){
    Node node=root;
    for(char ch:string.toCharArray())
    {
      int ind=ch-'a';
      if(node.arr[ind]==null)
      {
        node.arr[ind]=new Node();
      }
      node=node.arr[ind];
    }
    node.flag=true;

  }
  boolean checkWord(String str)
  {
    Node node=root;
    for(char ch:str.toCharArray())
    {
      int index=ch-'a';
      if(node.arr[index]==null)
      {
        return false;
      }
      node=node.arr[index];

    }
    return node.flag;
  }
}

class Solution {

  public static String completeString(int n, String[] a) {
    // Write your code here.
    Trie tr=new Trie();
    for(String string:a)
    {
         tr.insert(string);
    }
    String s="";
    for(String str:a)
    {
      boolean bool=false;
       for(int i=0;i<str.length();i++)
       {
       
             String xx=str.substring(0,i+1);
             if(!tr.checkWord(xx))
             {
               bool=true;
                
             }
           
           

       }
       if(!bool)
       {
         if(str.length()>=s.length())
         {
           s=str;
         }
       }

    }
    return s.length()==0?"None":s;
    

  }
}