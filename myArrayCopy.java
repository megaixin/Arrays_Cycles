//Написать свой аналог метода System.arraycopy()
class myArrayCopy{
	public static void main (String []args){
 
		int[]inArr = {1,4,7,12,7,8,9};
		int [] secondArr = new int[7];
		writeArrayOnConsole(inArr);
		writeArrayOnConsole(secondArr);
		myCopyArrayMethod(inArr, secondArr);
		writeArrayOnConsole(secondArr);
	/*
	Написать метод который копирует данные из массива.

	Мой метод должен принимать изначальный массив как параметр и копировать в другой массив его данные(скопированные из первого)
	первый параметр - имя входящего массива;
	второй параметр - номер ячейки этого массива с которого начнется копирование;
	третий параметр - имя массива в который будут копироваться объекты
	четвертый параметр - номер ячейки этого массива в который начнется комирование
	пятый параметр - длинна массива

	разбираем пример:
	нам дан массив 
	int []myStartArray = {1,5,7,12,3,90};
	создаем еще один массив  длинной 3
	int []myCopyArray = new int [6];
	нужно скопировать из первого во второй массив все данные начиная с нулевой ячейки
	и до конца длинны массива.
 
	даем задание программе: 
	цикл
	пока не закончится длинна массива
	берем массив с именем myArray, начиная с нулевой ячейки и заносим данные в ячейки myArray2:
	myStartArray[0] = myCopyArray[0];//значение 0-й ячейки массива myCopyArray равно значению 0-й ячейки массива myStartArray
	myStartArray[1] = myCopyArray[1];//значение 1-й ячейки массива myCopyArray равно значению 2-й ячейки массива myStartArray
	myStartArray[2] = myCopyArray[2];//значение 2-й ячейки массива myCopyArray равно значению 3-й ячейки массива myStartArray
	myStartArray[3] = myCopyArray[3];//значение 3-й ячейки массива myCopyArray равно значению 4-й ячейки массива myStartArray
	myStartArray[4] = myCopyArray[4];//значение 4-й ячейки массива myCopyArray равно значению 5-й ячейки массива myStartArray
	myStartArray[5] = myCopyArray[5];//значение 5-й ячейки массива myCopyArray равно значению 6-й ячейки массива myStartArray

*/
	}
 
 
	public static void myCopyArrayMethod(int[]startArr, int[]copyArr){
		for(int i = 0;i<copyArr.length;i++){
			startArr[0] = copyArr[0];
		}
	}
	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("¬ыводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
 
 
 }