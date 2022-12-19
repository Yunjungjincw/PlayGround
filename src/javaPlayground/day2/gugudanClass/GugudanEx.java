package javaPlayground.day2.gugudanClass;

public class GugudanEx {
	//정적 메서드란? 정적 메서드는 클래스와 연결되어 있지만,
	//=> 같은 패키지 안에 있고 , public 으로 나타냈음. 그래서 객체가 필요없고 클래스명으로 한건가?
	//해당 클래스의 특정 인스턴스와는 연결되어 있지 않습니다. 
	//이러한 메서드에는 클래스의 객체가 입력 인수로 필요하지 않습니다. 따라서, 클래스의 객체를 생성하지 않고 정적 메서드를 호출할 수 있습니다.
	public static void main(String[] args) {
//		Gugudan gugudan = new Gugudan();
//		GugudanPrint gugudanPrint = new GugudanPrint();
		
		for(int i=2; i<10; i++) {
			int[] result = Gugudan.calculator(i);
			GugudanPrint.print(result);
		}
	}
}
