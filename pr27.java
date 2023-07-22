import java.io.*;
class pr27
{
	public static void main(String arg[]) throws IOException
	{

		byte b[]=new byte[100];
		System.out.println("Enter the text to be saved : ");
		int bytes=System.in.read(b);

		FileOutputStream fo=new FileOutputStream("sample6.txt");
		fo.write(b,0,bytes);
		System.out.println("Successfully saved .... ");
		fo.close();		
	}


}