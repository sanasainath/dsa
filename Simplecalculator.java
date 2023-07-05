import java.util.Scanner;
public class Simplecalculator {
    public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.print("enter the operation:\n1.addition\n2.subtraction\n3.multiplication");
  int operation=sc.nextInt();
  if(operation!=1&&operation!=2&&operation!=3)
  {
    System.out.println("invalid input");

  }
  else
  {
    System.out.println("enter first number");
    int a=sc.nextInt();
    System.out.println("enter Second number");
    int b=sc.nextInt();
     if(operation==1)
     {
        System.out.println(a+b);
     }
     else if(operation==2)
     {
        System.out.println(a-b);

     }
     else if(operation==3)
     {
        System.out.println(a*b);
     }
  }
}
}
