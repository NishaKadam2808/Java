import java .io.*;
import java .util.*;
class a
{
	void showa()
	{
		System.out.println("A");
	}

}
class b extends a
{
	void showb()
	{
		System.out.println("B");
	}

}
class c extends b
{
	void showc()
	{
		System.out.println("C");
	}

}
class pr13
{
	public static void main(String arg[])
	{
		c c1=new c();
		c1.showa();
		c1.showb();
		c1.showc();
		
	}

}