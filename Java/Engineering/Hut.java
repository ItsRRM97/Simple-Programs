import java.awt.*;
public class Hut extends java.applet.Applet
{
public void paint(Graphics g)
{
g.drawLine(100,400,300,400);
g.drawLine(100,400,70,450);
g.drawLine(300,400,350,450);
g.drawLine(300,400,250,450);
g.drawLine(70,450,350,450);
g.drawLine(70,450,70,600);
g.drawLine(250,450,250,600);
g.drawLine(350,450,350,600);
g.drawLine(70,600,350,600);
g.drawRect(100,500,90,100);
g.drawRect(265,500,50,50);
}
}