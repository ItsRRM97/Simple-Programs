import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
  <applet code="AddColors" width=400 height=60>
  </applet>
*/

public class Anony extends JApplet
{
  JButton b1;
  JPanel p1;

  public void init()
  {
	  p1=new JPanel();
	  getContentPane().add(p1);

      b1=new JButton("Click Me");
      p1.add(b1);

      b1.addMouseListener(new MouseAdapter()
      {
		   public void mouseClicked(MouseEvent ie)
		   {
		  	    System.out.println("Mouse Clicked");
  	  	   }
	  }

	  );
  }
}









