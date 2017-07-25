//�������� ���� ������ ������ System.arraycopy()
class myArrayCopy{
	public static void main (String []args){
 
		int[] mySourceArray = {12,16,44,91,18,84,25};//7
		int[] myDestinationArray = {1,1,1,1,1,1,1};//7

		System.out.println("������� ������-�������� mySourceArray: ");
		writeArrayOnConsole(mySourceArray);
		
		System.out.println("������� ������ ��� ����������� myDestinationArray ����� ���������: ");
		writeArrayOnConsole(myDestinationArray);
		
		//���������� ����� ����������� �������
		myCopyArrayMethod(mySourceArray, 2, myDestinationArray, 4, 2);

		System.out.println("������� ������ myDestinationArray ����� ����������: ");
		writeArrayOnConsole(myDestinationArray);
	}
 
	public static void myCopyArrayMethod(
		int []inSourceArray, 		//�������� ������ �� �������� ��������
		int inSourceElement, 		//����� �������� ��������� ������� � �������� �������� �����������
		int []inDestArray, 			//�������� ������, � ������� ��������
		int inDestElement, 			//��������� ����� �������� ��������� ������� � ������� ��������
		int inCountOfCopyElement){ 	//���������� ���������� ��������� �� ��������� � ���������� �������
	
		//����� ����������� ��� �������� �� ��������� ������� � ��������.
		//��� �������� - ��� ��� �������� �� ����� ��������� ������� ������� ���� ����������
		//� �������� ��� ������ ��������� �������, ��������� �� ��� ��� ������ �� ����.
		
			inDestArray[inDestElement+inCountOfCopyElement] = inSourceArray[inSourceElement];
			
			//inDestArray[inDestElement+1] = inSourceArray[inSourceElement+1];		
			//inDestArray[inDestElement+2] = inSourceArray[inSourceElement+2];
	}

	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("������� ������: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
 }