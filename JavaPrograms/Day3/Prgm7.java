import java.util.*;
import java.io.*;
class Prgm7
{ 
 public static void main (String args[])
 {
  Scanner scan = new Scanner(System.in);
  int t=scan.nextInt();
  for(int i=0;i<t;i++)
  {
    try
    {
         long x = scan.nextLong();
         System.out.println(x+"can be fitted in:");
         if(x>=-128 && x<=127)
         {
           System.out.println("* byte");
         }
         if(x>=-32768 && x<=32767)
         {
           System.out.println("*short");
         }
         if(x>=-2147483648 && x<=2147483647)
         {
           System.out.println("*int");
         }
           System.out.println("*long");
     
    }
    catch(Exception e)
    {
     System.out.println(scan.next()+"can not be fitted anywhere.");
    }
   }
  }
}
   
    