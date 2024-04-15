class Node{
     Node []arr=new Node[26];
     boolean flag=false;
     boolean checkKey(char ch)
     {
        if(arr[ch-'a']==null)
        {
            return true;
        }
        return false;
     }
     void putKey(char ch,Node node)
     {
        arr[ch-'a']=node;
     }
     Node getKeyref(char ch)
     {
        return arr[ch-'a'];
     }
     void setFlagEnd()
     {
        flag=true;
     }
    
}
class Trie {
    private Node root;

    public Trie() {
        root=new Node();


        
    }
    
    public void insert(String word) {
        Node node=root;
        for(int i=0;i<word.length();i++)
        {
            if(node.checkKey(word.charAt(i)))
            {
                node.putKey(word.charAt(i),new Node());


            }
            node=node.getKeyref(word.charAt(i));
        }
       node.setFlagEnd();
        
    }
    
    public boolean search(String word) {
           Node node=root;
        for(int i=0;i<word.length();i++)
        {
             if(node.checkKey(word.charAt(i)))
            {
                return false;


            }
            node=node.getKeyref(word.charAt(i));

        }
        if(node.flag==true)
        {
            return true;

        }
        return false;
        
    }
    
    public boolean startsWith(String prefix) {
         Node node=root;
        for(int i=0;i<prefix.length();i++)
        {
             if(node.checkKey(prefix.charAt(i)))
            {
                return false;


            }
            node=node.getKeyref(prefix.charAt(i));

        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */