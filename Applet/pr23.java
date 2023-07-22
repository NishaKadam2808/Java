import java.applet.*;
import java.awt.*;
public class pr23 extends Applet
{
	int x[]={20,120,220,30,20};
	int y[]={20,120,20,40,20};
	int n=4;
	public void paint(Graphics g)
	{
		g.drawPolygon(x,y,n);
	}

}
/*<applet code = "pr23.class" width=3000 height=4000></applet>*/