import java .util.*;
public class Fibanocii{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
      System.out.print(a);
      System.out.print(" "+b);
     for(int i=2; i<n;i++)
     {
        int c = a+b;
        System.out.print(" "+c);
        a=b;
        b=c;
     }   
    }
}