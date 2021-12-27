import java.util.*;
class Pattern4
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int alphabets = 65;
  for(int i=0;i<=n;i++)
  {
   for(int j=0;j<=i;j++)
   {
    for(int k=j;k<=j;k++)
    {
     System.out.print( (char) (alphabets++) + " " );
    }
    alphabets ++;
   }
    System.out.println();
  }
 }
}
   