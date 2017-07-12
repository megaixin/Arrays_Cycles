class testTwoDArray{
	public static void main (String[]args){

		int [][] myTwoDArr = new int[6][7];
		
		for(int i = 0;i<6;i++){
			for(int j =0;j<7;j++){
				myTwoDArr[i][j] = (int)(Math.random()*10);
			}
		}		
		//Вывод массива на экран
		for (int i = 0;i<6;i++){
			for(int j=0;j<7;j++){
				System.out.print(myTwoDArr[i][j]+" ");
			}
			System.out.println();
		}
		
	
		for (int i = 0;i<myTwoDArr.length;i++){					
			//myMaxValOfTwoDArr = -9999999;
			int findMostValue = findMostValueOfArray(myTwoDArr[i]);
		System.out.println("В строке номер " + i + " самое большое число на позиции "+ findMostValue);
		}	
		
	
	
	
	
	}	
/*
метод для поиска наибольших чисел в строках двумерного массива
должен отыскивать наибольшее число в строке и возвращать позицию наибольшего числа.
метод будет выглядеть так:*/
	public static int findMostValueOfArray(int[]inArr){
		//переменная для сравнивания
		int maxValOfArray = inArr[0];
		//позиция наибольшего числа
		int positionOfMax = 0;
		//цикл
		for(int i = 0;i<inArr.length;i++){
			//если переменная меньше чем текущее число
			if(maxValOfArray<inArr[i]){
				//текущее число ложится в переменную
				maxValOfArray = inArr[i];
				positionOfMax = i;
			}
		}
		//возвращать позицию наибольшего числа
		return positionOfMax;
	}
}