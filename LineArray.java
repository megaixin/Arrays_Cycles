/*�������� ��� ��� �������. ��� ������ ������ 10 ��������. 
� ����� � ����, ������� ����� ��������� ������� � �����, � ��������� ��������.*/
class LineArray{
	public static void main (String []args){
		
		int []myArray = {1,5,7,12,3,90,7,16,82,0};//10 ��������
		
		int myNewElement = 9;
		writeArrayOnConsole(myArray);

		addElemetnToEndOfArray(myArray, myNewElement);
		writeArrayOnConsole(myArray);
		
		/*
		{5,7,12,3, } - �������� �� 1-� ������ ������� � �������, �������� �� 2-� - � 1-� � �.�.
		�������� 
		����
		���������� ��� ����� ����� � ���������
		������������ ��������, �� ���� ���������
		*/
		
	}
	public static void addElemetnToEndOfArray (int []inArr, int inNewElement){
		for(int i =0; i<inArr.length-1;i++){
			inArr[i]=inArr[i+1];
			inArr[inArr.length-1] = inNewElement;
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