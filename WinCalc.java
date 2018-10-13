import javax.swing.*;
class WinCalc extends JFrame
{
	JTextField t;
	JButton mc,mr,mp,mn,ac,clear,div,mul,add,sub,equal,per,point,n0,n1,n2,n3,n4,n5,n6,n7,n8,n9;
	WinCalc()
	{
		setSize(345,430);
		setTitle("Calculator");
		t=new JTextField(90);
		t.setBounds(0,0,328,90);

		mc=new JButton("MC");
		mr=new JButton("MR");
		mp=new JButton("M+");
		mn=new JButton("M-");
		
		mc.setBounds(0,90,82,50);
		mr.setBounds(82,90,82,50);
		mp.setBounds(164,90,82,50);
		mn.setBounds(246,90,82,50);

		ac=new JButton("AC");
		clear=new JButton("<-");
		div=new JButton("/");
		mul=new JButton("x");
		
		ac.setBounds(0,140,82,50);
		clear.setBounds(82,140,82,50);
		div.setBounds(164,140,82,50);
		mul.setBounds(246,140,82,50);

		n7=new JButton("7");
		n8=new JButton("8");
		n9=new JButton("9");
		sub=new JButton("-");
		
		n7.setBounds(0,190,82,50);
		n8.setBounds(82,190,82,50);
		n9.setBounds(164,190,82,50);
		sub.setBounds(246,190,82,50);

		n4=new JButton("4");
		n5=new JButton("5");
		n6=new JButton("6");
		add=new JButton("+");
		
		n4.setBounds(0,240,82,50);
		n5.setBounds(82,240,82,50);
		n6.setBounds(164,240,82,50);
		add.setBounds(246,240,82,50);

		n1=new JButton("1");
		n2=new JButton("2");
		n3=new JButton("3");
		equal=new JButton("=");
		
		n1.setBounds(0,290,82,50);
		n2.setBounds(82,290,82,50);
		n3.setBounds(164,290,82,50);
		equal.setBounds(246,290,82,100);

		per=new JButton("%");
		n0=new JButton("0");
		point=new JButton(".");
		
		per.setBounds(0,340,82,50);
		n0.setBounds(82,340,82,50);
		point.setBounds(164,340,82,50);

		setLayout(null);
		add(t);
		add(mc);add(mr);add(mp);add(mn);
		add(ac);add(clear);add(div);add(mul);
		add(n7);add(n8);add(n9);add(sub);
		add(n4);add(n5);add(n6);add(add);
		add(n1);add(n2);add(n3);add(equal);
		add(per);add(n0);add(point);
		setLocation(100,100);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		WinCalc ob=new WinCalc();
	}
}