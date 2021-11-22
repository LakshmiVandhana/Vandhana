class Lion
{
  double weight;
  String colour;
  double height;
  String nickname;
  public Lion(double weight,String colour,double height,String nickname)
  {
   this.weight= weight;
   this.colour= colour;
   this.height= height;
   this.nickname= nickname;
  }
}
public class Bigcat
{
 public static void main(String args[])
 {
  Lion l=new Lion(156.6,"Greyish yellow",4.5,"Aslan");
  System.out.println(l.colour);
  System.out.println(l.weight);
  System.out.println(l.height);
  System.out.println(l.nickname);
 }
}

  