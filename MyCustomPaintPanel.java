//создать класс MyCustomPaintPanel, унаследоваться им от JPanel и переопределить метод paint(Graphics g){}
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
class MyCustomPaintPanel extends JPanel{


 @Override
 public void paint(Graphics g){
	super.paint(g);
	myPaintMethod(g); 
 }

	public void myPaintMethod(Graphics g){
		g.setColor(Color.BLACK);
		g.drawLine(130, 100, 200, 5);  
		g.drawLine(60, 200, 15, 15);
		g.drawLine(60, 200, 300, 20);
		g.setColor(Color.BLUE);
		g.drawOval(50, 50, 40, 50);
		g.setColor(Color.RED);
		g.drawOval(70, 60, 30, 40);
	}
}