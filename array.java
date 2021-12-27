import java.util.*;
class array
{
 public static void main(String args[])
 {
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int marks[] = new int[n];
  double avg;
  double sum;
  for(int i=0;i<n;i++)
  {
   marks[i] = scan.nextInt(0);
   sum = sum + marks[i];
  }
  avg =sum/n;
  System.out.println("Average is " + avg);
  scan.close();
 }
}

   