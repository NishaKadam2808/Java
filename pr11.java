import java .io.*;
import java .util.*;
class ICICI
{
	void interest()
	{
		System.out.println("10");
	}
}
class HDFC extends ICICI
{
	void interest()
	{
		super.interest();
		System.out.println("20");
	}
}
class pr11

{
	public static void main(String arg[])
	{
		HDFC h=new HDFC();
		h.interest();
	}

}