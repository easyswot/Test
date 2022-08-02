package _if;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 정수형 변수 num에 대한 양수, 음수 판별(0은 양수로 간주)
		 * 양수라면 "X : 양수"
		 * 음수라면 "X : 음수"
		 * 
		 * 
		 * */
		
//		int num = -8;
//		
//		if(num >= 0) {
//			
//			System.out.println(num + " : 양수");
//			
//		} else {
//			
//			System.out.println(num + " : 음수");
//			
//		}
		
		
		
		
//		int num = -8;
//		String result;
//		if(num >= 0) {
//			
//			result = num + " : 양수";
//			
//		} else {
//			
//			result = num + " : 음수";
//			
//		}
//		
//		System.out.println(result);
		
		
		
//		int num = 10;
//		String result = (num >= 0) ? num + " : 양수" : " : 음수";
//		System.out.println(result);
		

		int num = 10;
		String result = num + " : ";
		result += (num >= 0) ? "양수" : "음수";
		System.out.println(result);

		
		
		/*
		 * 문자 ch가 대문자면 소문자로 변환
		 * 문자 ch가 소문자면 대문자로 변환
		 * 
		 * "ch = X" 라고 출력
		 * 
		 * */
		
		char ch = 'l';
		boolean a = ch >= 'A' && ch <='Z';
//		if(a)				ch += 32;
//		else				ch -= 32;
		
		//삼항연산자
		
//		ch = (ch >= 'A' && ch <='Z') ? (char)(ch+32) : (char)(ch-32);
		ch += a ? 32 : -32;
		
		System.out.println("ch = " + ch);
		
				
		
		
		
		

	}

}
