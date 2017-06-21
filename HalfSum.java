// Напишите программу, которая заменяет все элементы массива, кроме крайних, на полусумму соседей, и печатает результат.
class HalfSum{
	public static void main (String []args){
		//целочисленный массив
		int [] myArr = {9,3,12,6,10,3};
		
		//создаем массив типа double с такой же длинной как у массива типа int 
		double[] myDoubleArr = new double[myArr.length];//это значит, что длинна массива myDoubleArr - 6
		
		//пробуем наполнить дробный тип массива содержимым целочисленного массива
		//чтобы в дробного типа массиве были те же числа что и в целочисенном массиве
		 
		for (int i = 0; i < myArr.length; i++){
			myDoubleArr[i] = (double) myArr[i];
		}
		
		//заменЯем все элементы кроме крайних на полусумму соседей текущего числа целочисленного массива
		for (int i = 1;i<myDoubleArr.length-1;i++){  
			myDoubleArr[i] = (myArr[i-1] + myArr[i+1])/2.0;
		
		}		
		
		writeArrayOnConsole(myDoubleArr);
	}
	
	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("‚ыводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
}