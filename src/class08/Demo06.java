package class08;
import java.awt.*;
import javax.swing.*;
public class Demo06 extends JFrame{
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public Demo06() {
		jp1=new JPanel();
		jp2=new JPanel();
		jb1=new JButton("西瓜");
		jb2=new JButton("荔枝");
		jb3=new JButton("芒果");
		jb4=new JButton("榴莲");
		jb5=new JButton("苹果");
		jb6=new JButton("橙子");
		//向面板里面添加button;
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		 //向布局管理器中添加button/panel;
		this.add(jp1,BorderLayout.NORTH);
		this.add(jb6, BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);
		this.setTitle("面版布局实例");
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
