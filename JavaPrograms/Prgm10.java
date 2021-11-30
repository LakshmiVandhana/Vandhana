import java.util.*;
class Prgm10
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String s = Integer.toString(n);
    if(n>=-100 && n<=100)
    {
      if(s.equals(Integer.toString(n)))
      {
        System.out.println("Good Job");
      }
    }
    else
    System.out.println("wrong answer");
  }
}