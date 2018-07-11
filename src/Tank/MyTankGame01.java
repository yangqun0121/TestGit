package Tank;
import java.awt.*;
import javax.swing.*;
public class MyTankGame01 extends JFrame{
	MyPanel mp=null;
	public MyTankGame01() {
		mp=new MyPanel();
		this.add(mp);
		this.setLocation(200, 200);
		this.setSize(600,500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MyTankGame01 mytankgame=new MyTankGame01();
	}
class Tank{
	int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	int y;
	public Tank(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
class HeroTank extends Tank{
	public HeroTank(int x,int y) {
		super(x, y);
	}
}

class MyPanel extends JPanel{
	HeroTank ht=null;
	public MyPanel() {
		ht=new HeroTank(10,10);
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, 600, 500);
		this.drawTank(100, 100, g, 0, 1);
	}
	public void drawTank(int x,int y,Graphics g,int direct,int type) {
		switch(type) {
		case 0:
			g.setColor(Color.cyan);
			break;
		case 1:
			g.setColor(Color.YELLOW);
			break;
		}
			switch(direct) {
			case 0:
				
				//1.画出左边的矩形；
				//g.setColor(Color.CYAN);
				g.fill3DRect(x,y,5,30,false);
				//2.画右边：
				g.fill3DRect(x+15, y, 5, 30,false);
				g.fill3DRect(x+5, y+5, 10, 20,false);
				g.fillOval(x+5, y+10, 10, 10);
				g.drawLine(x+10, y-4, x+10, y+15);
			}
		}
	}
}


