// �������� ���������, ������� �������� ��� �������� �������, ����� �������, �� ��������� �������, � �������� ���������.
class HalfSum{
	public static void main (String []args){
		//������������� ������
		int [] myArr = {9,3,12,6,10,3};
		
		//������� ������ ���� double � ����� �� ������� ��� � ������� ���� int 
		double[] myDoubleArr = new double[myArr.length];//��� ������, ��� ������ ������� myDoubleArr - 6
		
		//������� ��������� ������� ��� ������� ���������� �������������� �������
		//����� � �������� ���� ������� ���� �� �� ����� ��� � � ������������ �������
		 
		for (int i = 0; i < myArr.length; i++){
			myDoubleArr[i] = (double) myArr[i];
		}
		
		//�������� ��� �������� ����� ������� �� ��������� ������� �������� ����� �������������� �������
		for (int i = 1;i<myDoubleArr.length-1;i++){  
			myDoubleArr[i] = (myArr[i-1] + myArr[i+1])/2.0;
		
		}		
		
		writeArrayOnConsole(myDoubleArr);
	}
	
	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("������� ������: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
}