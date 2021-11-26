import java.util.*;
import java.io.*;
class Prgm6
{ 
  public static void main(String args[])
  { 
    int t=0;
    Scanner scan = new Scanner(System.in);
    int q = scan.nextInt();
    for(int i=0;i<q;i++)
    {
      int a = scan.nextInt();
      int b = scan.nextInt();
      int n = scan.nextInt();
      for(int x=0;x<n;x++)
      {
	t+=Math.pow(2,x)*b;
       int v=a+t;
       System.out.print(v+" ");
      }
    }
     scan.close();
   }
}
       