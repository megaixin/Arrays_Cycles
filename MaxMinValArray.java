//1)отыскать наименьшее и наибольшее числа массива 2) поменять их местами
class MaxMinValArray{
	public static void main(String[]args){
		int[]myArray = { 5, 7, 5, 2, 11, 7, 5, 20, 12};

		int myMaxValOfArray = myArray[0];
		int positionOfMaxValue = myArray[myMaxValOfArray];
		
		for(int i = 0; i<myArray.length;i++){
			
			if(myMaxValOfArray < myArray[i]){
				myMaxValOfArray = myArray[i];
				positionOfMaxValue = i;
			}
		}
		System.out.println("\nСамое большое число в массиве: "+ myMaxValOfArray +" "+ "в ячейке "+ positionOfMaxValue);

		int myMinValOfArray = myArray[0];
		int positionOfMinValue = myArray[myMinValOfArray];
		for(int i = 0;i< myArray.length;i++){
		
			if(myMinValOfArray > myArray[i]){
				myMinValOfArray = myArray[i];
				positionOfMinValue = i;
			}
		}
		System.out.println("\nСамое маленькое число в массиве: "+ myMinValOfArray + " в ячейке "+ positionOfMinValue);

		System.out.println("Выводим обычный массив: ");
			for(int i = 0; i<myArray.length;i++){
			System.out.print(myArray[i]+" ");
		}
		System.out.println();

		myArray[positionOfMaxValue] = myMinValOfArray;
		myArray[positionOfMinValue] = myMaxValOfArray;

		System.out.println("Выводим измененный массив: ");
			for(int i = 0; i<myArray.length;i++){
			System.out.print(myArray[i]+" ");
		}
		System.out.println();





	}
}