//найти наибольшее число в массиве, вернуть -999, если массив нулевой длины"
class Array{
	public static void main(String[]args){
		//int []myArr = {5,8,1,1};
		int [] mySecondArr = new int[0];
		
		System.out.println(returnMaxValue(mySecondArr));
	}

	public static int returnMaxValue(int[] inArr){
		//если массив нулевой
		if (inArr.length == 0){
			//возвращаем -999
			return -999;
			
		}else{
			//вычисляем наибольшее значение
		int maxValueOfArr = inArr[0];
			for(int i = 0;i<inArr.length;i++){
			
				if(maxValueOfArr<inArr[i]){
					maxValueOfArr = inArr[i];
				}	
			}	
			return maxValueOfArr;
		}	
	}
}