//создать класс MyCustomPaintPanel, унаследоваться им от JPanel и переопределить метод paint(Graphics g){}
//наследуем - получаем функционал. переопределяем - получаем возможность писать свой функционал помимо имеющегося
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
class MyCustomPaintPanel extends JPanel{

	public boolean isWePaintSomething = false;
	BufferedImage myBuffImage = new BufferedImage(20,20,BufferedImage.TYPE_INT_RGB);

 @Override
	public void paint(Graphics g){
		super.paint(g);
		
		if (isWePaintSomething == true){
			myPaintMethod(g); 
		}
	}	
	
	
	
	public void myPaintMethod(Graphics g){
		Graphics imgCanvas = myBuffImage.getGraphics();

		imgCanvas .setColor(Color.GREEN);
		imgCanvas .drawLine(5, 5, 17, 12);
		//g.drawImage(myBuffImage, 20, 20, this);
		boolean Graphics.drawImage(
		Image img,//картинка, которую мы рисуем
	   int dstx1,//координаты по x, справа. от левого края до края картинки по горизонтали
	   int dsty1,//координаты от верхнего края панели до края картинки по вертикали
	   int dstx2,//координаты от левого края до края картинки по горизонтали
	   int dsty2,//координаты от верхнего края панели до нижнего края картинки по вертикали
       int srcx1,//
	   int srcy1,//
	   int srcx2,//
	   int srcy2,//
       ImageObserver observer//
	   );
	
	
	
	}
}