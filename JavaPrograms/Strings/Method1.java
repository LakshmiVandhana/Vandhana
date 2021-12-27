import java.util.*;
public class Method1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int a = scan.nextInt();
        char ch = str.charAt(a);
        System.out.println(ch);
        scan.close();
    }
}