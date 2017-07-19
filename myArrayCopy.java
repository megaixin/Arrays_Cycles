//Написать свой аналог метода System.arraycopy()
class myArrayCopy{
	public static void main (String []args){
 
		int[] mySourceArray = {1,1,1,1,1};
		int[] myDestinationArray = {2,2,2,2,2};

		System.out.println("Вывоводим массив-оригинал mySourceArray: ");
		writeArrayOnConsole(mySourceArray);
		
		System.out.println("Вывоводим массив для копирования myDestinationArray ДО изменений : ");
		writeArrayOnConsole(myDestinationArray);
		
		//используем метод копирования массива
		myCopyArrayMethod(mySourceArray, myDestinationArray);

		System.out.println("Вывоводим массив myDestinationArray после копирования: ");
		writeArrayOnConsole(myDestinationArray);

	}
 
	public static void myCopyArrayMethod(int []inSourceArray, int []inDestinationArray){
		for(int i = 0; i<inSourceArray.length;i++){
			inDestinationArray[i] = inSourceArray[i];
		}
	}

	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("¬ыводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}

 }