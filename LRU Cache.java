class LRUCache {
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    Map<Integer,Node>mapp=new HashMap();
    int cap;

    public LRUCache(int capacity) {
        cap=capacity;
    
        head.next=tail;
        tail.prev=head;


    }
    
    public int get(int key) {
        if(mapp.containsKey(key))
        {
            Node node=mapp.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else
        {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(mapp.containsKey(key))
        {
            remove(mapp.get(key));
        }
       else if(mapp.size()==cap)
        {
            remove(tail.prev);
        }
        insert(new Node(key,value));
        
    }
    private void remove(Node node)
    {
        if (node != null && node.prev != null && node.next != null) {
        mapp.remove(node.key);//remove from the map..
        node.prev.next=node.next;
        node.next.prev=node.prev;
        }
    }
    private void insert(Node node)
    {
        mapp.put(node.key,node);
        node.next=head.next;
             node.next.prev = node;
        node.prev=head;
        head.next=node;

    }
    class Node{
        Node prev,next;
        int key,value;
        Node(int k,int v)
        {
            key=k;
            value=v;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */