package javaPlayground.day2.gugudanClass;

public class Gugudan {
	public static int[] calculator(int num) {
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = num *(i+1);
		}
		return result;
		
	}
}
