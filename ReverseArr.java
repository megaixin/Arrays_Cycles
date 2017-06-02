//Проверить, отсортирован ли массив в обратном порядке.
class ReverseArr{
	public static void main(String []args){
		
		//два разных массива для проверки
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
			if (myReverseSortArr[i+1]>=myReverseSortArr[i]){
				isSort = false;
			}
			
			if(isSort==true){
			System.out.println("Массив  отсортирован");
			break;
			}
			
			if (isSort == false){
				break;
			}
			System.out.println("Массив не отсортирован");
		}
	}
} 