class Node{
           Node []arr;
    boolean flag;
    Node(){
        arr=new Node[26];
        flag=false;
    }
}
class Trie{
    Node root;
    Trie(){
      root=new Node();
    }
    void insert(String str)
    {
        Node node=root;
      for(char ch:str.toCharArray())
      {
           if(node.arr[ch-'a']==null)
           {
            node.arr[ch-'a']=new Node();
           }
           node=node.arr[ch-'a'];
      }
      node.flag=true;
    }
    boolean check(String st)
    {
        Node node=root;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(node.arr[ch-'a']==null)
            {
                return false;
            }
            node=node.arr[ch-'a'];
        }
        return true;
    }
  
}
class Solution {
    public int countPrefixes(String[] words, String s) {
        Trie trie=new Trie();
         trie.insert(s);
        int count=0;
        for(String str:words)
        {
            
            if(str.length()<=s.length()&&trie.check(str))
            {
                count++;
            }
        }
        return count;
    }
}