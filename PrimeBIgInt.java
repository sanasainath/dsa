import java.math.BigInteger;
class PrimeBIgInt//it used to return give number isprime or not and next integer...
{
    public static void main(String args[])
    {
        //to check given number is prime or not prime using bigint
        int x=13;
        System.out.println(prim(x));
        System.out.println(nextprim(x));
    }
    public static boolean prim(int x)
    {
    
       BigInteger a=BigInteger.valueOf(x);
       return a.isProbablePrime(1); 
    }
    public static int nextprim(int x)
    {
        BigInteger s=BigInteger.valueOf(x);
        String d=s.nextProbablePrime().toString();
         return Integer.parseInt(d);
    }
}