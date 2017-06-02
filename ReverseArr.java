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
			}
			if(isSort==true){
				System.out.println("ћассив отсортирован");
			}

			if (isSort == false){
				System.out.println("ћассив  Ќ≈ отсортирован");
			}
			break;
		}
	}
} 