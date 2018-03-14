import java.util.Scanner;

class ScannerDemo
{
 public static void main(String...args)
 {
  Scanner sc=new Scanner(System.in);
  int age; 
  String name;
  long l;
  float basic;
  double d;
  String s;
  
  System.out.println();

  System.out.print("enter long   :");
  l=sc.nextLong();
  
  System.out.print("ENTER DOUBLE :");
  d=sc.nextDouble();
 
  System.out.print("ENTER NAME   : ");
  name=sc.next();
  
  System.out.print("ENTER AGE    : ");
  
  while(!sc.hasNextInt())
  {
   name=name+" "+sc.next();
  }
  
  age=sc.nextInt();
  
  System.out.print("ENTER BASIC   : ");
  basic=sc.nextFloat();
  
  sc.useDelimiter(":");
  System.out.print("enter string   :");
  s=sc.next();
  

  System.out.println();
  while(true)
  {
   System.out.println(s);
   if(sc.hasNext())
     s=sc.next();
   else
     break;
  }
  
  System.out.println("string       :"+s);
  System.out.println("double       :"+d);
  System.out.println("NAME         : "+name);
  System.out.println("long         :"+l);
  System.out.println("AGE          : "+age);
  System.out.println("BASIC        : "+basic);
  
  System.out.println();
   
}


}