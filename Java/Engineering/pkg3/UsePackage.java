import mypackage.DisplayClass;

public class UsePackage
{
	public static void main(String args[])
	{
		DisplayClass obj=new DisplayClass();

		String x=obj.displayText();

		System.out.println(x);
	}
}

