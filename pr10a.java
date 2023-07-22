import java .io.*;
import java .util.*;


class pr10a

{
	public static void main(String arg[])
	{
		Character c=new Character('A');
		System.out.println("Character  :" +c);
		System.out.println("is lower Character  :" +Character.isLowerCase(c));
			System.out.println("is upper Character  :" +Character.isUpperCase(c));
			System.out.println("is digit :" +Character.isDigit(c));
	System.out.println("to lower Character  :" +Character.toLowerCase(c));
	}

}