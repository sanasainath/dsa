    class Node{
        Node node[];
        boolean check;
        Node()
        {
            node=new Node[26];
            check=false;

        }
    }
    class Trie{
        private Node root;
        Trie(){
            root=new Node();
        }
        public void insert(String str)
        {
            Node node=root;
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(node.node[ch-'a']==null)
                {
                    node.node[ch-'a']=new Node();
                }
                node=node.node[ch-'a'];
            }
            node.check=true;
        }
        public int search(String target,int i,int n,int []dp)
        {
            Node node=root;
            if(i==n)
            {
                return 0;
            }
            if(dp[i]!=-1)
            {
                return dp[i];
            }
            int ans=(int)1e6;
            for(int j=i;j<n;j++)
            {
                char ch=target.charAt(j);
                if(node.node[ch-'a']!=null)
                {
                    ans=Math.min(ans,1+search(target,j+1,n,dp));
                    node=node.node[ch-'a'];
                }
                else
                {
                    break;
                }
            
            }
            return dp[i]=ans;

        }
    }
    class Solution {
        
    
        public int minValidStrings(String[] words, String target) {
        Trie t=new Trie();

            for(String word:words)
            {
                t.insert(word);
                
            }
            int []dp=new int[target.length()];
            Arrays.fill(dp,-1);
            
            int res=t.search(target,0,target.length(),dp);
            if(res>=(int)1e6)
            {
            return -1;
            }
            return res;

            
        }
    }