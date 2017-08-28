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
		
		//������ ������������ ����� � ������ ��������
		for(int i = 1; i<19;i++){
			myBuffImage.setRGB( 9, 1*i ,0xFFFFFF);
		}
		//������ 1 �������������� ����� � ������ ��������
		for(int i = 5; i<14;i++){
			myBuffImage.setRGB( i, 3 ,0xFFFFFF);
		}
		//������ 2 �������������� ����� 
		for(int i = 5; i<14;i++){
			myBuffImage.setRGB( i, 8 ,0xFFFFFF);
		}
		//������ 3 �������������� ����� 
		for(int i = 4; i<15;i++){
			myBuffImage.setRGB( i, 14 ,0xFFFFFF);
		}
		
	
	
		//1-� ������ �����
		for(int i = 9; i<14;i++){
			myBuffImage.setRGB(  i, (int) Math.round (0.8 * i -7), 0xFFFFFF ); 
		}
		//2-� ������ �����
		for(int i = 9; i<14;i++){
			myBuffImage.setRGB(  i, (int) Math.round (1.3 * i -9), 0xFFFFFF ); 
		}
		//3-� ������ �����
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
