import java .io.*;
import java .util.*;
class Comp
{
	int a,b;
	
	Comp()
	{
		a=10;
		b=20;
	}
	Comp(int l,int n)
	{
		a=l;
		b=n;
	}
	Comp(Comp a1,Comp a2)
	{
		System.out.println("Addition :");
		System.out.println((a1.a+a2.a)+"+"+(a1.b+a2.b)+"i");
	}
}

class pr5
{
	public static void main(String arg[])
	{
		Comp a1=new Comp();
		Comp a2=new Comp(30,40);
		Comp a3=new Comp(a1,a2);		
	}

}