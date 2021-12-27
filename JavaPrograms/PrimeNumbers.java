import java.util.*;
class PrimeNumbers
{
 public static void main(String args[])
 {
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   boolean prime = false;
   for(int i=2;i<n;i++)
   {
     if(n%n==0 && n%1==0 && n%i!=0)
     {
       prime=false;
       break;
     }
   }
     if(prime=false)
     {
       System.out.println(n + "is a primenumber");
     }
     else
     {
      System.out.println(n + "is not a primenumber");
     }
 }
} 