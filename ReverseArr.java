//���������, ������������ �� ������ � �������� �������.
class ReverseArr{
	public static void main(String []args){
		
		//��� ������ ������� ��� ��������
		int []myReverseSortArr = {2,1,3,4,5,6};
		//int [] myReverseSortArr = {6,5,4,3,2,1};

		boolean isSort = true;

		for (int i = 0; i<myReverseSortArr.length-1;i++){
			//���� ������ ����������� ����� ������� ������ �����������  -
			if (myReverseSortArr[i+1]<=myReverseSortArr[i]){
				//������ ������� ���������������
				isSort = true;
			}
			//���� � ������� ���� ��� �������� ����������� ����� ������ ����������� -
			if (myReverseSortArr[i+1]>myReverseSortArr[i]){
				//������ ������� �����������������.
				isSort = false;
				//����� �� �����
				break;
			}
			
		}		
		System.out.print(isSort);
	}	

	public static void verifyReverseSortOfArray(int [] inArray){
		
		boolean isSort = true;
		
		for (int i = 0; i<inArray.length-1;i++){
			if (inArray[i+1]<=inArray[i]){
				inSort = true;
			}
		}
		if (inArray[i+1]>inArray[i]){
		isSort = false;
		
		
		
		}
		
		
	}
	
	

	
	

	
	
	
	
	
} 