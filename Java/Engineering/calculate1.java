import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class calculate1 extends JApplet
{
	JLabel l1,l2,l3;
	JButton a,s,m,r;
	JTextField t1,t2,t3;
	JPanel p1;

	public void init()
	{

		l1=new JLabel("Enter the First Number:");
		l2=new JLabel("Enter the Second Number:");
		l3=new JLabel("result:");

		a=new JButton("Add");
		s=new JButton("subtract");
		m=new JButton("multiply");
		r=new JButton("reset");

		p1=new JPanel();
		p1.setLayout(null);
		getContentPane().add(p1);

		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);

		l1.setBounds(100,100,145,20);    p1.add(l1);
		l2.setBounds(90,130,150,20);  	 p1.add(l2);
		l3.setBounds(100,160,140,20);  	 p1.add(l3);
		t1.setBounds(250,100,30,20);     p1.add(t1);
		t2.setBounds(250,130,30,20);     p1.add(t2);
		t3.setBounds(250,160,70,20);     p1.add(t3);
		a.setBounds(320,100,60,20);      p1.add(a);
		s.setBounds(390,100,90,20);      p1.add(s);
		m.setBounds(490,100,90,20);      p1.add(m);
		r.setBounds(410,130,70,20);      p1.add(r);

		inner obj1=new inner();
		a.addActionListener(obj1);
		s.addActionListener(obj1);
		m.addActionListener(obj1);
		r.addActionListener(obj1);

	}

	class inner implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String n1;
			Object obj=e.getSource();
			if(obj==a)
			{
				n1=String.valueOf(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText()));
				t3.setText(n1);
			}
			if(obj==s)
			{
				n1=String.valueOf(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText()));
				t3.setText(n1);
			}
			if(obj==m)
			{
				n1=String.valueOf(Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText()));
				t3.setText(n1);
			}
			if(obj==r)
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
			//void accept()
			//{

			//	n1=Integer.parseInt(t1.getText());
			//	n2=Integer.parseInt(t2.getText());
			//}
		}
	}

}
