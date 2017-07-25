//Написать свой аналог метода System.arraycopy()
class myArrayCopy{
	public static void main (String []args){
 
		int[] mySourceArray = {12,16,44,91,18,84,25};//7
		int[] myDestinationArray = {1,1,1,1,1,1,1};//7

		System.out.println("‚ывоводим массив-оригинал mySourceArray: ");
		writeArrayOnConsole(mySourceArray);
		
		System.out.println("‚ывоводим массив длЯ копированиЯ myDestinationArray после изменений: ");
		writeArrayOnConsole(myDestinationArray);
		
		//используем метод копированиЯ массива
		myCopyArrayMethod(mySourceArray, 1, myDestinationArray, 4, 3);

		System.out.println("‚ывоводим массив myDestinationArray после копирования: ");
		writeArrayOnConsole(myDestinationArray);
	}
 
	public static void myCopyArrayMethod(
		int []inSourceArray, 		//исходный массив из которого копируем
		int inSourceElement, 		//номер элемента исходного массива с которого начинаем копирование
		int []inDestArray, 			//конечный массив, в который копируем
		int inDestElement, 			//начальный номер элемента конечного массива в который копируем
		int inCountOfCopyElement){ 	//количество копируемых элементов из исходного в копируемый элемент
			
		for(int i = inSourceElement; i<inSourceArray.length;i++){//начинаем с номера элемента указанного в переменной; пока i меньше длинны массива;итератор +
			inDestArray[inDestElement] = inSourceArray[inSourceElement];
			
			// из исходного массива, начинаЯ с конкретного номера Ячейки, нам нужно выделить три элемента и положить их
			//в конечный массив, начинаЯ копирование с конкретного номера Ячейки и до конца указанной длинны массива
			
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