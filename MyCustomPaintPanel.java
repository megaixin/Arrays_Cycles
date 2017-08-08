//создать класс MyCustomPaintPanel, унаследоваться им от JPanel и переопределить метод paint(Graphics g){}
//наследуем - получаем функционал. переопределяем - получаем возможность писать свой функционал помимо имеющегося

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
class MyCustomPaintPanel extends JPanel{


 @Override
 public void paint(Graphics g){
	super.paint(g);
	myPaintMethod(g); 

	boolean isPaintingSomeShit = true; 
	
	/*if ( isPaintingSomeShit == true){
		myPaintMethod(g); 

	}*/
}

 /*
  отрисовка панели постоянна
  но только если у нас переменная тру  - идет отрисовка метода
  два экшнЛистенера для каждой кнопки
  булева переменная
  если переменная тру - отрисовываем метод поверх панельки
  
  как все-таки в этом участвуют кнопки?
   
  есть две кнопки и одна из них будет задействовать метод нарисовки на панели
  панель вот: super.paint(g);
  а метод вот: myPaintMethod(g); 
  
  есть булева переменная 
  такое чувство что кнопки вообще нафиг нужны.

 */
 

 
 
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