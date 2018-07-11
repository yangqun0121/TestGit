package class08;
import java.awt.*;
import javax.swing.*;
public class Demo01 extends JFrame {
		JButton jb1=null;
		public Demo01(){
			//JFrame jf=new JFrame();
			//创建组件：
			jb1=new JButton("我是按钮！！");
			this.setTitle("Hello,world!");
			this.setSize(300,300);
			this.setLocation(200, 200);
			this.add(jb1);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
		}
		
		public static void main(String [] args) {
			//JFrame是一个顶层容器类：可以添加swing组件的类；
			Demo01 demo01=new Demo01();
		}
			
			
}
