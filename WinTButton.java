import javax.swing.*;
class WinTButton extends JFrame
{
	JButton b1,b2;
	WinTButton()
	{
		setSize(400,300);
		b1=new JButton("OK");
		b2=new JButton("Cancel");
		setTitle("TwoButtonDemo");
		setLayout(null);
		b1.setBounds(100,70,100,30);
		b2.setBounds(220,70,100,30);
		add(b1);
		add(b2);
		setLocation(100,100);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		WinTButton ob=new WinTButton();
	}
}