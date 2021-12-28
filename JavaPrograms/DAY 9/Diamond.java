import java.util.*;
class Diamond
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  for(int i=0;i<=n;i++)
  {
   for(int j=1;j<=n-i;j++)
   {
    System.out.print(" ");
   }
   for(int r=1;r<=2*i-1;r++)
   {
    System.out.print("*");
   }
    System.out.println();
  }
  for(int i=n-1;i>=1;i--)
  {
   for(int j=1;j<=n-i;j++)
   {
    System.out.print(" ");
   }
   for(int r=1;r<=2*i-1;r++)
   {
    System.out.print("*");
   }
   System.out.println();
  }
 }
}

