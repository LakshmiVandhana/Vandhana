import java.util.*;
class PatternD9
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  for(int i=n;i<=n+3;i++)
  {
   for(int j=i;j<=n;j++)
   {
    System.out.print("*");
   }
   System.out.println();
  }
 }
}