//������� ����� MyCustomPaintPanel, �������������� �� �� JPanel � �������������� ����� paint(Graphics g){}
//��������� - �������� ����������. �������������� - �������� ����������� ������ ���� ���������� ������ ����������
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
	//�������� � �������
	public void myPaintMethod(Graphics g){
		Graphics imgCanvas = myBuffImage.getGraphics();
		imgCanvas.drawLine(5, 5, 17, 12);
		
		//�������������� ��������
		for(int i = 1; i<19;i++){
			myBuffImage.setRGB(  i , 9 ,0xFF0000);
		}
		for(int i = 10; i<12;i++){
			//������ ������� ���� ������������
			myBuffImage.setRGB(18, 1*i, 0xFF0000);
			//����� ������� ����� ������������
			myBuffImage.setRGB(20 - 19, 18 - 1*i, 0xFF0000); 
		}
		//������������ ��������
		for(int i = 1; i<19;i++){
			myBuffImage.setRGB(  9 , 1*i ,0xFF0000);
		}
		
		for(int i = 9; i<12;i++){
			//������� ������� ������ ��������������
			myBuffImage.setRGB(i, 1, 0xFF0000);
			//������ ������� ������ ��������������
			myBuffImage.setRGB(i-2, 18, 0xFF0000); 
		}
		
		
		for(int i = 1; i<6;i++){
			//������� � ������� ����� ���� (������)
			myBuffImage.setRGB(5, 1*i, 0xFF0004);
			myBuffImage.setRGB(i+2, 5-2, 0xFF0000); 
		}
		

		
		g.drawImage(myBuffImage, 10, 15, 200+10, 200+15,
		0, 0, 20, 20,
		null);
		
	
	}
}
