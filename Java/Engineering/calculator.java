import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class calculator extends JApplet
{
	JTextField t1,t2;
	JButton b[],reset;
	JPanel p1;
	String s[]={"1","2","3","+","4","5","6","-","7","8","9","*","/","0","%","="};

	public void init()
	{
		t1=new JTextField(20);
		t2=new JTextField(20);

		p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.cyan);
		getContentPane().add(p1);

		t1.setBounds(300,100,100,20);
		t1.setBackground(Color.cyan);
		t1.setText("CALCULATOR");
		t1.setForeground(Color.blue);
		t1.setEditable(false);
		p1.add(t1);

		t2.setBounds(400,100,100,20);
		t2.setEditable(false);
		p1.add(t2);

		b=new JButton[16];
		reset=new JButton("OFF");
		int i=0;
		for(int j=120;j<200;j+=20)
		{
			for(int k=300;k<500;k+=50)
			{
				b[i]=new JButton(s[i]);
				b[i].setBounds(k,j,50,20);
				p1.add(b[i]);
				i++;
			}
		}
		reset.setBounds(350,200,100,20);
		p1.add(reset);

		inner obj1=new inner();
		for(int n=0;n<16;n++)
		{
			b[n].addActionListener(obj1);
		}
		reset.addActionListener(obj1);
	}

	class inner implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Object obj=e.getSource();
			System.out.print(obj);

			if(obj==b[0])
			{

				t2.setText(t2.getText()+"1");
			}
			if(obj==b[1])
			{
				t2.setText(t2.getText()+"2");
			}
			if(obj==b[2])
			{
				t2.setText(t2.getText()+"3");
			}
			if(obj==b[3])
			{
				accept();
				t2.setText(t2.getText()+"+");
			}
			if(obj==b[4])
			{
				t2.setText(t2.getText()+"4");
			}
			if(obj==b[5])
			{
				t2.setText(t2.getText()+"5");
			}
			if(obj==b[6])
			{
				t2.setText(t2.getText()+"6");
			}
			if(obj==b[7])
			{
				accept();
				t2.setText(t2.getText()+"-");
			}
			if(obj==b[8])
			{
				t2.setText(t2.getText()+"7");
			}
			if(obj==b[9])
			{
				t2.setText(t2.getText()+"8");
			}
			if(obj==b[10])
			{
				t2.setText(t2.getText()+"9");
			}
			if(obj==b[11])
			{
				accept();
				t2.setText(t2.getText()+"*");
			}
			if(obj==b[12])
			{
				accept();
				t2.setText(t2.getText()+"/");
			}
			if(obj==b[13])
			{
				t2.setText(t2.getText()+"0");
			}
			if(obj==b[14])
			{
				accept();
				t2.setText(t2.getText()+"%");
			}
			if(obj==b[15])
			{
				accept();
				//t2.setText(t2.getText()+"=");
			}
			if(obj==reset)
			{
				t2.setText("");
			}

		}


	}

	public void accept()
	{
		int a,a1,a2=0;
		String s,s1,s2;
		s=t2.getText();
		char t[]=s.toCharArray();
		a=s.length();
		for(a1=0;a1<a;a1++)
		{
			if(t[a1]=='+'||t[a1]=='-'||t[a1]=='*'||t[a1]=='/'||t[a1]=='%')
			{
				a2=a1;
			}
		}
		s1=String.copyValueOf(t,0,a2);
		s2=String.copyValueOf(t,a2+1,(a-1)-a2);
		if(t[a2]=='+')
		{
			t2.setText(String.valueOf((Integer.parseInt(s1))+(Integer.parseInt(s2))));
		}
		if(t[a2]=='-')
		{
			t2.setText(String.valueOf((Integer.parseInt(s1))-(Integer.parseInt(s2))));
		}
		if(t[a2]=='*')
		{
			t2.setText(String.valueOf((Integer.parseInt(s1))*(Integer.parseInt(s2))));
		}
		if(t[a2]=='/')
		{
			t2.setText(String.valueOf((Integer.parseInt(s1))/(Integer.parseInt(s2))));
		}
		if(t[a2]=='%')
		{
			t2.setText(String.valueOf((Integer.parseInt(s1))%(Integer.parseInt(s2))));
		}

	}
}