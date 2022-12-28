package javaPlayground.day2.gugudanClass;

public class Gugudan {
	public static int[] calculator(int num) {
		int[] array = new int[9];
		for(int i=0; i<array.length; i++) {
			array[i] =+ i+1;
			System.out.println();
		}	
		return array;
	}
	
}
