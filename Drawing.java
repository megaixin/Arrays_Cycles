//нарисовать крест на картинке с помощью программы Paint
import javax.swing.*;
import java.awt.Color;
class Drawing{
	
	public static void main (String[]args){
		//делаем фрейм
		JFrame frame = new JFrame("Drawing frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(50, 10, 305, 450);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setLayout(null);
		
		//делаем панель
		JPanel panel = new JPanel();
		panel.setBounds(10, 7, 270, 350);
		panel.setBackground(Color.WHITE);
		
		//делаем две кнопки: одна будет рисовать другая очищать панель от нарисованного
		JButton cleaningButton = new JButton();
		cleaningButton.setBounds(10,360,130,50);
		
		JButton drawingButton = new JButton();
		drawingButton.setBounds(150,360,130,50);
		
		//добавляем панель и кнопки на фрейм
		frame.add(panel);
		frame.add(cleaningButton);
		frame.add(drawingButton);
		
		//делаем видимыми все обьекты
		frame.setVisible(true);
		panel.setVisible(true);
		cleaningButton.setVisible(true);
		drawingButton.setVisible(true);
	
	
	}
	

}