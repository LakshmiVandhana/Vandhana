import java.util.*;
import java.io.*;
class Anagrams
{
  public static void main(String args[])
  {
   Scanner scan = new Scanner(System.in);
   String A = scan.next();
   String B = scan.next();
   boolean c = false;
   scan.close();
   if(A.length() == B.length())
   {
     for(int i=1;i<A.length();i++)
     { 
      for(int j=1;j<B.length();j++)
      {
       if(A.substring(i) == B.substring(j))
       {
        c=true;
       }
      }
     }
   }
    if(c == true)
    {
      System.out.println("Anagrams");
    }
    else{
     System.out.println("Not an anagram");
    }
  }
}