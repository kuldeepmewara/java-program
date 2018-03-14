public class InitialiserCheck
{
 private int x;
 {
 System.out.println("x : "+x);
 x=10;
 }
 public InitialiserCheck()
 {
  System.out.println("inside constructor ");
 }
 public static void main(String...args)
 {
  InitialiserCheck s1 ,s2;
  s1=new InitialiserCheck();
  System.out.println("x : "+s1.x);
  s1.x=12;
  System.out.println("x : "+s1.x);
  s2=new InitialiserCheck();
  
 }

}
