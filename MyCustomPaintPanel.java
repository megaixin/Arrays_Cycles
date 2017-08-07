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

создаем булеву переменную 

кнопка Draw:
принажатии на эту кнопку реакция должна быть таковой, что будет выводиться метод отрисовыввающий что-то на панельке.
никаких других реакций

если булева переменная == тру 
запускаем метод, отображаем на панель

кнопка Clean: 
при нажатии на эту кнопку реакция должна быть таковой, что панель всегда должна оставаться без рисунка чистой.
никаких других реакций
если булева переменная == false
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