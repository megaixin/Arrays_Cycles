//создать класс MyCustomPaintPanel, унаследоваться им от JPanel и переопределить метод paint(Graphics g){}
//наследуем - получаем функционал. переопределяем - получаем возможность писать свой функционал помимо имеющегося
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
class MyCustomPaintPanel extends JPanel{

	public boolean isWePaintSomething = false;
	BufferedImage myBuffImage = new BufferedImage(20, 20, BufferedImage.TYPE_INT_RGB);

 @Override
	public void paint(Graphics g){
		super.paint(g);
		
		if (isWePaintSomething == true){
			myPaintMethod(g); 
		}
	}	
	
	public void myPaintMethod(Graphics g){
		Graphics imgCanvas = myBuffImage.getGraphics();
		
		imgCanvas.setColor(Color.GREEN);
		imgCanvas.drawLine(5, 5, 17, 12);
		g.drawImage(myBuffImage, 10, 15, 200, 250,
		0, , 20, 20,
		null);
	}
}