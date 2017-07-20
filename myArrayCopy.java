//Написать свой аналог метода System.arraycopy()
class myArrayCopy{
	public static void main (String []args){
 
		int[] mySourceArray = {3,6,44,9,18,84,56};
		int[] myDestinationArray = {2,2,2,2,2,2,2};

		System.out.println("Вывоводим массив-оригинал mySourceArray: ");
		writeArrayOnConsole(mySourceArray);
		
		System.out.println("Вывоводим массив для копирования myDestinationArray ДО изменений: ");
		writeArrayOnConsole(myDestinationArray);
		
		//используем метод копирования массива
		myCopyArrayMethod(mySourceArray, 2, myDestinationArray, 5, 2);

		System.out.println("Вывоводим массив myDestinationArray после копирования: ");
		writeArrayOnConsole(myDestinationArray);

	}
 
	public static void myCopyArrayMethod(int []inSourceArray, int innerSourseElement, int []inDestinationArray, int innerDestinationElement, int length){
		
		//теперь я хочу научить прогу переставать копировать в том месте массива в котором я укажу 
		//int []inSourceArray - массив с которого копируем
		//int innerSourseElement - номер элемента массива с которого начинаем копировать
		//int []inDestinationArray - массив в который производится копирование
		// int innerDestinationElement  - номер элемента массива в который начинаем копировать оригинал
		//int length - точно не скажу, но вроде как количество элементов которые я хочу скопировать.
		/*
		как прервать копирование массива на нужной точке?
		нам понадобится это int length и это int innerDestinationElement,
		начинаем с заданного номера элемента до тех пор пока элемент не достигнет конца длинны массива
		но нам не нужно достигать конца массива, нам нужно остановить копирование где-то в середине, к примеру.
		значит нам нужно запрограммировать элемент который прекратит копирование
		попробуем еще раз:
		начинаем с заданного номера элемента массива; до тех пор пока текущий элемент не упрется в заданный конечный элемент
		пока что угрозу переполнения буду лечить вот так: i<=innerDestinationElement-1
		
		любопытная деталь: переменная указывающая элемент массива как конечный для копирования и его предщественник не затрагивается
		если указать i<innerDestinationElement-1;
		если указать i<=innerDestinationElement-1; то не затрагивается только непосредственно тот что хранит в себе конечную переменную.
		*/ 
		
		//здесь я задала старт с номера элемента который я кладу в переменную innerSourseElement
		//каждый раз когда будет происходить копирование оно будет начинаться с того номера элемента который я положила в переменную
		for(int i = innerSourseElement; i<=innerDestinationElement-1;i++){
			//текущее значение конечного массива равно финальному элементу
			inDestinationArray[i] = inSourceArray[i];
		}
	}

	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("Выводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
 }