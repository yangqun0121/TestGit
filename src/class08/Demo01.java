package class08;
import java.awt.*;
import javax.swing.*;
public class Demo01 extends JFrame {
		JButton jb1=null;
		public Demo01(){
			//JFrame jf=new JFrame();
			//���������
			jb1=new JButton("���ǰ�ť����");
			this.setTitle("Hello,world!");
			this.setSize(300,300);
			this.setLocation(200, 200);
			this.add(jb1);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
		}
		
		public static void main(String [] args) {
			//JFrame��һ�����������ࣺ�������swing������ࣻ
			Demo01 demo01=new Demo01();
		}
			
			
}
