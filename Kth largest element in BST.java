// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
class HelloWorld {
     public static void path(Node root,List<Integer>li)
    
    {
        if(root==null)
        {
            return;
        }
        li.add(root.data);
        path(root.left,li);
        path(root.right,li);
    }
    public static void main(String[] args) {
        int K=2;
     Node node=new Node(10);
     node.left=new Node(3);
     node.right=new Node(4);
     node.left.right=new Node(88);
     List<Integer>li=new ArrayList<>();
        path(node,li);
        Collections.sort(li);
        Collections.reverse(li);
        System.out.println(li.get(K-1));
     
    }
}