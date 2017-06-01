//Проверить, отсортирован ли массив в обратном порядке.
class ReverseArr{
	public static void main(String []args){
		
		//два разных массива для проверки
		int []mySortArr = new int {1,2,3,4,5,6};
		int []myReverseSortArr = new int {6,5,4,3,2,1};
		
		for(int i = 0;i<mySortArr.length;i++){
			if(mySortArr[i] <=mySortArr[i+1]){
				System.out.println("Массив отсортирован");
				}else{
					System.out.println("Массив НЕ отсортирован");
				}
			}	
		}		
	}
} 