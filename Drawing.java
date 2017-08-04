//нарисовать крест на картинке с помощью программы Paint
import javax.swing.*;
import java.awt.Color;
class Drawing{
	
	public static void main (String[]args){
		
		JFrame frame = new JFrame("Drawing frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(50, 10, 305, 450);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 7, 270, 400);
		panel.setBackground(Color.WHITE);
		
		JButton cleaningButton = new JButton();
		//cleaningButton.setBounds();
		
		
		
		frame.add(panel);
		frame.setVisible(true);
		panel.setVisible(true);
	
	
	
	
	}
	

}