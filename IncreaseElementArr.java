//Напишите метод, который будет увеличивать заданный элемент массива на 10%.
class IncreaseElementArr{
	public static void main (String[]args){

		int [] myArr = {6,44,5,4,14,0,11};
		writeArrayOnConsole(myArr);
		increaseElementOfArray(myArr,2);
		writeArrayOnConsole(myArr);
	}
	public static void increaseElementOfArray( int[]inArr, int inElenent){
		
		inArr[inElenent] = inArr[inElenent]*10;

	}

	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("Выводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	
	}
	
	
}