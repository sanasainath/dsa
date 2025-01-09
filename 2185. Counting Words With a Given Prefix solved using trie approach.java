class Node{
    Node []arr;
    int count;
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
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(node.arr[ch-'a']==null)
            {
             node.arr[ch-'a']=new Node();
            }
           
              node=node.arr[ch-'a'];
              node.count++;

        }
        node.flag=true;
    }
    int getPrefix(String st)
    {
        Node node=root;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(node.arr[ch-'a']!=null)
            {
             node=node.arr[ch-'a'];
            }
            else
            {
               return 0;
            }
            

        }
        return node.count;
      
    }
    
}
class Solution {
    public int prefixCount(String[] words, String pref) {
        // int count=0;
        // for(String i:words)
        // {
        //   if(i.startsWith(pref))
        //   {
        //     count++;
        //   }
        // }
        // return count;
        Trie trie=new Trie();
        for(String str:words)
        {
            trie.insert(str);
        }
        return trie.getPrefix(pref);
        
    }
}