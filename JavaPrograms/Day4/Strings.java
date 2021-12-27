import java.io.*;
import java.util.*;
class Strings
{
  public static void main (String args[])
  {
    Scanner scan = new Scanner(System.in);
    String A = scan.next();
    String B = scan.next();
    int length = A.length() + B.length();
    System.out.println(length);
    if(A.compareTo(B)>0){
    System.out.println("Yes");
    }
    else{
    System.out.println("No");
    }
     System.out.print(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
  }
}
    