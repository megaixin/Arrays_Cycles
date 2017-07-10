/*Cоздать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. 
Вывести массив на экран. 
Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял ее наибольший элемент.
При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки. 
Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку).
Вывести преобразованный массив на экран.*/
class TwoDArray{
	public static void main (String[]args){
		
		//Cоздать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. 
		int [][] myTwoDArr = new int[6][7];//строки - 6 столбцы - 7
		
		for(int i = 0;i<6;i++){
			for(int j =0;j<7;j++){
				myTwoDArr[i][j] = (int)(Math.random()*10);
			}
		}		
		//Вывести массив на экран
		for (int i = 0;i<6;i++){
			for(int j=0;j<7;j++){
				System.out.print(myTwoDArr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//вывести наибольший элемент каждой строки
		int myMaxValOfTwoDArr = myTwoDArr[0][0];
		for (int i = 0;i<myTwoDArr.length;i++){//пока не кончатся строки массива
			myMaxValOfTwoDArr = -9999999;
			for( int j = 0; j<myTwoDArr[i].length;j++){//пока текущее значение столбика не достигнет конца длинны строки
				
				if(myMaxValOfTwoDArr < myTwoDArr[i][j]){
					myMaxValOfTwoDArr = myTwoDArr[i][j];
				}
			}
			System.out.println("В строке номер " + i + " самое большое число "+ myMaxValOfTwoDArr);
	
		}
		for (int x =0; x<myTwoDArr.length;x++){
			for( int y = 0; y<myTwoDArr[x].length;y++){
				//проверка путем сравнения
				if (myTwoDArr[x][y]= myMaxValOfTwoDArr){
					//то, что делаем при совпадении результата
					myTwoDArr[x][y] = myTwoDArr[x][0];
					myTwoDArr[x][0] = myMaxValOfTwoDArr;
				}
			}
		}
	
		for (int i = 0;i<6;i++){
			for(int j=0;j<7;j++){
				System.out.print(myTwoDArr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		// - вывести нулевой и наибольший элемент каждой строки, а также их позиции

		//- поменять нулевой и наибольший местами
	}		
}
