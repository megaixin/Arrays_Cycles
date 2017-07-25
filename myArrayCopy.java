//Ќаписать свой аналог метода System.arraycopy()
class myArrayCopy{
	public static void main (String []args){
 
		int[] mySourceArray = {12,16,44,91,18,84,25};//7
		int[] myDestinationArray = {1,1,1,1,1,1,1};//7

		System.out.println("Вывоводим массив-оригинал mySourceArray: ");
		writeArrayOnConsole(mySourceArray);
		
		System.out.println("Вывоводим массив для копирования myDestinationArray после изменений: ");
		writeArrayOnConsole(myDestinationArray);
		
		//используем метод копирования массива
		myCopyArrayMethod(mySourceArray, 1, myDestinationArray, 3, 3);

		System.out.println("Вывоводим массив myDestinationArray после копировани¤: ");
		writeArrayOnConsole(myDestinationArray);
	}
 
	public static void myCopyArrayMethod(
		int []inSourceArray, 		//исходный массив из которого копируем
		int inSourceElement, 		//номер элемента исходного массива с которого начинаем копирование
		int []inDestArray, 			//конечный массив, в который копируем
		int inDestElement, 			//начальный номер элемента конечного массива в который копируем
		int inCountOfCopyElement){ 	//количество копируемых элементов из исходного в копируемый элемент
			
		inDestArray[inDestElement] = inSourceArray[inSourceElement];

	}

	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("¬ыводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
 }