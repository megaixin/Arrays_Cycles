//������� ����� ��������� �������, ������� ��������� ����� ����� ������. ���� ���� ����� � ������� ��� - ������� 0
class NullArray{
	public static void main (String[]args){
		
		int[]myArr = {6,0,5,5,2,1,0,0};
		
		// ������������� ���������� ����� 1 (������ ������� � ������� ������ 0)
		int firstNullPosition = 0;
		//������������� ���������� ����� 2 (������ ������� � ������� ������ 0)
		int secondNullPosition = 0;
		
		//����� ���� (��� ������� ����)
		for (int i = 0;i<myArr.length;i++){
			// ���� ������� ������� ������� = 0
			if (myArr[i]==0){
				//�� ������ ��� � ����������(��������� 1-� ����)
				firstNullPosition = i;
			break;
			}
			
		}			
		System.out.println("������ ���� �� ������� - "+ firstNullPosition);
		
		//����� ����(��� ������� ����)
		for (int i = firstNullPosition+1;i<myArr.length;i++){
			//���� ������� ������� ������� = 0 {
			if (myArr[i]==0){
				//�� ������ ��� �� ������ ����������(��������� 2-� ����)
				secondNullPosition = i;
			break;
			}
		
		}
		 System.out.println("������ ���� �� ������� - "+ secondNullPosition );
		/*
		����� �������� � ������������ ������� ���� � ������� ������ ���������� �����. 
		������ ����� �������� ������������ ������� ���� ������ ���������� �����.
		���� �������� ������ �������: ����� ������ ������� ���� �����.
		*/
	
	
	/*
	 //���������� ��� ������������ ���.����� =0;
	
	//����� ����, ������ �� firstNullPosition{
		firstNullPosition ���� ������� ��������{
			���� ������� �������� ����� secondNullPosition
			����� �� �����
		}
	}	
	 ���������� ��� ������������ ���.����� =firstNullPosition ���� ������� ��������
	 
	 ���� ��� ������� � ��, ��� ����� ���� - ����� �����������
	 �� ����:
	 ���� �� ������ ������� ��������� ���� , (������0) + 5 +5 + 2 + 1 + (0�����) �� ������� ������� ���������� ����
	 �� ���� firstNullPosition + myArr[i]+myArr[i]+myArr[i]+myArr[i]+secondNullPosition
	 firstNullPosition + myArr[i];
	 ���� myArr[i]=secondNullPosition
	 break;
	int sum =  firstNullPosition + myArr[i];
	�����: (sum)
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}