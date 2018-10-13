import javax.swing.*;
class LoginPage extends JFrame
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p;
	JButton b1,b2;
	LoginPage()
	{
		setSize(400,300);
		l1=new JLabel("User Name");
		l2=new JLabel("Password");
		t1=new JTextField(90);
		p=new JPasswordField(90);
		b1=new JButton("Log In");
		b2=new JButton("Sign Up");
		setTitle("LoginPage");
		setLayout(null);
		l1.setBounds(80,70,90,30);
		t1.setBounds(190,70,60,30);
		l2.setBounds(80,110,90,30);
		p.setBounds(190,110,60,30);
		b1.setBounds(80,150,100,30);
		b2.setBounds(190,150,100,30);
		add(l1);
		add(t1);
		add(l2);
		add(p);
		add(b1);
		add(b2);
		setLocation(100,100);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		LoginPage ob=new LoginPage();
	}
}