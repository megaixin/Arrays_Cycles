//���������, ������������ �� ������ � �������� �������.
class ReverseArr{
	public static void main(String []args){
		
		//��� ������ ������� ��� ��������
		int []mySortArr = {1,2,3,4,5,6};
		//int []myReverseSortArr = {6,5,4,3,2,1};
		
		boolean isSort = false;
		
		for(int i = 0;i<mySortArr.length-1;i++){
			//���� ������ ����������� ����� ������ ����������� 
			if (mySortArr[i+1]<=mySortArr[i]){
				isSort = true;
			}else{
				isSort = false;
			}
		}	
	}
} 