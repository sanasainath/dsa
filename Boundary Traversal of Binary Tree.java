/************************************************************

 Following is the Binary Tree node structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 ************************************************************/

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public static List<Integer> traverseBoundary(TreeNode root){
        // Write your code here.
         List<Integer> li = new ArrayList<>();
         Stack<Integer>st=new Stack<>();
          
     
           
      
       if (root != null) {
           li.add(root.data);
        path(root.left,li);
        path1(root,li);
        path2(root.right,st);
       }
      while(!st.isEmpty())
      {
          int x=st.pop();
          li.add(x);
      }
       
        return li;
    }
    private static void path(TreeNode node,List<Integer>dl)
    {
           if (node == null || (node.left == null && node.right == null)) 
        {
          return;
        
        }
       
        dl.add(node.data);

   if (node.left != null) {
        path(node.left, dl);
    } else if (node.right != null) {
        path(node.right, dl);
    }
      
      
     }
 
       private static void path1(TreeNode node,List<Integer>dl)
     
    {
        

        if(node==null)
        {
            return;
        }
        if(node.left==null&&node.right==null)
        {
            dl.add(node.data);
        }
        else
        {
            path1(node.left,dl);
            path1(node.right,dl);
        }
     }

    private static void path2(TreeNode node,Stack<Integer>st)
     
    {
      

          if (node==null||(node.left == null && node.right == null)) {
            return;
        }
         st.push(node.data);
         if (node.right != null) {
        path2(node.right, st);
    } else if (node.left != null) {
        path2(node.left,st);
    }


     }
}