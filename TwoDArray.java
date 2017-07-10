/*Cоздать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. 
¬ывести массив на экран. 
ѕреобразовать массив таким образом, чтобы на первом месте в каждой строке сто€л ее наибольший элемент.
ѕри этом измен€ть состав массива нельз€, а можно только переставл€ть элементы в рамках одной строки. 
ѕор€док остальных элементов строки не важен (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку).
¬ывести преобразованный массив на экран.*/
class TwoDArray{
	public static void main (String[]args){
		
		//Cоздать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. 
		int [][] myTwoDArr = new int[6][7];
		
		for(int i = 0;i<6;i++){
			for(int j =0;j<7;j++){
				myTwoDArr[i][j] = (int)(Math.random()*10);
			}
		}		
		//¬ывести массив на экран
		for (int i = 0;i<6;i++){
			for(int j=0;j<7;j++){
				System.out.print(myTwoDArr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//вывести наибольший элемент каждой строки
		int myMaxValOfTwoDArr = myTwoDArr[0][0];
		for (int i = 0;i<myTwoDArr.length;i++){//пока не кончатс€ строки массива
			//обнул€ем наибольшее
			myMaxValOfTwoDArr = -9999999;
			for( int j = 0; j<myTwoDArr[i].length;j++){//пока текущее значение столбика не достигнет конца длинны строки
				//ищем наибольшее число в текущей строке массива
				if(myMaxValOfTwoDArr < myTwoDArr[i][j]){
					myMaxValOfTwoDArr = myTwoDArr[i][j];
					//мен€ем местами наибольшее с нулевым элементом в каждой строке
					if (myTwoDArr[i][j]== myMaxValOfTwoDArr){
						//то, что делаем при совпадении результата
						myTwoDArr[i][j] = myTwoDArr[j][0];
					}	myTwoDArr[i][0] = myMaxValOfTwoDArr;
				
				}//нужна переменна€ котора€ будет хранить значение €чейки котора€ должна "перепрыгнуть" на место наибольшего значени€(?)			
			}
			//выводим наибольшие числа в каждой строке массива
			System.out.println("¬ строке номер " + i + " самое большое число "+ myMaxValOfTwoDArr);

		}
		for (int x =0; x<myTwoDArr.length;x++){
			for( int y = 0; y<myTwoDArr[x].length;y++){
				//проверка путем сравнени€
				if (myTwoDArr[x][y]== myMaxValOfTwoDArr){
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

		//- помен€ть нулевой и наибольший местами
	}		
}
