//1)�������� ���������� � ���������� ����� ������� 2) �������� �� �������
class MaxMinValArray{
	public static void main(String[]args){
		int[]myArray = { 5, 7, 5, 2, 11, 7, 5, 20, 12};

		int myMaxValOfArray = myArray[0];
		int positionOfMaxValue = myArray[myMaxValOfArray];
		
		for(int i = 0; i<myArray.length;i++){
			
			if(myMaxValOfArray < myArray[i]){
				myMaxValOfArray = myArray[i];
				positionOfMaxValue = i;
			}
		}
		System.out.println("\n����� ������� ����� � �������: "+ myMaxValOfArray +" "+ "� ������ "+ positionOfMaxValue);

		int myMinValOfArray = myArray[0];
		int positionOfMinValue = myArray[myMinValOfArray];
		for(int i = 0;i< myArray.length;i++){
		
			if(myMinValOfArray > myArray[i]){
				myMinValOfArray = myArray[i];
				positionOfMinValue = i;
			}
		}
		System.out.println("\n����� ��������� ����� � �������: "+ myMinValOfArray + " � ������ "+ positionOfMinValue);

		System.out.println("������� ������� ������: ");
			for(int i = 0; i<myArray.length;i++){
			System.out.print(myArray[i]+" ");
		}
		System.out.println();

		myArray[positionOfMaxValue] = myMinValOfArray;
		myArray[positionOfMinValue] = myMaxValOfArray;

		System.out.println("������� ���������� ������: ");
			for(int i = 0; i<myArray.length;i++){
			System.out.print(myArray[i]+" ");
		}
		System.out.println();





	}
}