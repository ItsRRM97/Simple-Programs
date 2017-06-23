package mypack;

class DisplayClass
{
	public void displayText()
	{
		System.out.println("Displaying Text");
	}
}

class hello
{
	public static void main(String args[])
	{
			DisplayClass obj=new DisplayClass();
			obj.displayText();
	}
}
// put this file in a directory called mypack.
// compile it
// Remember when calling java hello, you need to be
// in the directory above mypack or to have your
// CLASSPATH environmental variable set appropriately.
//	and call like..
// java mypack.hello

// As explained, hello is now the part of the package
// mypackage. This means that it cannot be executed
// by itself. That is you cannot use this command line:
// java hello
// hello must be qulified with its package name.