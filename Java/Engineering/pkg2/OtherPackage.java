package p2;

class OtherPackage
{
	OtherPackage()
	{
		p1.Protection p=new p1.Protection();
		System.out.println("other package constructor");
		//System.out.println("n = "+p.n);//same class or same package only
		//System.out.println("n_pri = "+n_pri);//same class only
		//System.out.println("n_pro = "+p.n_pro);//class, subclass or package only
		System.out.println("n_pub = "+p.n_pub);
	}
}



