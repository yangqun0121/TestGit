package class08;
import java.awt.*;
import javax.swing.*;
public class Demo05 extends JFrame{
	int size=9;
	JButton jbs[]=new JButton[size];
	
	public Demo05() {
		for(int i=0;i<size;i++) {
			jbs[i]=new JButton(String.valueOf(i+1));
		}
		this.setLayout(new GridLayout(3,3,10,10));
		for(int i=0;i<size;i++) {
			this.add(jbs[i]);
		}
		this.setTitle("网格布局实例");
		this.setVisible(true);
		this.setLocation(200, 200);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			Demo05 demo05=new Demo05();
	}

}
