import java.io.*;
import java.util.*;
class a extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{

			System.out.println(i);
		}
	}
}
class b extends Thread
{
	public void run()
	{
		for(int i=5;i>=0;i--)
		{

			System.out.println(i);
		}
	}
}
class pr18
{
	public static void main(String arg[])
	{
		b b1=new b();
		a a1=new a();
		a1.start();
		b1.start();
	}	


}