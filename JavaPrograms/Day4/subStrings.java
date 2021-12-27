import java.io.*;
import java.util.*;
class SubStrings
{
  public static void main(String args[])
  {
   Scanner scan = new Scanner (System.in);
   String a = scan.next();
   int start = scan.nextInt();
   int end = scan.nextInt();
   System.out.println(a.substring(start,end));
  }
}