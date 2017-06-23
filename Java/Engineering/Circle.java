abstract  class shape
{
	public abstract void calcArea();//no body only declaration
	public final void display()
	{
	}
}
class Rectangle extends shape
{
	int len=5;
	int bre=6;
	public void calcArea()
	{
		System.out.println(len*bre);
	}
}
class Square extends shape
{
	public void calcArea()
	{
	}
}
class Circle extends shape
{
	public void calcArea()
	{
	}
	public static void main(String args[])
	{
		Rectangle obj = new Rectangle();
		obj.calcArea();
	}
}