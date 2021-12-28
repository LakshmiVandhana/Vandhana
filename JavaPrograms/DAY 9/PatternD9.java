import java.util.*;
class PatternD9
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the length");
  int l = scan.nextInt();//no.of rows
  System.out.println("Enter the breadth");
  int b = scan.nextInt();//no.of columns
  for(int i=1;i<=b;i++)
  {
   for(int j=1;j<=l;j++)
   {
    System.out.print(" * " +" ");
   }
   System.out.println();
  }
 }
}