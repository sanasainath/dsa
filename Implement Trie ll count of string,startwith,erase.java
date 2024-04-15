import java.util.* ;
import java.io.*; 
class Node{
    Node arr[]=new Node[26];
    int count;
    public Node()
    {
        count=0;
    }
}
public class Trie {
    private Node root;
    public Trie() {
        // Write your code here.
        root=new Node();
    }

    public void insert(String word) {
        // Write your code here.
    Node node=root;
    for(char ch:word.toCharArray())
    {
        int index=ch-'a';
        if(node.arr[index]==null)
        {
            node.arr[index]=new Node();
        }
        node=node.arr[index];
    }
    node.count++;
    }

    public int countWordsEqualTo(String word) {
        // Write your code here.
        Node xx=findWordInd(word);
        return xx==null?0:xx.count;
      

    }
    public Node findWordInd(String word)
    {
          Node node=root;
        for(char ch:word.toCharArray())
        {
            int index=ch-'a';
            if(node.arr[index]==null)
            {
                return null;
            }
            node=node.arr[index];
        }
        return node;
    }

    public int countWordsStartingWith(String word) {

        // Write your code here.
         Node nod=findWordInd(word);
        return wordsTotal(nod);
       
        
    }
    public int wordsTotal(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int count=node.count;
        for(Node cal:node.arr)
        {
            count+=wordsTotal(cal);
        }
        return count;

    }

    public void erase(String word) {
        Node node=findWordInd(word);
        if(node!=null&&node.count>0)
        {
            node.count--;
        }
        
        
       
        
        // Write your code here.
    }

}
