import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
  <applet code="AddColors" width=400 height=60>
  </applet>
*/

public class MouseEventAgainInner extends JApplet
{
  JButton b1;
  JPanel p1;

  public void init()
  {
	  p1=new JPanel();
	  getContentPane().add(p1);

      b1=new JButton("Click Me");
      //MouseAdapter obj=new MouseAdapter(this);
      hello obj=new hello();
      b1.addMouseListener(obj);

      p1.add(b1);
  }
	//inner class
	class hello extends MouseAdapter
	{
		//MouseEventAgain obj;
		//public hello(MouseEventAgain obj)
		//{
			//this.obj=obj;
		//}
		 public void mouseClicked(MouseEvent ie)
	 	 {
	      System.out.println("Mouse Clicked");
  	  	}
	}

}




