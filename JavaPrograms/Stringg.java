import java.util.*;
class Stringg
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner (System.in);
  String str = scan.nextLine();
  String a = str.substring(0,1).toUpperCase() + str.substring(1);
  System.out.println(a);
  scan.close();
 }
}