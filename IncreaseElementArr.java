//Напишите метод, который будет увеличивать заданный элемент массива на 10%.
class IncreaseElementArr{
	public static void main (String[]args){

		int [] myArr = {6,44,5,4,14,0,11};
		writeArrayOnConsole(myArr);
		increaseElementOfArray(myArr,4);
		writeArrayOnConsole(myArr);
	}
	public static void increaseElementOfArray( int[]inArr, int inElement){
        double var = inArr[inElement]*1.1;
		inArr[inElement] = (int)( Math.round(var));
	}

	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("Выводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
	
	/*
	14/100 = 0.14 - один процент
	0.14*10 = 1.4 - 10 процентов
	14 + 1.4 = 15.4
	*/
}