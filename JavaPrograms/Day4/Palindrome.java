import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String revstr= (new StringBuffer(str)).reverse().toString();
        System.out.println(revstr);
        if(str.equalsIgnoreCase(revstr)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}