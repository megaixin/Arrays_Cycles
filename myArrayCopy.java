//�������� ���� ������ ������ System.arraycopy()
class myArrayCopy{
	public static void main (String []args){
 
		int[] mySourceArray = {12,16,44,91,18,84,25};//7
		int[] myDestinationArray = {1,1,1,1,1,1,1};//7

		System.out.println("��������� ������-�������� mySourceArray: ");
		writeArrayOnConsole(mySourceArray);
		
		System.out.println("��������� ������ ��� ����������� myDestinationArray ����� ���������: ");
		writeArrayOnConsole(myDestinationArray);
		
		//���������� ����� ����������� �������
		myCopyArrayMethod(mySourceArray, 1, myDestinationArray, 4, 3);

		System.out.println("��������� ������ myDestinationArray ����� �����������: ");
		writeArrayOnConsole(myDestinationArray);
	}
 
	public static void myCopyArrayMethod(
		int []inSourceArray, 		//�������� ������ �� �������� ��������
		int inSourceElement, 		//����� �������� ��������� ������� � �������� �������� �����������
		int []inDestArray, 			//�������� ������, � ������� ��������
		int inDestElement, 			//��������� ����� �������� ��������� ������� � ������� ��������
		int inCountOfCopyElement){ 	//���������� ���������� ��������� �� ��������� � ���������� �������
			
		for(int i = inSourceElement; i<inSourceArray.length;i++){//�������� � ������ �������� ���������� � ����������; ���� i ������ ������ �������;�������� +
			inDestArray[inDestElement] = inSourceArray[inSourceElement];
			
			// �� ��������� �������, ������� � ����������� ������ ������, ��� ����� �������� ��� �������� � �������� ��
			//� �������� ������, ������� ����������� � ����������� ������ ������ � �� ����� ��������� ������ �������
			
		}
	
	}

	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("������� ������: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
 }