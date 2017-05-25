//метод возвращающий позицию самого большого числа в строке массива
class ArrayMethod{
	public static void main (String[]args){
		
		int []myArr = {1, 5, 4, 3};
		
	}

	public static int returnPositionOfMaxValue(int [] inArray){
		//кладем в переменную inArray[0];(значение элемента массива)
		int maxValOfArray = inArray[0];
		//кладем в переменную 0; (позиция элемента массива)
		int positionOfMaxVal = 0;
		//пилим цикл
		for (int i =0; int i<inArray.length;i++){
			//если значение переменной меньше текущего значения элемента в массиве
			if (maxValOfArray<inArray[i]){
				//то кладем в переменную текущее значение
				maxValOfArray = inArray[i];
				// кладем  в 2-ю переменную позицию текущего хначения
				positionOfMaxVal = i;
			}
		}	
		//возвращаем переменную с позицией ячей
		return positionOfMaxVal;
	}
	

	
}