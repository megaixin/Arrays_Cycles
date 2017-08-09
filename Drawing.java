//���������� ����� �� �������� � ������� ��������� Paint
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
class Drawing{
	
	public static void main (String[]args){
		//������ �����
		JFrame frame = new JFrame("Drawing frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(50, 10, 305, 450);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setLayout(null);
		
		//������ ������
		MyCustomPaintPanel panel = new MyCustomPaintPanel();
		panel.setBounds(10, 7, 270, 350);
		panel.setBackground(Color.WHITE);
		
		//������ ��� ������: ���� ����� �������� ������ ������� ������ �� �������������
		JButton cleaningButton = new JButton("Clean");
		cleaningButton.setBounds(10,360,130,50);
		
		JButton drawingButton = new JButton("Draw");
		drawingButton.setBounds(150,360,130,50);
		

		drawingButton.addActionListener(new ActionListener(){                                                         
			public void actionPerformed(ActionEvent e){                                                        
				panel.isWePaintSomething = true;
				panel.repaint();
			}                                                        
		
		});
		
		cleaningButton.addActionListener(new ActionListener(){                                                         
			public void actionPerformed(ActionEvent e){                                                        
              panel.isWePaintSomething = false; 
			  panel.repaint();
			}                                                        
		
		});
		 
		
		//��������� ������ � ������ �� �����
		frame.add(panel);
		frame.add(cleaningButton);
		frame.add(drawingButton);
		
		//������ �������� ��� �������
		frame.setVisible(true);
		panel.setVisible(true);
		cleaningButton.setVisible(true);
		drawingButton.setVisible(true);
	
	
	}
	

}