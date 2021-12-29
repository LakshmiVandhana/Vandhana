import java.util.*;
public class Primenumbers{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for(int j=1;j<=n;j++){
      int count = 0;
        for(int i=1;i<=j;i++){
          if(j%i == 0){
            count = count+1;
          }
        }
          if(count == 2)
          {
           System.out.print(j + " ");
          }    
    }
    }
}