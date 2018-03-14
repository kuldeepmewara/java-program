class MultipleMain
{
	public static void main()
	{
		System.out.println("no argument");
	}
	public static void main(String arg)
	{
		System.out.println("one string argument");
	}
	public static void main( String...arg)
	{
		System.out.println("array of string argument");
	}
}