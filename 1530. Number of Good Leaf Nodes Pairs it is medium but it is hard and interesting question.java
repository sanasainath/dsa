class Solution {
    public static int [] dfs(TreeNode root,int dis)
    {
        if(root==null)
        {
            return new int[0];
        }
        if(root.left==null&&root.right==null)
        {
            return new int[]{1};
        }
        int []left=dfs(root.left,dis);
        int []right=dfs(root.right,dis);
        for(int i:left)
        {
            for(int j:right)
            {
                if(i+j<=dis)
                {
                    res++;
                }
            }
        }
        int []parent=new int [left.length+right.length];
        int a=0;
        for(int i:left)
        {
            if(i+1<dis)
            {
                parent[a++]=i+1;
            }
        }
    
          for(int i:right)
        {
            if(i+1<dis)
            {
                parent[a++]=i+1;
            }
        }
        // return parent;   because it may have trailing errors like we took length of the parent is left+right so zeores may present so we took like this........................
        int[] result = new int[a];
        System.arraycopy(parent, 0, result, 0, a); 
        return result;
    }
    static int res;
    // static String first="",second="";
    public int countPairs(TreeNode root, int distance) {

 res=0;
 dfs(root,distance);
 return res;
//         StringBuilder str=new StringBuilder();
//         HashSet<Integer>set=new HashSet<>();
//         findleaf(set,root);
//         for(int i:set)
//         {
//             for(int j:set)
//             {
//                 if(i!=j)
//                 {
//                     TreeNode lca=findlca(root,i,j);
//                     findcount(lca,i,j,str);
//                      if(first.length()+second.length()<=distance)
//                      {
//                         res++;
//                      }
//                      str.setLength(0);
//                      first="";second="";
//                 }
//              }
//         }
//         return res/2;
        
//     }
//       public static void findcount(TreeNode lca,int p,int q,StringBuilder str)
//     {
//         if(lca==null)
//         {
//             return;
//         }
//         if(lca.val==p)
//         {
//            first=str.toString();  
//         }
//         if(lca.val==q)
//         {
//             second=str.toString();
//         }
//         findcount(lca.left,p,q,str.append('L'));
//         str.deleteCharAt(str.length()-1);
//          findcount(lca.right,p,q,str.append('R'));
//         str.deleteCharAt(str.length()-1);
//  }
//      public static TreeNode findlca(TreeNode root,int p,int q)
//     {
//         if(root==null)
//         {
//             return null;
//         }
//         TreeNode left=findlca(root.left,p,q);
//         TreeNode right=findlca(root.right,p,q);
//         if(left!=null&&right!=null||root.val==p||root.val==q)
//         {
//             return root;
//         }
//         else if(left==null&&right!=null)
//         {
//             return right;
//         }
//         return left;
//     }

// public static void findleaf(HashSet<Integer>set,TreeNode root)
// {
//      if(root==null)
//     {
//         return;
//     }
//     if(root.left==null&&root.right==null)
//     {
//         set.add(root.val);
//     }
//    findleaf(set,root.left);
//     findleaf(set,root.right);
// }
}
}
