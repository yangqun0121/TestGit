package class08;
import java.awt.*;
import javax.swing.*;
public class Demo03 extends JFrame{
		JButton jb1,jb2,jb3,jb4,jb5;
		public Demo03(){
			jb1=new JButton("�в�");
			jb2=new JButton("����");
			jb3=new JButton("�ϲ�");
			jb4=new JButton("����");
			jb5=new JButton("����");
			this.add(jb1,BorderLayout.CENTER);
			this.add(jb2,BorderLayout.WEST);
			this.add(jb3,BorderLayout.SOUTH);
			this.add(jb4,BorderLayout.NORTH);
			this.add(jb5,BorderLayout.EAST);
			this.setTitle("�߽粼�ְ���");
			this.setLocation(200, 200);
			this.setSize(300,300);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
		}
		public static void main(String [] args) {
			Demo03 demo03=new Demo03();
			
			
		}
}
