/*C������ ��������� ������ �� 6 ����� �� 7 �������� � ������ �� ��������� ����� ����� �� ������� [0;9]. 
������� ������ �� �����. 
������������� ������ ����� �������, ����� �� ������ ����� � ������ ������ ����� �� ���������� �������.
��� ���� �������� ������ ������� ������, � ����� ������ ������������ �������� � ������ ����� ������. 
������� ��������� ��������� ������ �� ����� (�.�. ����� ��������� ������ ���� ������������, � ����� ������������� �� �������� ������ ������).
������� ��������������� ������ �� �����.*/
class TwoDArray{
	public static void main (String[]args){
		
		//C������ ��������� ������ �� 6 ����� �� 7 �������� � ������ �� ��������� ����� ����� �� ������� [0;9]. 
		int [][] myTwoDArr = new int[6][7];//������ - 6 ������� - 7
		
		for(int i = 0;i<6;i++){
			for(int j =0;j<7;j++){
				myTwoDArr[i][j] = (int)(Math.random()*10);
			}
		}		
		//������� ������ �� �����
		for (int i = 0;i<6;i++){
			for(int j=0;j<7;j++){
				System.out.print(myTwoDArr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//������� ���������� ������� ������ ������
		int myMaxValOfTwoDArr = myTwoDArr[0][0];
		for (int i = 0;i<myTwoDArr.length;i++){//���� �� �������� ������ �������
			myMaxValOfTwoDArr = -9999999;
			for( int j = 0; j<myTwoDArr[i].length;j++){//���� ������� �������� �������� �� ��������� ����� ������ ������
				
				if(myMaxValOfTwoDArr < myTwoDArr[i][j]){
					myMaxValOfTwoDArr = myTwoDArr[i][j];
				}
			}
			System.out.println("� ������ ����� " + i + " ����� ������� ����� "+ myMaxValOfTwoDArr);
	
		}
		for (int x =0; x<myTwoDArr.length;x++){
			for( int y = 0; y<myTwoDArr[x].length;y++){
				//�������� ����� ���������
				if (myTwoDArr[x][y]= myMaxValOfTwoDArr){
					//��, ��� ������ ��� ���������� ����������
					myTwoDArr[x][y] = myTwoDArr[x][0];
					myTwoDArr[x][0] = myMaxValOfTwoDArr;
				}
			}
		}
	
		for (int i = 0;i<6;i++){
			for(int j=0;j<7;j++){
				System.out.print(myTwoDArr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		// - ������� ������� � ���������� ������� ������ ������, � ����� �� �������

		//- �������� ������� � ���������� �������
	}		
}
