import java.applet.*;
import java.awt.*;
public class pr22 extends Applet
{
	public void paint(Graphics g)
	{
		int i;
		for(i=1;i<=3;i++)
		{
			if(i==1)
			{
			g.setColor(Color.red);	
			g.fillOval(120,60*i+10,50,50);
				
			}
			if(i==2)
			{
			g.setColor(Color.yellow);	
			g.fillOval(120,60*i+10,50,50);
				
			}
			if(i==3)
			{
			g.setColor(Color.green);	
			g.fillOval(120,60*i+10,50,50);
				
			}
		}
	}

}
/*<applet code = "pr22.class" width=3000 height=4000></applet>*/