import java.util.Scanner;
class StringManip
{
	String s;
	StringManip(String n)
	{
		s=n;
	}
	void case_change()
	{
		System.out.println("modify string is:");
		char a[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			a[i]=s.charAt(i);
			if(a[i]<97)
			{
				a[i]=(char)((int)a[i]+32);
			}
			else
			{
				a[i]=(char)((int)a[i]-32);
			}
			System.out.print(a[i]);
		}
		System.out.println();
	}
	void reverse()
	{
		System.out.println("reverse string is:");
		for(int i=s.length()-1;i!=-1;i--)
		{
		System.out.print(s.charAt(i));	
		}
		System.out.println();
	}
	boolean compare(StringManip st)
	{
	    if(s.length()!=st.s.length())
		{
			return false;
		}
		else
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==st.s.charAt(i))
				{
					count++;
				}
			}
			return(count==s.length());
			
		}
	}
	void join(StringManip str)
	{
		String w=s+str.s;
		System.out.println("the new string is:"+w);
		
	}
	
}
class demo
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String a=s.nextLine();
		StringManip d=new StringManip(a);
		d.case_change();
		d.reverse();
		System.out.println("enter the string which is to be compared with the previous string:");
		String b=s.nextLine();
		StringManip t=new StringManip(b);
		if(d.compare(t))
		{
			System.out.println("both the strings are equal");
		}
		else
		{
			System.out.println("both the strings are unequal");
		}
		System.out.println("enter the string which is to be insert:");
		String p=s.nextLine();
		StringManip z=new StringManip(p);
		d.join(z);
	}
	
}