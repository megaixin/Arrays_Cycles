//�����
class LearnOfCycleCreating{
	public static void main (String[]args){
	
		wrapUpIntoCycle(9); 
		multiplicationTableOnTwo(7);
	
		
		
		for(int i = 30; i>0;i--){
			//���� ����� ������� �� ���
			if(i%3==0){
				
			System.out.println("�������!");
			continue;
			}
			
			if(i%5==0){
			System.out.println("����!");
			continue;
			}
			System.out.println(i+" ");
		}
	}
	
	/*1. 
	�������� � ���� ���
	System.out.println ( 1 );
	System.out.println ( 3 );
	System.out.println ( 5 );
	System.out.println ( 7 );
	System.out.println ( 9 );*/
	public static void wrapUpIntoCycle(int inNumber){
		for (int i = 1;i<=inNumber;i+=2){
			System.out.println ( i );
		}
	}

	/*2. ������� ������ �� ������� ������
	��� � ������� 1 - ��� 2
	��� � ������� 2 - ��� 4
	��� � ������� 3 - ��� 8
	��� � ������� 4 - ��� 16
	��� � ������� 5 - ��� 32*/
	public static void multiplicationTableOnTwo( int inNumbOfTimes){
		for(int i = 1;i<=inNumbOfTimes;i++){
			int inExponentiatedNum = 2;
			System.out.println("��� � ������� " + i + " - ��� " + Math.pow(inExponentiatedNum, i));	
		}
	}

	/*3. ������� �� ������� �������� ������ �� 30 �� 0
	�� ���� ����� ������� �� 3, ������ ���� �������� "��������", � ���� ������� �� ���� - �������� "������������".
	���� ������� � �� ���, � �� ����, �������� "�������". 
	����� ����� ����
	�������
	29 
	28
	��������
	26
	������������
	��������
	23
	22
	��������
	...*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}