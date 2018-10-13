import javax.swing.*;
class ButtonDemo extends JFrame
{
	JButton b;
	ButtonDemo()
	{
		setSize(300,300);
		b=new JButton("OK");
		setTitle("OKButtonDemo");
		setLayout(null);
		b.setBounds(100,70,100,30);
		add(b);
		setLocation(100,100);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		ButtonDemo ob=new ButtonDemo();
	}
}