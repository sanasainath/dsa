public class Prime {
    public static void main(String[] args){
        int a=2;
        int count=0;
        for(int i=1;i<=a;i++)
        {
        
            if(a%i==0)
            {
                count=count+1;
            }
            
        }
        if(count==2)
        {
            System.out.println("it is prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
    
}
