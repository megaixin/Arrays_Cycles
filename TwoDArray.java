/*C������ ��������� ������ �� 6 ����� �� 7 �������� � ������ �� ��������� ����� ����� �� ������� [0;9]. 
������� ������ �� �����. ������������� ������ ����� �������, ����� �� ������ ����� � ������ ������ ����� �� ���������� �������.
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
		
				System.out.print(myTwoDArr[i][j]+ " ");
			}
			System.out.println();
		}
	
	}

}/*
������������� ������ ����� �������, ����� �� ������ ����� � ������ ������ ����� �� ���������� �������.
��� ���� �������� ������ ������� ������, � ����� ������ ������������ �������� � ������ ����� ������. 

������������ ��� ������ ����������� ����� ������� � ������ ��� � ������� ������.����������� ���������� ����� � ������ ������, � 
�� ����� ��� ������ �� ��� ����� ����������� �� ����� ����, ��� ����������.
������� ��������� ��������� ������ �� ����� (�.�. ����� ��������� ������ ���� ������������, � ����� ������������� �� �������� ������ ������).

������ �������:
�������� � ��� ���� ����������� ������ arr[3][4] - ��� ������ 4 �������
�������� ��� �������� �� �����
[0][4][4][9] - ����� ���������� ����� 9 ��� ��������� � ������ ��� ������� 3
[3][0][4][0] - ���������� - 4 � ������ ����� 2
[8][1][2][0] - ���������� 8 ��� ����� � ������ 0

1-� ������: ���� ���������� ����� ������ ��� �������: 9 ������ � ������ 0, � 0 �� ������ 0 ������ � 3
2-� ������: ���� ����������, ������ ��� �������: 4 ������ � ������ ����, � 3 �� ������ 0 ������ � 2
3-� ������: ���� ����������, �� ��� ��� 8 ��������� ���������� �� �������� ���� ��� ���������� ���� � 
����� � ��������� ����� ������� �� �����.





*/