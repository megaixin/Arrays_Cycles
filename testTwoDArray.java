class testTwoDArray{
	public static void main (String[]args){

		int [][] myTwoDArr = new int[6][7];
		
		for(int i = 0;i<6;i++){
			for(int j =0;j<7;j++){
				myTwoDArr[i][j] = (int)(Math.random()*10);
			}
		}		
		//����� ������� �� �����
		for (int i = 0;i<6;i++){
			for(int j=0;j<7;j++){
				System.out.print(myTwoDArr[i][j]+" ");
			}
			System.out.println();
		}
		
	
		for (int i = 0;i<myTwoDArr.length;i++){					
			//myMaxValOfTwoDArr = -9999999;
			int findMostValue = findMostValueOfArray(myTwoDArr[i]);
		System.out.println("� ������ ����� " + i + " ����� ������� ����� �� ������� "+ findMostValue);
		}	
		
	
	
	
	
	}	
/*
����� ��� ������ ���������� ����� � ������� ���������� �������
������ ���������� ���������� ����� � ������ � ���������� ������� ����������� �����.
����� ����� ��������� ���:*/
	public static int findMostValueOfArray(int[]inArr){
		//���������� ��� �����������
		int maxValOfArray = inArr[0];
		//������� ����������� �����
		int positionOfMax = 0;
		//����
		for(int i = 0;i<inArr.length;i++){
			//���� ���������� ������ ��� ������� �����
			if(maxValOfArray<inArr[i]){
				//������� ����� ������� � ����������
				maxValOfArray = inArr[i];
				positionOfMax = i;
			}
		}
		//���������� ������� ����������� �����
		return positionOfMax;
	}
}