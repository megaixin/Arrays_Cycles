//Проверить, отсортирован ли массив в обратном порядке.
class ReverseArr{
	public static void main(String []args){
		
		//два разных массива для проверки
		int []myReverseSortArr = {2,1,3,4,5,6};
		//int [] myReverseSortArr = {6,5,4,3,2,1};

		boolean isSort = true;

		for (int i = 0; i<myReverseSortArr.length-1;i++){
			//если каждое последующее число массива меньше предыдущего  -
			if (myReverseSortArr[i+1]<=myReverseSortArr[i]){
				//массив считаем отсортированным
				isSort = true;
			}
			//если в массиве хоть раз окажется последующее число больше предыдущего -
			if (myReverseSortArr[i+1]>myReverseSortArr[i]){
				//массив считаем неотсортированным.
				isSort = false;
				//выход из цикла
				break;
			}
			
		}		
		System.out.print(isSort);
	}	

	public static void verifyReverseSortOfArray(int [] inArray){
		
		boolean isSort = true;
		
		for (int i = 0; i<inArray.length-1;i++){
			if (inArray[i+1]<=inArray[i]){
				inSort = true;
			}
		}
		if (inArray[i+1]>inArray[i]){
		isSort = false;
		
		
		
		}
		
		
	}
	
	

	
	

	
	
	
	
	
} 