//������� ����� ��������� �������, ������� ��������� ����� ����� ������. ���� ���� ����� � ������� ��� - ������� 0
class NullArray{
	public static void main (String[]args){
		
		int[]myArr = {6,0,5,11,2,1,0,0};
		
		int firstNullPosition = 0;
		int secondNullPosition = 0;
		
		for (int i = 0;i<myArr.length;i++){
			if (myArr[i]==0){
				firstNullPosition = i;
				break;
			}
		}			
		System.out.println("������ ���� �� ������� - "+ firstNullPosition);
		
		for (int i = firstNullPosition+1;i<myArr.length;i++){
			if (myArr[i]==0){
				secondNullPosition = i;
				break;
			}
		}
		System.out.println("������ ���� �� ������� - "+ secondNullPosition );
		
		int valueBetweenZeros = 0;
		for(int i = firstNullPosition; i<myArr.length;i++){
			valueBetweenZeros = valueBetweenZeros + myArr[i];
			if(myArr[i]==secondNullPosition){
				break;
			}
		}
		System.out.println(valueBetweenZeros);
	}	
}