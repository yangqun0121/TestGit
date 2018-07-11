package class08;
import java.awt.*;
import javax.swing.*;
public class Demo04 extends JFrame{
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public Demo04() {
	jb1=new JButton("1");
	jb2=new JButton("2");
	jb3=new JButton("3");
	jb4=new JButton("4");
	jb5=new JButton("5");
	jb6=new JButton("6");
	this.add(jb1);
	this.add(jb2);
	this.add(jb3);
	this.add(jb4);
	this.add(jb5);
	this.add(jb6);
	this.setLayout(new FlowLayout (FlowLayout.RIGHT));
	
	
	this.setTitle("流式布局案例");
	this.setSize(200,300);
	this.setLocation(200, 200);
	this.setResizable(false);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Demo04 demo04=new Demo04();
	}

}
