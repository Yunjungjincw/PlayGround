package javaPlayground.day1;

public class GugudanMethod {
	
	public static int[] calculator(int times) {
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = times *(i+1);
		}
		return result;
	}
	// print 라는 메소드를 정의하고, 매개값으로 int타입의 배열 result를 넣어줘
	// 근데 이 result 라는게 위 메소드에서 매개변수를 받으면 그 변수의 숫자에 맞게 계산돼
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			int[] result = calculator(i);
			print(result);
			//		for(int j=0; j<result.length; j++) {
//			System.out.println(result[j]);
//		}
		}
	}		
}


