import java .io.*;
import java .util.*;


class pr6
{
	public static void main(String arg[])
	{
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		sb.delete(1,2);
		System.out.println(sb);
		sb.replace(0,1,"WO");
		int l=sb.length();
		System.out.println(l);
	}

}