package operator;

public class Test7 {

	public static void main(String[] args) {
		// 반올림
		// ex) 95.3 => 95
		//	   95.8 => 96
		// (*10)%10
		// 강제형변환
		
		double d = 95.8;
		
		int result = (d-(double)((int)d)) >= 0.5 ? (int)d+1 : (int)d;
		
//		int result = ((d*10)%10) <= 4 ? (int)d : (int)d +1;
		
		System.out.println(result); //95
		

	}

}
