//Найдите сумму элементов массива, которые находятся между двумя нулями. Если двух нулей в массиве нет - вывести 0
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
		System.out.println("Первый ноль на позиции - "+ firstNullPosition);
		
		for (int i = firstNullPosition+1;i<myArr.length;i++){
			if (myArr[i]==0){
				secondNullPosition = i;
				break;
			}
		}
		System.out.println("Второй ноль на позиции - "+ secondNullPosition );
		
		int valueBetweenZeros = 0;
		for(int i = firstNullPosition; i<myArr.length;i++){
			valueBetweenZeros = valueBetweenZeros + myArr[i];
			if(myArr[i]==secondNullPosition){
				break;
			}
		}
		System.out.println("Cумма чисел между позициями ["+firstNullPosition+"] и ["+secondNullPosition+"] равна "+valueBetweenZeros);
	}
}