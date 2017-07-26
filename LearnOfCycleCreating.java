//циклы
class LearnOfCycleCreating{
	public static void main (String[]args){
	
		wrapUpIntoCycle(9); 
		multiplicationTableOnTwo(7);
	
		
		
		for(int i = 30; i>0;i--){
			//если число делится на три
			if(i%3==0){
				
			System.out.println("вьяняня!");
			continue;
			}
			
			if(i%5==0){
			System.out.println("урву!");
			continue;
			}
			System.out.println(i+" ");
		}
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

	/*3. Вывести на консоль обратный отсчет от 30 до 0
	Но если число делится на 3, вместо него выводить "цензоред", а если делится на пять - выводить "роскомнадзор".
	Если делится и на три, и на пять, выводить "девветь". 
	вывод будет типа
	девветь
	29 
	28
	цензоред
	26
	роскомнадзор
	цензоред
	23
	22
	цензоред
	...*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}