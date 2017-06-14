//Создайте массив целых чисел, заполните его только четными числами, а затем каждый второй элемент умножьте на предыдущий. 
class MultiplyNum {
	public static void main (String []args){
		//создаем массив целых чисел
		int [] myArr = new int [6];
		//заполняем его четными числами
		for(int i = 0; i<myArr.length;i++){
			myArr[i] =  2 * i;
		}
		//выводим массив
		writeArrayOnConsole(myArr);
		//создаем второй массив который будет служить клоном/дополнительным массивом
		int [] myCloneArr = new int [6];
		//используем метод копирования для заполнения клона
		System.arraycopy(myArr, 0, myCloneArr, 0, myArr.length);
		//выводим заполненный массив на консоль
		writeArrayOnConsole(myCloneArr);
		
		
		
		for (int i = 0; i<myArr.length-1;i++){
		
			
		}
		writeArrayOnConsole(myArr);
		
		/*
		нам надо умножать значения в одном массиве, а результат ложить в другой как если бы это был первый.
		значения должны ложиться в ходе того как умножаются и идут по циклу дальше числа.
		два цикла? 
		один цикл умножает в первом массиве, второй цикл заполняет второй массив
		//пилим цикл
			//каждое второе значение элемента массива умножаем на предыдущее
				//внутренний цикл
					//в каждое второе значение элемента массива кладем сумму результата вычисления внешнего цикла
		нужна дополнительная переменная?
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