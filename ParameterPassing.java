import java .awt.*;
import java.applet.*;

class ParameterPassing
{
   String msg;
public void init()
{
   msg=getParameter("name");
}
public void paint(Graphics g)
{
  g.drawString(msg,100,200);
}
}
/* <applet code="ParameterPassing.class" height=200 width=200><param name="name" value="rutika"></applet>*/