//Написать метод, который заполнит массив произвольного размера числами по возрастанию, начинаz с центра массива, 
//например, [5,4,3,2,1,0,1,2,3,4,5]
class CenterArray {
	public static void main (String[]args){
	
		int [] arr = new int [11];

		fillWithNumsFromCenterArr(arr);
		writeArrayOnConsole(arr);
	}

	public static void fillWithNumsFromCenterArr(int [] inArr){
		for (int i = 0;i<inArr.length/2;i++){
			inArr[0] = i+1;
			inArr[inArr.length-1] = inArr[inArr.length-2]+1;
			
			inArr[inArr.length/2+i] = i;		
			inArr[inArr.length/2-i] = i;
	
		}
	}
	
	//если делать два цикла то проблема та же что и до того как я ввела строки 
	//inArr.length и inArr[inArr.length-1] = inArr[inArr.length-2]+1;
	//массив не выполняется до конца
	//даже если сделать i<=inArr.length/2 - это работает только на нечетной длинне массива.
	//а если длинна массива четная - переполнение.
	//даже если это можно вылечить добавлением в циклы тех строк (inArr[0] = i+1;inArr[inArr.length-1] = inArr[inArr.length-2]+1;)
	//но как по мне лучше предыдущая версия, она получается короче.
	
	/*public static void fillWithNumsFromCenterArr(int [] inArr){
		for (int i = 0;i<=inArr.length/2;i++){
			inArr[inArr.length/2+i] = i;		
			
			for(int j = 0;j<=inArr.length/2;j++){
				inArr[inArr.length/2-j] = j;
			}
		}
	}*/
	
	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("Выводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
}