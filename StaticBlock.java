class Sample
{
 int n;
 static int x=10;

 Sample(){}

 Sample(int n)
 {
  System.out.println("\ninside constructor");
  System.out.println("n : "+this.n);
  System.out.println("x : "+x);
 }   

 static void show()
 {
  System.out.println("\ninside show...");
  //System.out.println("n : "+n);   		//cant access non static inside aq static function
  System.out.println("x : "+x);
 }
  
 static
 {
  System.out.println("\ninside static block...");
  //System.out.println("n : "+n);   		//cant access non static inside aq static function
  System.out.println("x : "+x);
  x=100;
 }

}

class StaticBlock
{
 public static void main(String...args) throws ClassNotFoundException
 {
  Sample s;              //creating a refrence does not invoke static block
  //  Sample.show(); 	//static block invoked first and then show()
  //System.out.println("\nmain -x : "+Sample.x);
  /*
  Sample.x=1000;			//invoke static block 
  System.out.println("x : "+Sample.x);
  */
	
  new Sample(2);			//first static block then constructor
  Class.forName("Sample");
  System.out.println();



 }



}