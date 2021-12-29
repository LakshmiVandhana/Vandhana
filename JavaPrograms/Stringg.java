import java.util.*;
class Stringg
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner (System.in);
  String str = scan.nextLine();
  String a = str.substring(0,1).toUpperCase() + str.substring(1);

  int n = scan.nextInt();
  for(int i=0;i<str.length();i++)
  System.out.println(a);
  scan.close();
 }
}