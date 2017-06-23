import javax.swing.*;
import java.awt.*;

public class face extends JApplet
{
	public void paint(Graphics g)
	{
		g.drawOval(93,49,215,250);
		g.drawOval(145,130,40,50);
		g.drawOval(230,130,40,50);

		g.drawArc(135,120,60,60,0,180);
		g.drawArc(220,120,60,60,0,180);
		g.drawArc(175,200,70,50,180,180);

		g.fillOval(190,150,25,30);
		g.fillOval(295,150,25,30);
		Font obj=new Font("Ariel",Font.BOLD,30);
		g.setFont(obj);
		g.drawString("SMILE",150,350);


		//g.drawLine(100,100,900,300);
	}
}