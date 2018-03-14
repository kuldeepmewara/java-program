class Sample
{
 static int n;
 static
 {
  System.out.println("static - 1");
  System.out.println("n :"+n);
 }

 {
  System.out.println("initialiser - 1");
  System.out.println("n :"+n);
 }

 Sample()
 {
  System.out.println("default constructor");
  n=10;
  System.out.println("n :"+n);
  
 }

 static
 {
  System.out.println("static - 2");
 }
 
 {
  System.out.println("initialiser - 2");
 }
 
  Sample(int n)
 {
  System.out.println("parameterised onstructor");
  System.out.println("n :"+n);
 }

}


class InitialiserBlock
{
 public static void main(String...args)
 {
  Sample s,s1;
  System.out.println();
  s=new Sample(100);
  System.out.println();
  s1=new Sample();
  System.out.println(); 
  System.out.println("n :"+Sample.n);
 }
}