//создать класс MyCustomPaintPanel, унаследоваться им от JPanel и переопределить метод paint(Graphics g){}
//наследуем - получаем функционал. переопределяем - получаем возможность писать свой функционал помимо имеющегося

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
class MyCustomPaintPanel extends JPanel{


 @Override
 public void paint(Graphics g){
	super.paint(g);
	//myPaintMethod(g); 
 }

 /*
 на поразмышлять
 задействовать кнопки Draw и Clean
 Draw - нарисовать элемент (одну линию, фигуру, либо придать ей цвет - одно прописанное действие);
 Clean - отменить предыдущее действие, то есть одно нажатие - отмена одного действия вызванного кнопкой Draw
 как сделать: повесить слушателя на кнопки.
 
 не совсем понятно как можно будет рисовать одновременно нажимая кнопку и программируя что именно нужно проявить
 через код (линию, овал и т.п).
 Наверное можно будет с помощью кнопки Draw "нарисовать" что-то если оно уже нарисованно в коде: один клик - одна прописанная
 задача, второй - вторая и так пока строки рисующего кода не кончатся.
 А кнопка Clean будет просто это стирать.
 Пример:
 
 рисуем линию:
плюс  g.drawLine(130, 100, 200, 5); 
- один клик  
плюс g.drawLine(60, 200, 15, 15); 
- второй клик
нажимаем Clean:
минус  g.drawLine(60, 200, 15, 15);
- клик
минус  g.drawLine(130, 100, 200, 5); 
 - второй клик
  
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