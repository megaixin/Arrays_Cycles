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
		//рисуем вертикальную линию в центре квадрата
		for(int i = 1; i<19;i++){
			myBuffImage.setRGB( 9, 1*i ,0xFFFFFF);
		}
		//1-я правая ветка
		//строим от точки (9,1) до точки (14, 5)
		for(int i = 9; i<14;i++){
			myBuffImage.setRGB(i , 1 * i-5 ,0xFFFFFF); //низзя числа с плавающей точкой
		}
		
		g.drawImage(myBuffImage, 10, 15, 200+10, 200+15,
		0, 0, 20, 20,
		null);
		
	}
}
