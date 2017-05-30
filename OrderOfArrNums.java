//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, 
//а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1)
class OrderOfArrNums{
	public static void main(String[]args){
		
		int [] myArr = new int [49];

		
		for(int i = 0;i<myArr.length;i++){
			myArr[i] =  2 * i + 1;
		}
		writeArrayOnConsole(myArr);
	}	
		/*
		- массив от 1 до 99  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.....}
		- в виде номеров ячеек {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25....}
		- от 1 до 99 нечетных это в виде ячеек {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31.......}
		*/
		
		/*myArr[i] =  2 * i + 1;
		текущее значение равно 2 умножить на элемент массива плюс 1
		это значит:
		myArr[0] =  2 * 0 + 1 = 1
		myArr[1] =  2 * 1 + 1 = 3
		myArr[2] =  2 * 2 + 1 = 5
		myArr[3] =  2 * 3 + 1 = 7
		myArr[4] =  2 * 4 + 1 = 9
		myArr[i] =  2 * i + 1 = 11
		*/
	
		public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("Выводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
}
	
