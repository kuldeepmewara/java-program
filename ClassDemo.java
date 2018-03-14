class  Complex
{
	private float real;
	float imag;
		void set(double real,double imag)
		{
			this.real=(float)real;
			this.imag=(float)imag;
			print();
		}
		void print()
		{
			System.out.println("["+real+","+imag+"i]");
		}		
}
class ClassDemo
{
	public static void main(String...arg)
	{
		//real=1;
		//set(1,2);
		System.out.println();
		Complex x,y;
		x=new Complex();
		y=new Complex();
		//x.real=1;
		y.imag=20;
		y.set(1.5,2.6);
		System.out.print("x : ");
		x.print();
		System.out.print("y : ");
		y.print();
		System.out.println();
	}
}