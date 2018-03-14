class Sample
{
 private int val;
 private static int cnt;   

 private Sample(int val)
 {
  this.val=val;
 }

 static Sample getObject()
 { 
  Sample s=null;	    
  if(cnt<3)
  {  
   cnt++;
   s=new Sample(cnt);
  }
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

class LimitedObject
{
 public static void main(String...args)
 {
  Sample s1,s2,s3,s4,s5;

  s1=Sample.getObject();
  s2=Sample.getObject();
  s3=Sample.getObject();
  s4=Sample.getObject();
  s5=Sample.getObject();
  
  System.out.println();  
  System.out.println("s1 : "+s1);
  System.out.println("s2 : "+s2);
  System.out.println("s3 : "+s3);
  System.out.println("s4 : "+s4);
  System.out.println("s5 : "+s5);

  s1.set(11);
  s2.set(12);
  s3.set(13);

  System.out.println();
  System.out.println("s1 : "+s1);
  System.out.println("s2 : "+s2);
  System.out.println("s3 : "+s3);
  System.out.println("s4 : "+s4); 
  System.out.println();
 }
}