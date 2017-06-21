//Написать метод, который заполнит массив произвольного размера числами по возрастанию, начинаz с центра массива, 
//например, [5,4,3,2,1,0,1,2,3,4,5]
class CenterArray {
	public static void main (String[]args){
	
		int [] arr = new int [16];

		fillWithNumsFromCenterArr(arr);
		writeArrayOnConsole(arr);
	}

	public static void fillWithNumsFromCenterArr(int [] inArr){
		for (int i = 0;i<inArr.length/2;i++){
			inArr[inArr.length/2+i] = i;		
			inArr[inArr.length/2-i] = i;
			
			inArr[0] = i+1;
			inArr[inArr.length-1] = inArr[inArr.length-2]+1;
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