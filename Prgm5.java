import java.util.Scanner;
class Prgm5
{
 public static void main(String args[])
 {
   int i;
   Scanner scan=new Scanner(System.in);
   int N = scan.nextInt();
   for(i=1;i<=10;i++)
   {
    int c = N*i;
    System.out.println( N +" *"+ i + "="+c);
   }
   scan.close();
 }
}