package class08;
import java.awt.*;
import javax.swing.*;
public class Demo07 extends JFrame{
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2;
	JButton jb1,jb2;
	JTextField jtf1;
	JPasswordField jpwf1;
	public Demo07() {
		//初始化各个部件；
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jl1=new JLabel("用户名");
		jl2=new JLabel("密码");
		jb1=new JButton("登录");
		jb2=new JButton("取消");
		jtf1=new JTextField(10);
		jpwf1=new JPasswordField(10);
		//设置布局管理器；
		this.setLayout(new GridLayout(3,1 ));
		//添加各个组件；
		jp1.add(jl1);
		jp1.add(jtf1 );
		jp2.add(jl2);
		jp2.add(jpwf1);
		jp3.add(jb1);
		jp3.add(jb2);
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.setTitle("QQ登录");
		this.setVisible(true);
		this.setLocation(200, 200);
		this.setSize(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Demo07 demo07=new Demo07();
	}

}
