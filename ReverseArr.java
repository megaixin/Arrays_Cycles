//���������, ������������ �� ������ � �������� �������.
class ReverseArr{
	public static void main(String []args){
		
		//��� ������ ������� ��� ��������
		//int []mySortArr = {2,1,3,4,5,6};
		int []myReverseSortArr = {6,5,4,3,2,1};
		boolean isSort = false;
		//����� ����
		for(int i = 0;i<myReverseSortArr.length-1;i++){
			//�������:
			//���� ������ ����������� ����� ������ �����������  -
			if (myReverseSortArr[i+1]<=myReverseSortArr[i]){
			//������ ������������
				isSort = true;
			/*
			myReverseSortArr[5]<=myReverseSortArr[6] = correct
			myReverseSortArr[4]<=myReverseSortArr[5] = correct
			myReverseSortArr[3]<=myReverseSortArr[4] = correct
			myReverseSortArr[2]<=myReverseSortArr[3] = correct
			myReverseSortArr[1]<=myReverseSortArr[2] = correct
			 //������ ������������ � �������� �������
			 true
			 ���� ���������� isSort == true
			 ����� ������: 
			 System.out.println("������ ������������");
			
			�����.
			
			//����� ����
			for(int i = 0;i<mySortArr.length-1;i++){
			//�������:
			//���� ������ ����������� ����� ������ �����������  -
			if (mySortArr[i+1]<=mySortArr[i]){
				
			mySortArr[1]<=myReverseSortArr[2] = correct
			mySortArr[3]<=myReverseSortArr[1] = non correct
			false
			if (isSort == false){
				break;
	
			}
			System.out.println("������  �� ������������");
			
			*/
			
			
			}
			// ���� ������ ������������ - ������� �� �����
			if (isSort == true){
				System.out.println("������ ������������");
			}else{
				isSort = false;
			}
			//���� �� ������������ - ������� �� �����
			if(isSort == false){
				System.out.println("������ ������������");
			} 
			
		}
	}
} 