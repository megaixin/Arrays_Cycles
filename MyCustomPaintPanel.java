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
 }

 
 /*
к каждой кнопке привязываем свой ЭкшнЛистенер
создаем две булевые переменные 

кнопка которая Draw:
если булева переменная (Draw)== тру (то есть нажата)
запускаем метод, отображаем на панель


кнопка которая Clean: 
если булева переменная (Clean)== false (то есть нажата)
?
 
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