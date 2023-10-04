/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>>dl=new ArrayList<>();
          List<Integer>li=new ArrayList<>();
           List<Integer>li1=new ArrayList<>();
            List<Integer>li2=new ArrayList<>();
       set(root,li);
       set1(root,li1);
       set2(root,li2);
       dl.add(li);
       dl.add(li1);
       dl.add(li2);
       return dl;
    
    }
    public static void set(TreeNode root,List<Integer>li)
    {
        
      
        if(root==null)
        {
            return;
        }
        set(root.left,li);
        li.add(root.data);
        set(root.right,li);
      

        

        
    }
    public static void set1(TreeNode root,List<Integer>li)
    {
   
        if(root==null)
        {
            return;
        }
        li.add(root.data);
        set1(root.left,li);
        set1(root.right,li);
        
    }
    public static void set2(TreeNode root,List<Integer>li)
    {
       
        if(root==null)
        {
            return;
        }
        set2(root.left,li);
        set2(root.right,li);
        li.add(root.data);
    

    }
}