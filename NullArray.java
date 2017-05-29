//Найдите сумму элементов массива, которые находятся между двумя нулями. Если двух нулей в массиве нет - вывести 0
class NullArray{
	public static void main (String[]args){
		
		int[]myArr = {6,0,5,5,2,1,0,0};
		
		// целочисленная переменная номер 1 (хранит позицию в которой первый 0)
		int firstNullPosition = 0;
		//целочисленная переменная номер 2 (хранит позицию в которой второй 0)
		int secondNullPosition = 0;
		
		//пилим цикл (для первого нуля)
		for (int i = 0;i<myArr.length;i++){
			// если текущий элемент массива = 0
			if (myArr[i]==0){
				//то кладем его в переменную(фиксируем 1-й ноль)
				firstNullPosition = i;
			break;
			}
			
		}			
		System.out.println("Первый ноль на позиции - "+ firstNullPosition);
		
		//пилим цикл(для второго нуля)
		for (int i = firstNullPosition+1;i<myArr.length;i++){
			//если текущий элемент массива = 0 {
			if (myArr[i]==0){
				//то кладем его во вторую переменную(фиксируем 2-й ноль)
				secondNullPosition = i;
			break;
			}
		
		}
		 System.out.println("Второй ноль на позиции - "+ secondNullPosition );
		/*
		часть проблемы в фиксировании первого нуля в массиве решена оператором брейк. 
		другая часть проблемы фиксирования второго нуля решена оператором брейк.
		пара проверок прошла успешно: имеем четкие позиции двух нулей.
		*/
	
		//переменная для накапливания общ.суммы =0;
		int valueBetweenZeros = 0;
		//пилим цикл, начало от firstNullPosition{
		for(int i = firstNullPosition; i<myArr.length;i++){
			//valueBetweenZeros плюс текущее значение
				valueBetweenZeros = valueBetweenZeros + myArr[i];
				//если текущее значение равно secondNullPosition
					if(myArr[i]==secondNullPosition){
					break;
		
			}
		}
		System.out.println(valueBetweenZeros);
	
	
	}	
	
/*	переменная для накапливания общ.суммы =firstNullPosition плюс текущее значение
	 
	 есть две позиции и то, что между ними - нужно суммировать
	 то есть:
	 идем от первой позиции найденого нуля , (начало0) + 5 +5 + 2 + 1 + (0конец) до позиции второго найденного нуля
	 то есть firstNullPosition + myArr[i]+myArr[i]+myArr[i]+myArr[i]+secondNullPosition
	 valueBetweenZeros + myArr[i];
	 если myArr[i]=secondNullPosition
	 break;
	Вывод: (sum)
	*/

}