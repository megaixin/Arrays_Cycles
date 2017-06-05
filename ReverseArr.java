//Проверить, отсортирован ли массив в обратном порядке.
class ReverseArr{
	public static void main(String []args){
		
		//два разных массива для проверки
		//int []myReverseSortArr = {2,1,3,4,5,6};
		int [] myReverseSortArr = {6,5,4,3,2,1};
		verifyReverseSortOfArray(myReverseSortArr);
	
	}	

	public static void verifyReverseSortOfArray(int [] inArray){
		boolean isSort = true;
		
		for (int i = 0; i<inArray.length-1;i++){
			if (inArray[i+1]<=inArray[i]){
				isSort = true;
			}
		
			if (inArray[i+1]>inArray[i]){
				isSort = false;
				break;
			}
		}
		System.out.print(isSort);
	}	
}