class Array5
{

	static public  void  main(String args[])
	{
		int GT=0;
		int odd=0;
		int even=0;
		int oddsum=0;
		int evensum=0;

		for(int i=0; i<args.length; i++)
		{
			int x=Integer.parseInt(args[i]);
			if( x % 2 ==0)
			{
				even++;
				evensum = evensum + x;
			}
			else
			{
				odd++;
				oddsum = oddsum + x;
			}
		}//end of for
		GT= oddsum + evensum;

		System.out.println("The no of odd  is " +odd);
		System.out.println("The no of even is " +even);
		System.out.println("The Sum of odd is " +oddsum);
		System.out.println("The Sum of even is " +evensum);
		System.out.println("The Grand Total  is " +GT);

	}
}