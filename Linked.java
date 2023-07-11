class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class Linked
{
    private node head;
    Linked()
    {
        this.head=null;
    }
    public void insert(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            node current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
             current.next=newnode;   
        }
        
    }
    public void display()
    {
        node current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println(" ");
    }
    public static void main(String args[])

    {
        Linked link=new Linked();
        link.insert(2);
        link.insert(4);
        link.insert(5);
        link.display();

    }
}