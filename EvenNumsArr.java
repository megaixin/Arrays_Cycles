//Создайте массив целых чисел, заполните его только четными числами, а затем каждый второй элемент умножьте на предыдущий. 
class EvenNumsArr{
	public static void main (String [] args){
		//создаем массив целых чисел
		int [] myArr = new int [6];
		//заполняем его четными числами
		for(int i = 0; i<myArr.length;i++){
			myArr[i] =  2 * i;
		}
		writeArrayOnConsole(myArr);
		

		for(int i = 0;i<myArr.length;i+=2){
			myArr[i+1] = myArr[i+1] * myArr[i];
		}
		writeArrayOnConsole(myArr);
		
		/*
		каждый второй элемент массива 
		это значит каждый второй: myArr[i+1]
		умножить на предыдущий: myArr[i-1]
		{0,2,4,6,8,10};
		{0,2*0,4,6*4,8,10*8};
		{0,0,4,24,8,80};
		старт 0
		каждый второй элемент массива должен быть умножен на предыдущий
		у нас в массиве 2-й элемент в ячейке номер 1
		предыдущий - в ячейке номер 0
		myArr[1] * myArr[0]
		результат кладем в  myArr[1]
		это значит: 2*0 = 0
		на место значения  [2] кладем значение [0]
		{0,0,4,6,8,10};
		итерация - +2
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		*/
		
	}
	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("Выводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
	
	
	
}