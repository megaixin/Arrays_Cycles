//������� ����� MyCustomPaintPanel, �������������� �� �� JPanel � �������������� ����� paint(Graphics g){}
//��������� - �������� ����������. �������������� - �������� ����������� ������ ���� ���������� ������ ����������
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
class MyCustomPaintPanel extends JPanel{

	public boolean isWePaintSomething = false;
	BufferedImage myBuffImage = new BufferedImage(20,20,BufferedImage.TYPE_INT_RGB);

 @Override
	public void paint(Graphics g){
		super.paint(g);
		
		if (isWePaintSomething == true){
			myPaintMethod(g); 
		}
	}	
	
	
	
	public void myPaintMethod(Graphics g){
		Graphics imgCanvas = myBuffImage.getGraphics();

		imgCanvas .setColor(Color.GREEN);
		imgCanvas .drawLine(5, 5, 17, 12);
		//g.drawImage(myBuffImage, 20, 20, this);
		boolean Graphics.drawImage(
		Image img,//��������, ������� �� ������
	   int dstx1,//���������� �� x, ������. �� ������ ���� �� ���� �������� �� �����������
	   int dsty1,//���������� �� �������� ���� ������ �� ���� �������� �� ���������
	   int dstx2,//���������� �� ������ ���� �� ���� �������� �� �����������
	   int dsty2,//���������� �� �������� ���� ������ �� ������� ���� �������� �� ���������
       int srcx1,//
	   int srcy1,//
	   int srcx2,//
	   int srcy2,//
       ImageObserver observer//
	   );
	
	
	
	}
}