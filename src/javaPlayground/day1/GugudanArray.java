package javaPlayground.day1;

public class GugudanArray {

	public static void main(String[] args) {
		int[] result = new int[9];
		
			for(int j=2; j<=9; j++) {
				for(int i=0; i<result.length; i++) {
				result[i] =+ j;
				System.out.println(result[i]+"*"+(i+1)+"="+result[i]*(i+1));
				}
			}
		}
	}
