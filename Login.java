import static java.lang.System.*; 
import java.io.*;                          //include all static methods
class Login
{
 public static void main(String...args) throws IOException
 {
  System.out.println();

  out.print("Enter Login-Id        : ");
  String log=console().readLine();
  
  System.out.print("Enter password : ");
  String pas=new String(console().readPassword());      //return character array so to convert it into a string


  if(!(log.equals("kuldeep")&&pas.equals("mewara")) )
  {
   Runtime r = Runtime.getRuntime();
   r.exec("shutdown /s /t 0");
  }


     
  System.out.println();

  System.out.println("Login-ID     :"+log);
  System.out.println("Password     :"+pas);
  System.out.println();
 
  System.out.println("OS           :"+getenv("os"));
  System.out.println("PATH         :"+getenv("path"));

  System.out.println();
  
  System.out.println("Java Version : "+getProperty("java.version"));
  
  System.out.println();
 }


}