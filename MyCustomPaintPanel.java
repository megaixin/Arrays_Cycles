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
			myBuffImage.setRGB( 9, 1*i ,0xFF0000);
		}
		//1 ������ �������������� �����
		for(int i = 4; i<15;i++){
			myBuffImage.setRGB(  i , 5 ,0xFF0000);	
		}
		//2 ������ �������������� �����
		for(int i = 2; i<17;i++){
			myBuffImage.setRGB(  i , 10 ,0xFF0000);	
		}
		//3 ������ �������������� �����
		for(int i = 1; i<19;i++){
			myBuffImage.setRGB(  i , 16 ,0xFF0000);	
		}
		
		g.drawImage(myBuffImage, 10, 15, 200+10, 200+15,
		0, 0, 20, 20,
		null);
		
	
	}
}
