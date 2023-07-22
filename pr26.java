import java.io.*;
class pr26
{
	public static void main(String arg[])
	{
		File infile=new File("in.txt");
		File outfile=new File("out.txt");

		FileReader ins=null;
		FileWriter outs=null;

		try
		{
			ins=new FileReader(infile);
			outs=new FileWriter(outfile);
			int ch;
			while((ch=ins.read())!=-1)
			{
				outs.write(ch);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(-1);
		}
		finally
		{
			try
			{
			ins.close();
			outs.close();
			}
			catch(IOException e)
			{
			
			}
		
		}
	}

}