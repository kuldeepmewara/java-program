class main{

	main()
	{
		System.out.println("default constructor");
	}
	main(String arg[])
	{
		System.out.println("argu constructor");
	}
	public static void main(String arg[])
	{
		System.out.println();
	
		System.out.println("executable main...");
        	new main();
		new main(arg);
		System.out.println();
	}

}