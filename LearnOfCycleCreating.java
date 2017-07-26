//циклы
class LearnOfCycleCreating{
	public static void main (String[]args){
	
		wrapUpIntoCycle(9); 
		multiplicationTableOnTwo(7);
	}
	/*1. 
	Свернуть в цикл код
	System.out.println ( 1 );
	System.out.println ( 3 );
	System.out.println ( 5 );
	System.out.println ( 7 );
	System.out.println ( 9 );*/
	public static void wrapUpIntoCycle(int inNumber){
		for (int i = 1;i<=inNumber;i+=2){
			System.out.println ( i );
		}
	}

	/*2. Вывести циклом на консоль строки
	два в степени 1 - это 2
	два в степени 2 - это 4
	два в степени 3 - это 8
	два в степени 4 - это 16
	два в степени 5 - это 32*/
	public static void multiplicationTableOnTwo( int inNumbOfTimes){
		for(int i = 1;i<=inNumbOfTimes;i++){
			int inExponentiatedNum = 2;
			System.out.println("два в степени " + i + " - это " + Math.pow(inExponentiatedNum, i));	
		}
	}
}