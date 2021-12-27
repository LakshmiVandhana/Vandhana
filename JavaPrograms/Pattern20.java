import java.util.*;
class Pattern20
{
  public static void main(String args[])
  {
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   int alphabets = 65;
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=i;j++)
    {
     System.out.print((char) (alphabets++) + " " );
    }
     System.out.println();
   }
  }
}
    