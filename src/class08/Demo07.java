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
		//��ʼ������������
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jl1=new JLabel("�û���");
		jl2=new JLabel("����");
		jb1=new JButton("��¼");
		jb2=new JButton("ȡ��");
		jtf1=new JTextField(10);
		jpwf1=new JPasswordField(10);
		//���ò��ֹ�������
		this.setLayout(new GridLayout(3,1 ));
		//��Ӹ��������
		jp1.add(jl1);
		jp1.add(jtf1 );
		jp2.add(jl2);
		jp2.add(jpwf1);
		jp3.add(jb1);
		jp3.add(jb2);
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.setTitle("QQ��¼");
		this.setVisible(true);
		this.setLocation(200, 200);
		this.setSize(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Demo07 demo07=new Demo07();
	}

}
