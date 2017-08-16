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
	//работаем с методом
	public void myPaintMethod(Graphics g){
		Graphics imgCanvas = myBuffImage.getGraphics();
		imgCanvas.drawLine(5, 5, 17, 12);
		
		//горизонтальная основная
		for(int i = 1; i<19;i++){
			myBuffImage.setRGB(  i , 9 ,0xFF0000);
		}
		for(int i = 10; i<12;i++){
			//правая смотрит вниз вертикальная
			myBuffImage.setRGB(18, 1*i, 0xFF0000);
			//левая смотрит вверх вертикальная
			myBuffImage.setRGB(20 - 19, 18 - 1*i, 0xFF0000); 
		}
		//вертикальная основная
		for(int i = 1; i<19;i++){
			myBuffImage.setRGB(  9 , 1*i ,0xFF0000);
		}
		
		for(int i = 9; i<12;i++){
			//верхняя смотрит впрево горизонтальная
			myBuffImage.setRGB(i, 1, 0xFF0000);
			//нижняя смотрит вправо горизонтальная
			myBuffImage.setRGB(i-2, 18, 0xFF0000); 
		}
		
		
		for(int i = 1; i<6;i++){
			//крестик в верхнем левом углу (прямой)
			myBuffImage.setRGB(5, 1*i, 0xFF0004);
			myBuffImage.setRGB(i+2, 5-2, 0xFF0000); 
		}
		

		
		g.drawImage(myBuffImage, 10, 15, 200+10, 200+15,
		0, 0, 20, 20,
		null);
		
	
	}
}
