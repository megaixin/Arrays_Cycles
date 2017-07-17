/*Написать код для очереди. Это массив длиной 10 символов. 
И метод к нему, который будет добавлять элемент в конец, а остальные сдвигать.*/
class LineArray{
	public static void main (String []args){
		
		int []myArray = {1,5,7,12,3,90,7,16,82,0};//10 символов
		
		int myNewElement = 9;
		writeArrayOnConsole(myArray);

		addElemetnToEndOfArray(myArray, myNewElement);
		writeArrayOnConsole(myArray);
		
		/*
		{5,7,12,3, } - ЗНАЧЕНИЕ ИЗ 1-Й ЯЧЕЙКИ ЛОЖИТСЯ В НУЛЕВУЮ, ЗНАЧЕНИЕ ИЗ 2-Й - В 1-Ю и т.д.
		алгоритм 
		цикл
		переменная под новое число в атрибутах
		клонирование значений, то есть здвигание
		*/
		
	}
	public static void addElemetnToEndOfArray (int []inArr, int inNewElement){
		for(int i =0; i<inArr.length-1;i++){
			inArr[i]=inArr[i+1];
			inArr[inArr.length-1] = inNewElement;
		}
	}
	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("Выводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
	
}