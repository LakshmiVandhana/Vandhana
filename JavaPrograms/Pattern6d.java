import java.util.*;
class Pattern6d
{
 public static void main(String args[])
 {
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   for(int i=1;i<=n;)
   {
    for(int j=1;j<=n;j++)
    {
     System.out.print(j + " ");
    }
    n--;
    System.out.println();
  }
 }
}
  