class Node{
   HashMap<String,Node>map;
    boolean check;
    Node(){
        map=new HashMap<>();
        check=false;
    }
}
class Trie{
    Node root;
    Trie(){
        root=new Node();
    }
    public void insert(String s)
    {
        Node node=root;
        String []str=s.split("/");
        for(int i=0;i<str.length;i++)
        {
            String st=str[i];
            if(st.isEmpty())
            {
                continue;
            }
            
        if(!node.map.containsKey(st))

            {
                node.map.put(st,new Node());
            }
            node=node.map.get(st);
           

        }
        node.check=true;
    }
    public boolean startwith(String s){

        Node node=root;
        String str[]=s.split("/");
         for(String st:str)
         {
            if(st.isEmpty())
            {
                continue;
            }
            if(node.check)
            {
                return true;
            }
            if(!node.map.containsKey(st))
            {
                return false;
            }
            node=node.map.get(st);
         }
        
        return false;
       
     }
}
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String>li=new ArrayList<>();
        Trie t=new Trie();
        for(String s:folder)
        {
            t.insert(s);
        }
        for(String s:folder)
        {
            if(!t.startwith(s))
            {
                li.add(s);
            }
        }
        return li;


        
         

         
        
    }
}