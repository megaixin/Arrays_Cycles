//Написать свой аналог метода System.arraycopy()
class myArrayCopy{
	public static void main (String []args){
 
		int[] mySourceArray = {1,1,1,1,1};
		int[] myDestinationArray = {2,2,2,2,2};

		System.out.println("n/Вывоводим массив-оригинал mySourceArray: ");
		writeArrayOnConsole(mySourceArray);
		System.out.println("n/Вывоводим массив для копирования myDestinationArray ДО изменений : ");
		writeArrayOnConsole(myDestinationArray);
		
		
		for(int i =0; i<mySourceArray.length;i++){
			myDestinationArray[i] = mySourceArray[i];
		}
		System.out.println("Вывоводим массив myDestinationArray после копирования: ");
		writeArrayOnConsole(myDestinationArray);
		
	/*
	цикл будет делать так:
	начиная с нуля  пока не кончится длинна массива оригинала итератор плюс
*/
	}
 
 

	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("¬ыводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}

 }