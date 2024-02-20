//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException
    {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            Solution T = new Solution();
            int target = Integer.parseInt(br.readLine().trim());
            int k = Integer.parseInt(br.readLine().trim());
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = T.KDistanceNodes(root,target,k);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right;
// }

class Solution {
 
 static void markParents(Node root, Map<Node, Node> parentChildPair) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();

                if (currentNode.left != null) {
                    parentChildPair.put(currentNode.left, currentNode);
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    parentChildPair.put(currentNode.right, currentNode);
                    queue.offer(currentNode.right);
                }
            }
        }
    }

    public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        Map<Node, Node> parentChildPair = new HashMap<>();
        markParents(root, parentChildPair);

        Node targetNode = null;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            if (currentNode.data == target) {
                targetNode = currentNode;
                break;
            }
            if (currentNode.left != null)
                queue.offer(currentNode.left);
            if (currentNode.right != null)
                queue.offer(currentNode.right);
        }

        if (targetNode == null)
            return result;

        HashSet<Node> visited = new HashSet<>();
        queue.clear();
        queue.offer(targetNode);
        visited.add(targetNode);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            if (level == k) {
                while (!queue.isEmpty()) {
                    result.add(queue.poll().data);
                }
                break;
            }

            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();

                if (currentNode.left != null && !visited.contains(currentNode.left)) {
                    queue.offer(currentNode.left);
                    visited.add(currentNode.left);
                }
                if (currentNode.right != null && !visited.contains(currentNode.right)) {
                    queue.offer(currentNode.right);
                    visited.add(currentNode.right);
                }
                Node parent = parentChildPair.get(currentNode);
                if (parent != null && !visited.contains(parent)) {
                    queue.offer(parent);
                    visited.add(parent);
                }
            }
            level++;
        }

        Collections.sort(result);
        return result;
    }

    
}