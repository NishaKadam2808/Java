import java .io.*;
import java .util.*;


class pr9
{
	public static void main(String arg[])
	{ 
		int i;
		Vector v=new Vector();
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		System.out.println("Size: "+v.size());
v.removeElementAt(1);
		System.out.println("Ele: ");
		for(i=0;i<=v.size();i++)
		{
			System.out.println(v.get(i));
		}
		
		
		/*for(i=0;i<=v.size();i++)
		{
			System.out.println("after remove"+v.get(i));
		}*/
	}

}