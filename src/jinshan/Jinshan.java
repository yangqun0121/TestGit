package jinshan;
import java.awt.*;
import javax.swing.*;
public class Jinshan extends JFrame{
	JSplitPane jsp1;
	JList jlist;
	JLabel jl1;
	public Jinshan() {
		String[] words= {"���ڽ�ɽ�ʰ�","���ذ�װ","����","��ϵ����"};
		jlist=new JList(words);
		jl1=new JLabel(new ImageIcon("img/img.jpg"));
		jsp1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlist,jl1);
		jsp1.setOneTouchExpandable(true);
		this.add(jsp1);
		this.setTitle("��ɽ����");
		this.setLocation(200, 200);
		this.setSize(300, 300);
		this.setVisible(true);
		this.setIconImage((new ImageIcon("img//timg.jpg")).getImage());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		Jinshan jinshan=new Jinshan();
	}
}
