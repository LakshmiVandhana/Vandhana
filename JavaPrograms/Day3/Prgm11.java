import java.util.*;
import java.text.*;
class Prgm11
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    double payment = scan.nextDouble();
    scan.close();
    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    String india= NumberFormat.getCurrencyInstance(new Locale ("en","INDIA")).format (payment);
    String china= NumberFormat.getCurrencyInstance(Locale.CHINA).format (payment);
    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
    System.out.println("US: " +us);
    System.out.println("India: " +india);
    System.out.println("China: " +china);
    System.out.println("France: " +france);
  }
}