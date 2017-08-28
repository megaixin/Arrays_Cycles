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
		//рисуем 1 горизонтальную линию в центре квадрата
		for(int i = 5; i<14;i++){
			myBuffImage.setRGB( i, 3 ,0xFFFFFF);
		}
		//рисуем 2 горизонтальную линию 
		for(int i = 5; i<14;i++){
			myBuffImage.setRGB( i, 8 ,0xFFFFFF);
		}
		//рисуем 3 горизонтальную линию 
		for(int i = 4; i<15;i++){
			myBuffImage.setRGB( i, 14 ,0xFFFFFF);
		}
		
	
	
		//1-я правая ветка
		for(int i = 9; i<14;i++){
			myBuffImage.setRGB(  i, (int) Math.round (0.8 * i -7), 0xFFFFFF ); 
		}
		//2-я правая ветка
		for(int i = 9; i<14;i++){
			myBuffImage.setRGB(  i, (int) Math.round (1.3 * i -9), 0xFFFFFF ); 
		}
		//3-я правая ветка
		for(int i = 9; i<13;i++){
			myBuffImage.setRGB(  i, (int) Math.round (2.1 * i -12), 0xFFFFFF ); 
		}
		for(int i = 9; i<14;i++){
			myBuffImage.setRGB(  4, i,  0xFF5050 ); 
		}
		
		
		
		g.drawImage(myBuffImage, 10, 15, 200+10, 200+15,
		0, 0, 20, 20,
		null);
	
	}
}
