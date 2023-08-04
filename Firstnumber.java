
import java.lang.Math;
public class Firstnumber {

    public static void main(String[] args)
    {
      int n=9784;
      System.out.println("fu(n)");
    }
    static int fu(int n)
    {
        Double d=Math.log10(n);
        //Double newdata=new Double(d);
     //   int i=newdata.intValue();
    long i=(int)Math.round(d);
        int x=Math.pow(10,i);
        int ans=n/x;
        return ans;


    }
}
