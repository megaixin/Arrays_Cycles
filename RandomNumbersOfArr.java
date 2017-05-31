//Заполнить массив из 10 элементов случайными числами.
class RandomNumbersOfArr{
	public static void main (String []args){
		
		int [] myArray = new int [10];
		
		for (int i =0; i<myArray.length;i++){
			myArray[i] =((int)(Math.random() *10));
			System.out.print(myArray[i]+ " ");
		}
		System.out.println();
	}
}