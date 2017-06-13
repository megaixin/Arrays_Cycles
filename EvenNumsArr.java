//Создайте массив целых чисел, заполните его только четными числами, а затем каждый второй элемент умножьте на предыдущий. 
class EvenNumsArr{
	public static void main (String [] args){
		//создаем массив целых чисел
		int [] myArr = new int [6];
		//заполняем его четными числами
		for(int i = 0; i<myArr.length;i++){
			myArr[i] =  2 * i;
		}
		System.out.println("Выводим массив состоящий из четных чисел: ");
		writeArrayOnConsole(myArr);
		

		for(int i = 0;i<myArr.length;i+=2){
			myArr[i+1] = myArr[i+1] * myArr[i];
		}
		
		System.out.println("Каждый второй элемент массива умножен на предыдущий: ");
		writeArrayOnConsole(myArr);
		

		
	}
	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("Выводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
	
	
	
}