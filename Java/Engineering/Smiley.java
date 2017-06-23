import java.awt.*;
import java.applet.*;
 
public class Smiley extends Applet
    {   
        public void paint(Graphics g)
        {
                g.drawString("Smiley Face", 50, 30);
                g.drawOval(60, 60, 200, 200);
                g.drawOval(90, 120, 50, 20);
                g.drawOval(190, 120, 50, 20);
                g.fillOval(100,130,20,10);
                g.fillOval(200, 130, 20, 10);
                g.drawLine(165, 125, 165, 175);
                g.drawArc(110, 130, 95, 95, 0, -180);
        }
}