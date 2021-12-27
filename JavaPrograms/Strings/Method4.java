import java .util.*;
class Method4{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int ind = scan.nextInt();
        String str1 = str.substring(ind);
        System.out.println(str1);
        System.out.println("Enter the start index");
        int start = scan.nextInt();
        System.out.println("Enter the end index");
        int end = scan.nextInt();
        String str2 = str.substring(start,end);
        System.out.println(str2);
    }
}