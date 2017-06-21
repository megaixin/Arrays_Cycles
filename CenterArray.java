//Написать метод, который заполнит массив произвольного размера числами по возрастанию, начинаz с центра массива, 
//например, [5,4,3,2,1,0,1,2,3,4,5]
class CenterArray {
	public static void main (String[]args){
	
		int [] arr = new int [16];
		
		for (int i = 0;i<arr.length/2;i++){
			
			arr[arr.length/2+i] = i;//вправо		
			arr[arr.length/2-i] = i;//влево
		
			//значение нулевой ячейки равно значению предшественницы плюс 1
			arr[0] = i+1;
			//значение последней ячейки массива равно значению предпоследней ячейки плюс 1
			arr[arr.length-1] = arr[arr.length-2]+1;
		}
		
		writeArrayOnConsole(arr);
	}

	public static void writeArrayOnConsole(int[] innerMassive){
		//System.out.println("Выводим массив: ");
		for (int i = 0; i<innerMassive.length;i++){
			System.out.print(innerMassive[i]+" ");
		}
		System.out.println();
	}
}