//ѕроверить, отсортирован ли массив в обратном пор€дке.
class ReverseArr{
	public static void main(String []args){
		
		//два разных массива дл€ проверки
		//int []mySortArr = {2,1,3,4,5,6};
		int []myReverseSortArr = {6,5,4,3,2,1};
		boolean isSort = false;
		//пилим цикл
		for(int i = 0;i<myReverseSortArr.length-1;i++){
			//условие:
			//если каждое последующее число меньше предыдущего  -
			if (myReverseSortArr[i+1]<=myReverseSortArr[i]){
			//массив отсортирован
				isSort = true;
			/*
			myReverseSortArr[5]<=myReverseSortArr[6] = correct
			myReverseSortArr[4]<=myReverseSortArr[5] = correct
			myReverseSortArr[3]<=myReverseSortArr[4] = correct
			myReverseSortArr[2]<=myReverseSortArr[3] = correct
			myReverseSortArr[1]<=myReverseSortArr[2] = correct
			 //массив отсортирован в обратном пор€дке
			 true
			 если переменна€ isSort == true
			 вывод строки: 
			 System.out.println("ћассив отсортирован");
			
			конец.
			
			//пилим цикл
			for(int i = 0;i<mySortArr.length-1;i++){
			//условие:
			//если каждое последующее число меньше предыдущего  -
			if (mySortArr[i+1]<=mySortArr[i]){
				
			mySortArr[1]<=myReverseSortArr[2] = correct
			mySortArr[3]<=myReverseSortArr[1] = non correct
			false
			if (isSort == false){
				break;
	
			}
			System.out.println("ћассив  Ќ≈ отсортирован");
			
			*/
			
			
			}
			// если массив отсортирован - выводим на экран
			if (isSort == true){
				System.out.println("ћассив отсортирован");
			}else{
				isSort = false;
			}
			//если не отсортирован - выводим на экран
			if(isSort == false){
				System.out.println("ћассив отсортирован");
			} 
			
		}
	}
} 