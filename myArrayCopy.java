//�������� ���� ������ ������ System.arraycopy()
class myArrayCopy{
	public static void main (String []args){
 
		int[] mySourceArray = {1,1,1,1,1};
		int[] myDestinationArray = {2,2,2,2,2};

		System.out.println("��������� ������-�������� mySourceArray: ");
		writeArrayOnConsole(mySourceArray);
		
		System.out.println("��������� ������ ��� ����������� myDestinationArray �� ��������� : ");
		writeArrayOnConsole(myDestinationArray);
		
		//���������� ����� ����������� �������
		myCopyArrayMethod(mySourceArray, 2, myDestinationArray, 2);

		System.out.println("��������� ������ myDestinationArray ����� �����������: ");
		writeArrayOnConsole(myDestinationArray);

	}
 
	public static void myCopyArrayMethod(int []inSourceArray, int innerSourseElement, int []inDestinationArray, int innerDestinationElement){
		for(int i = 0; i<inSourceArray.length;i++){
			inDestinationArray[innerDestinationElement] = inSourceArray[innerSourseElement];
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