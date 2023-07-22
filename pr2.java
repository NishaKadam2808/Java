import java .io.*;
import java .util.*;
class pr2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char : ");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
			case 'A' : System.out.println("a : "); break;
			case 'B' : System.out.println("b : "); break;
			default : System.out.println("Invalid: ");	break;		
		}
		System.out.println("your choice :"+ch); 
	}

}