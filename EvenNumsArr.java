//�������� ������ ����� �����, ��������� ��� ������ ������� �������, � ����� ������ ������ ������� �������� �� ����������. 
class EvenNumsArr{
	public static void main (String [] args){
		//������� ������ ����� �����
		int [] myArr = new int [6];
		//��������� ��� ������� �������
		for(int i = 0; i<myArr.length;i++){
			myArr[i] =  2 * i;
		}
		System.out.println("������� ������ ��������� �� ������ �����: ");
		writeArrayOnConsole(myArr);
		

		for(int i = 0;i<myArr.length;i+=2){
			myArr[i+1] = myArr[i+1] * myArr[i];
		}
		
		System.out.println("������ ������ ������� ������� ������� �� ����������: ");
		writeArrayOnConsole(myArr);
		

		
	}
	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("������� ������: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
	
	
	
}