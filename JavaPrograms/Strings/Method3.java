import java.util.Calender;
public class Method3{
    public static void main(String[] args){
        Calender c = Calender .getInstance();
        System.out.println("Current Date and Time:");
        System.out.format("%tB %te,%tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }
}