package class08;
import java.awt.*;
import javax.swing.*;
public class Demo06 extends JFrame{
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public Demo06() {
		jp1=new JPanel();
		jp2=new JPanel();
		jb1=new JButton("����");
		jb2=new JButton("��֦");
		jb3=new JButton("â��");
		jb4=new JButton("����");
		jb5=new JButton("ƻ��");
		jb6=new JButton("����");
		//������������button;
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		 //�򲼾ֹ����������button/panel;
		this.add(jp1,BorderLayout.NORTH);
		this.add(jb6, BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);
		this.setTitle("��沼��ʵ��");
		this.setVisible(true);
		this.setLocation(200, 200);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args)
	{
		Demo06 demo06=new Demo06();
	}
}
