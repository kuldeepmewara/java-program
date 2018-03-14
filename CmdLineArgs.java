class CmdLineArgs
{
	
	public static void main( String args[])
	{
		System.out.println("\n count of arguments :  "+args.length);
	
		for(int i=0;i<args.length;i++)
		{
			System.out.printf("\narguments #%d :%s",i+1,args[i]);
		}
	}
}