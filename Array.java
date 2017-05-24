//найти наибольшее число в массиве, вернуть -999, если массив нулевой длины"
class Array{
	public static void main(String[]args){
		//int []myArr = {5,8,1,1};
		int [] mySecondArr = new int[0];
		
		System.out.println(returnMaxValue(mySecondArr));
	}

	public static int returnMaxValue(int[] inArr){
		return -1;
	}
}