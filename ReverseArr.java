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
			}
			if(isSort==true){
				System.out.println("������ ������������");
			}

			if (isSort == false){
				System.out.println("������  �� ������������");
			}
			break;
		}
	}
} 