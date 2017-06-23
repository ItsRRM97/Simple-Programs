import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class student extends JApplet implements ActionListener
{
	JButton b1,b2;
	JPanel p1;

	public void init()
	{
		b1 =new JButton("RED");
		b2 =new JButton("PINK");

		p1=new JPanel();

		getContentPane().add(p1);

		p1.setBackground(Color.yellow);
		b1.addActionListener(this);
		b2.addActionListener(this);

		p1.add(b1);
		p1.add(b2);
	}//end of init
	//start of imple
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();

		if(obj==b1)
		{
			p1.setBackground(Color.red);
		}
		else
		{
			p1.setBackground(Color.pink);
		}
	}
}