package class08;
import java.awt.*;
import javax.swing.*;
public class Demo08 extends JFrame{
	JPanel jp1,jp2;
	JLabel jl1,jl2;
	JComboBox  jcb1;
	JList jlist;
	JScrollPane jsp;
	public Demo08() {
		jp1=new JPanel();
		jp2=new JPanel();
		jl1=new JLabel("你的籍贯:");
		jl2=new JLabel("旅游地点:");
		String[] jg= {"北疆","上海","天津","火星"};
		jcb1=new JComboBox(jg);//
		String[]dd= {"九寨沟","故宫","长城","圆明园"};
		jlist=new JList(dd);//下拉框
		//jsp=new JScrollPane(jlist);
		jlist.setVisibleRowCount(2);
		jsp=new JScrollPane(jlist);
		this.setLayout(new GridLayout(2,1));
		//添加组件：
		jp1.add(jl1);
		jp1.add(jcb1 );
		jp2.add(jl2);
		jp2.add(jsp ); 
		this.add(jp1);
		this.add(jp2);
		this.setVisible(true);
		this.setLocation(200, 200);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		Demo08 demo08=new Demo08();
		
	}
}
