//�������� ���� ������ ������ System.arraycopy()
class myArrayCopy{
	public static void main (String []args){
 
		int[] mySourceArray = {1,1,1,1,1};
		int[] myDestinationArray = {2,2,2,2,2};

		System.out.println("n/��������� ������-�������� mySourceArray: ");
		writeArrayOnConsole(mySourceArray);
		System.out.println("n/��������� ������ ��� ����������� myDestinationArray �� ��������� : ");
		writeArrayOnConsole(myDestinationArray);
		
		
		for(int i =0; i<mySourceArray.length;i++){
			myDestinationArray[i] = mySourceArray[i];
		}
		System.out.println("��������� ������ myDestinationArray ����� �����������: ");
		writeArrayOnConsole(myDestinationArray);
		
	/*
	���� ����� ������ ���:
	������� � ����  ���� �� �������� ������ ������� ��������� �������� ����
*/
	}
 
 

	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("������� ������: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}

 }