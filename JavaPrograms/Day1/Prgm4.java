import java.util.Scanner;
class Prgm4
{
 public static void main(String args[])
 {
  Scanner scan=new Scanner(System.in);
  for(int i=0;i<3;i++)
  {
   String s1=scan.next();
   String x=scan.next();
   if((x.length())>=3)
   {
    System.out.println(s1+"\t\t"+x);
   }
   else if((x.length())==2)
   {
    System.out.println(s1+"\t\t"+"0"+x);
   }
   else
   {
    System.out.println(s1+"\t\t"+"00"+x);
   }
  }
   scan.close();
 }
}