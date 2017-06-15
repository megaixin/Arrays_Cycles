// Напишите программу, которая заменяет все элементы массива, кроме крайних, на полусумму соседей, и печатает результат.
class HalfSum{
	public static void main (String []args){
		
		int [] myArr = {9,3,12,6,10,3};
		//пробуем создать массив типа double с такой же длинной как у массива типа int 
		double[] myCloneArr = new double[myArr.length];
		//клонируем чтобы в него параметры массива типа int
		System.arraycopy(myArr, 0, myCloneArr, 0, myArr.length);
		//пытаемся вывести double типа массив, терпим крах из-за проблем с преобразованием
	
		
		
		for (int i = 1;i<myArr.length-1;i++){  
			myArr[i] = (myArr[i-1] + myArr[i+1])/2;
		
		}

		
		writeArrayOnConsole(myCloneArr);
	}
	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("Выводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
}