//�������� ���� ������ ������ System.arraycopy()
class myArrayCopy{
	public static void main (String []args){
 
		int[] mySourceArray = {3,6,44,9,18,84,56};
		int[] myDestinationArray = {2,2,2,2,2,2,2};

		System.out.println("��������� ������-�������� mySourceArray: ");
		writeArrayOnConsole(mySourceArray);
		
		System.out.println("��������� ������ ��� ����������� myDestinationArray �� ���������: ");
		writeArrayOnConsole(myDestinationArray);
		
		//���������� ����� ����������� �������
		myCopyArrayMethod(mySourceArray, 2, myDestinationArray, 5, 2);

		System.out.println("��������� ������ myDestinationArray ����� �����������: ");
		writeArrayOnConsole(myDestinationArray);

	}
 
	public static void myCopyArrayMethod(int []inSourceArray, int innerSourseElement, int []inDestinationArray, int innerDestinationElement, int length){
		
		//������ � ���� ������� ����� ����������� ���������� � ��� ����� ������� � ������� � ����� 
		//int []inSourceArray - ������ � �������� ��������
		//int innerSourseElement - ����� �������� ������� � �������� �������� ����������
		//int []inDestinationArray - ������ � ������� ������������ �����������
		// int innerDestinationElement  - ����� �������� ������� � ������� �������� ���������� ��������
		//int length - ����� �� �����, �� ����� ��� ���������� ��������� ������� � ���� �����������.
		/*
		��� �������� ����������� ������� �� ������ �����?
		��� ����������� ��� int length � ��� int innerDestinationElement,
		�������� � ��������� ������ �������� �� ��� ��� ���� ������� �� ��������� ����� ������ �������
		�� ��� �� ����� ��������� ����� �������, ��� ����� ���������� ����������� ���-�� � ��������, � �������.
		������ ��� ����� ����������������� ������� ������� ��������� �����������
		��������� ��� ���:
		�������� � ��������� ������ �������� �������; �� ��� ��� ���� ������� ������� �� ������� � �������� �������� �������
		���� ��� ������ ������������ ���� ������ ��� ���: i<=innerDestinationElement-1
		
		���������� ������: ���������� ����������� ������� ������� ��� �������� ��� ����������� � ��� �������������� �� �������������
		���� ������� i<innerDestinationElement-1;
		���� ������� i<=innerDestinationElement-1; �� �� ������������� ������ ��������������� ��� ��� ������ � ���� �������� ����������.
		*/ 
		
		//����� � ������ ����� � ������ �������� ������� � ����� � ���������� innerSourseElement
		//������ ��� ����� ����� ����������� ����������� ��� ����� ���������� � ���� ������ �������� ������� � �������� � ����������
		for(int i = innerSourseElement; i<=innerDestinationElement-1;i++){
			//������� �������� ��������� ������� ����� ���������� ��������
			inDestinationArray[i] = inSourceArray[i];
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