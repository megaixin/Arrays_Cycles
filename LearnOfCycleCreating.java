/*
2. ������� ������ �� ������� ������
��� � ������� 1 - ��� 2
��� � ������� 2 - ��� 4
��� � ������� 3 - ��� 8
��� � ������� 4 - ��� 16
��� � ������� 5 - ��� 32
*/
class LearnOfCycleCreating{
	public static void main (String[]args){
	
		wrapUpIntoCycle(9); 
	
	}

	public static void wrapUpIntoCycle(int inNumber){
		for (int i = 1;i<=inNumber;i+=2){
			System.out.println ( i );
		}
	}

	
	
	
	
	
}