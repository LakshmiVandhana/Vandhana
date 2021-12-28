import java.util.*;
class Pattern9D
{
 public static void main(String args[])
 {
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the length:");
   int l = scan.nextInt(); 
   System.out.println("Enter the breadth: ");
   int b = scan.nextInt();                       
   for(int i=1;i<=b;i++)
   {
     if(i>=2 && i<=b-1)
     {
       System.out.print(" * ");
      for(int k=2;k<=l+1;k++)
      {
       System.out.print("  ");
      }
      System.out.print(" * ");
     }
     else{
     for(int j=1;j<=l;j++)
     {
       System.out.print(" * ");
     }
    }
     System.out.println();
   }
 }
}     
     