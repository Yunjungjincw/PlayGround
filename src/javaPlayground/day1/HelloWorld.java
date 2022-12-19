package javaPlayground.day1;

public class HelloWorld {
	public static void main(String[] args) {
		String str1 = "홍";
		String str2 = "홍";
		System.out.println(str1==str2);
		
		String str3 = new String("길동");
		String str4 = new String("길동");
		System.out.println(str3==str4);
		
		System.out.println(str3.equals(str4));
	}
}
