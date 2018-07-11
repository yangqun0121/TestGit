package class08;
import java.awt.*;
import javax.swing.*;
public class Demo03 extends JFrame{
		JButton jb1,jb2,jb3,jb4,jb5;
		public Demo03(){
			jb1=new JButton("中部");
			jb2=new JButton("西部");
			jb3=new JButton("南部");
			jb4=new JButton("北部");
			jb5=new JButton("东部");
			this.add(jb1,BorderLayout.CENTER);
			this.add(jb2,BorderLayout.WEST);
			this.add(jb3,BorderLayout.SOUTH);
			this.add(jb4,BorderLayout.NORTH);
			this.add(jb5,BorderLayout.EAST);
			this.setTitle("边界布局案例");
			this.setLocation(200, 200);
			this.setSize(300,300);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
		}
		public static void main(String [] args) {
			Demo03 demo03=new Demo03();
			
			
		}
}
