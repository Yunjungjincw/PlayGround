package array;

public class Array {
	 public static void main(String[] args) {
		 	//배열을 표시하는 부분
	        int[] result = new int[9];
	        for(int i=2; i<10; i++) {
	        		for(int j=1; j<=result.length; j++) {
	        			System.out.println(i+"+"+j+"="+i*j);
	        		}
	        }
	        
	    }
}
