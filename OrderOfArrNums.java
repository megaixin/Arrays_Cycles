//�������� ������ �� ���� �������� ����� �� 1 �� 99, �������� ��� �� ����� � ������, 
//� ����� ���� �� ������ �������� �� ����� ���� � ������, �� � �������� ������� (99 97 95 93 � 7 5 3 1)
class OrderOfArrNums{
	public static void main(String[]args){
		
		int [] myArr = new int [50];

		System.out.println("��������� ������ ��������� �������: ");
		for(int i = 0;i<myArr.length;i++){
			myArr[i] =  2 * i + 1;
		}
		writeArrayOnConsole(myArr);
		
		System.out.println("������� ������ ����� �������: ");
		for(int i = myArr.length-1;i>=0;i--){
			System.out.print(myArr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("������� ������: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
}
	
