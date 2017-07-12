/*Cоздать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. 
¬ывести массив на экран. ѕреобразовать массив таким образом, чтобы на первом месте в каждой строке сто€л ее наибольший элемент.
ѕри этом измен€ть состав массива нельз€, а можно только переставл€ть элементы в рамках одной строки. 
ѕор€док остальных элементов строки не важен (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку).
¬ывести преобразованный массив на экран.*/
class TwoDArray{
	public static void main (String[]args){
		 
		int [][] myTwoDArr = new int[6][7];
		
		for(int i = 0;i<6;i++){										//заполнение двумерного массива числами
			for(int j =0;j<7;j++){
				myTwoDArr[i][j] = (int)(Math.random()*10);
			}
		}															
		
		for (int i = 0;i<6;i++){                            		//¬ывод массива на экран
			for(int j=0;j<7;j++){
				System.out.print(myTwoDArr[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i = 0;i<myTwoDArr.length;i++){					
			int mostValuePosition = findMostValueOfArray(myTwoDArr[i]);	//вывести позицию максимального числа
			System.out.println("¬ строке номер " + i + " самое большое число на позиции "+ mostValuePosition);
		
		}	

		for (int i = 0;i<6;i++){									//вывести массив повторно
			for(int j=0;j<7;j++){
				System.out.print(myTwoDArr[i][j]+" ");         
			}
			System.out.println();
		}
	}		
	public static int findMostValueOfArray(int[]inArr){
		//переменна€ дл€ сравнивани€
		int maxValOfArray = inArr[0];
		//позици€ наибольшего числа
		int positionOfMax = 0;
		//цикл
		for(int i = 0;i<inArr.length;i++){
			//если переменна€ меньше чем текущее число
			if(maxValOfArray<inArr[i]){
				//текущее число ложитс€ в переменную
				maxValOfArray = inArr[i];
				positionOfMax = i;
			}
		}
		//возвращать позицию наибольшего числа
		return positionOfMax;
	}			
}