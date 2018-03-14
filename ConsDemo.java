class Complex
{
	private float real,imag;
	
	Complex()
	{
	 this(10);
	}
	Complex(double n)
	{
	 this(n,n);
	}
	Complex(Complex c)
	{
	 this(c.real,c.imag); 
	}
	Complex(double real,double imag)
	{
	 this.real=(float)real;
	 this.imag=(float)imag;
	}
	void set(double real,double imag)
	{
	 this.real=(float)real;
	 this.imag=(float)imag;
	}
	public String toString()
	{
	 return "["+real+","+imag+"i]";
	}
}
class ConsDemo
{
	public static void main(String...arg)
	{
	 Complex x,y,z,k;
	 x=new Complex(1.5,2.0);
	 y=x;				//Shallow copy
	 z=new Complex(x);		//Deep copy
	 System.out.println();
	 System.out.println("x : "+x);
	 System.out.println("y : "+y);
	 System.out.println("z : "+z);
	 System.out.println();
	 x.set(11,21);
	 y.set(21,22);
	 z.set(31,32);
	 System.out.println("x : "+x);
	 System.out.println("y : "+y);
	 System.out.println("z : "+z);
	 System.out.println();
	 z.set(100,320);
	 k=z;
 	 System.out.println("x : "+x);
	 System.out.println("y : "+y);
	 System.out.println("z : "+z);
	 System.out.println("k : "+k);

	 System.out.println();
	 
	}
}