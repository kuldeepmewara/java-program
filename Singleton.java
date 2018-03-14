class Sample
{
 private int val;
 private static Sample s=new Sample();
 private Sample(){}
 static Sample getObject()
 {
  return s;
 }
 void set(int val)
 {
  this.val=val;
 }
 public  String toString()
 {
  return val+"";
 } 
}
class Singleton
{
 public static void main(String...args)
 {
  Sample x,y,z;
  x=Sample.getObject();
  y=Sample.getObject();
  z=Sample.getObject();
 
  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+ y);
  System.out.println("z : "+z);
  x.set(10);
  y.set(20);
  z.set(30);  

  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+ y);
  System.out.println("z : "+z); 
  System.out.println();
  
   
}

}