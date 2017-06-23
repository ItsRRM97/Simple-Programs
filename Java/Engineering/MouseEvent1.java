import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
  <applet code="AddColors" width=400 height=60>
  </applet>
*/

public class MouseEvent1 extends JApplet
{
  JButton b1;
  JPanel p1;
  JTextField t1;
  public void init()
  {
	  t1=new JTextField(10);

	  p1=new JPanel();
	  getContentPane().add(p1);

      b1=new JButton("Click Me");
      inner1 obj=new inner1();

      b1.addMouseListener(obj);
      t1.addMouseListener(obj);
      p1.add(b1);
      p1.add(t1);
  }
  class inner1 implements MouseListener
  {
  public void mouseClicked(MouseEvent ie)
  {
      System.out.println("Mouse Clicked");
	  getAppletContext().showStatus("Mouse Clicked");
  }
  public void mouseEntered(MouseEvent ie)
  {
      System.out.println("Mouse Entered");
  	  getAppletContext().showStatus("Mouse Entered");
  }
  public void mouseExited(MouseEvent ie)
  {
      System.out.println("Mouse Exited");
  	  getAppletContext().showStatus("Mouse Exited");
  }
  public void mousePressed(MouseEvent ie)
  {
      System.out.println("Mouse Pressed");
  	  getAppletContext().showStatus("Mouse Pressed");
  }
  public void mouseReleased(MouseEvent ie)
  {
      System.out.println("Mouse Released");
  	  getAppletContext().showStatus("Mouse Released");
  }
}//end of inner

}