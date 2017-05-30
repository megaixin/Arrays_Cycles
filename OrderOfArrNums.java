//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, 
//а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1)
class OrderOfArrNums{
	public static void main(String[]args){
		
		int [] myArr = new int [50];

		System.out.println("Заполняем массив нечетными числами: ");
		for(int i = 0;i<myArr.length;i++){
			myArr[i] =  2 * i + 1;
		}
		writeArrayOnConsole(myArr);
		
		System.out.println("Выводим массив задом наперед: ");
		for(int i = myArr.length-1;i>=0;i--){
			System.out.print(myArr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("Выводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
}
	
