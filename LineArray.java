/*Ќаписать код дл€ очереди. Ёто массив длиной 10 символов. 
» метод к нему, который будет добавл€ть элемент в конец, а остальные сдвигать.*/
class LineArray{
	public static void main (String []args){
		
		int []myArray = {1,5,7,12,3,90,7,16,82};//10 символов
		//переменна€ гле мы задаем число
		int myNewElement = 11;
		//выводим изначальный массив на консоль
		writeArrayOnConsole(myArray);
		//сдвигаем массив и добавл€ем число в конец помощью метода
		addElementToEndOfArray(myArray, myNewElement);
		//выводим измененный массив на консоль
		writeArrayOnConsole(myArray);
		
	}
	public static void addElementToEndOfArray (int []inArr, int inNewElement){
		for(int i = 0; i<inArr.length-1;i++){ //исключаем переполнение
			//значение текущего элемента равно значению последующего элемента
			inArr[i] = inArr[i+1];
		}
		// значение последнего элемента массива равно значению заданному в переменной
		inArr[inArr.length-1] = inNewElement;
	}
	
	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("¬ыводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
}