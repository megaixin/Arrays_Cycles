//создать класс MyCustomPaintPanel, унаследоваться им от JPanel и переопределить метод paint(Graphics g){}
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
class MyCustomPaintPanel extends JPanel{


	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		//вписываешь свой код
		//например 
   
		g.setColor(Color.BLACK);
		g.drawLine(20, 40, 320, 20);  
		
	}
}