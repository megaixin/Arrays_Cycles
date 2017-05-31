// Отсортировать массив по возрастанию/метод пузырька.
class BubbleSort{
	public static void main(String[]args){
		
		int []myArr = {11,5,4,3,8,1,9};
		
		System.out.println("Изначальный массив: ");
		writeArrayOnConsole(myArr);
		
		//внешний цикл 
		for(int i = 0; i<myArr.length;i++){
			//внутренний цикл
			for(int k = 0; k<myArr.length-1;k++){
				int a = myArr[k];
				int b = myArr[k+1];
				//если текущее число больше чем последующее 
				if(myArr[k]>myArr[k+1]){
					//меняем их местами
					myArr[k+1] = a;
					myArr[k] = b;
				}
			}
		}	
		//выводим массив на консоль
		System.out.println("Отсортированный массив: ");
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