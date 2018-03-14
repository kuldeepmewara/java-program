import java.util.Vector;
class Sample
{
 private int val;
 Sample(){}
 Sample(int val)
 {
  this.val=val;
  System.out.println("creating objects : "+val);
 }
 
 public String toString()
 {
  return val+"";
 }
 protected void finalize()
 {
  RestoreObjects.vct.add(this);					//(add) function in vector class
 }
}
class RestoreObjects
{
 static Vector <Sample>vct=new Vector<Sample>();                                   //vct is static so we can call using class name
 public static void main(String...args) throws InterruptedException
 {
  Sample a,b,c;
  a=new Sample(1); 
  new Sample(2);
  b=new Sample(3);
  int n=10;
  if(n>5)
  {
   c=new Sample(2);
   Sample d=new Sample(5);
  }
  a=new Sample(6);
  System.gc();
  Thread.sleep(50);
  System.out.println("\nRestored objects - \n");
  for(int i=0;i<vct.size();i++)
  {
   System.out.println("Object  "+(i+1)+" : "+vct.get(i));
  }
  System.out.println();
 }
} 