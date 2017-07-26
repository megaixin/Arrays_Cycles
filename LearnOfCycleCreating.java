/*
2. Вывести циклом на консоль строки
два в степени 1 - это 2
два в степени 2 - это 4
два в степени 3 - это 8
два в степени 4 - это 16
два в степени 5 - это 32
*/
class LearnOfCycleCreating{
	public static void main (String[]args){
	
		wrapUpIntoCycle(9); 
	
	}

	public static void wrapUpIntoCycle(int inNumber){
		for (int i = 1;i<=inNumber;i+=2){
			System.out.println ( i );
		}
	}

	
	
	
	
	
}