package _if;



public class Test1 {

	public static void main(String[] args) {
		/*
		 * if문
		 * 정수형 변수 num에 대한 절대값 계산하여 출력
		 * 	=> ex) num이 5일 때 -> "변수 num = 5"
		 * 	   ex) num이 -10일 때 -> "변수 num = 10"
		 * 
		 * */
		
//		int num = -5;
//		if(num >= 0) {
//			System.out.println("변수 num = "+ num);
//		}
//		else {
//			System.out.println("변수 num = "+ -(num));
//			}
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		if(num < 0) {
//			//num = -num
//			num *= -1;
//		}
//		num = num < 0 ? -num : num;
//		System.out.println("변수 num = " + num );
		
		/*
		 * 
		 * 문자 ch가 대문자일 때, 소문자로 변환하여 출력
		 * 소문자일때는 그대로 소문자를 출력
		 * char는 정수형 대문자 + 32 -> 소문자
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		
		char ch = 'F';
		if((int)ch < 97) {
			ch = (char)((int)ch+32);
		}
		System.out.println(ch);		
		
		char result = (int)ch < 97 ? (char)((int)ch+32) : ch;
		System.out.println(result);
		//ch>='A'&&ch<='Z'???
		
		
		
		
		
//		char ch1 = 'b';
//		if((int)ch1 > 65) {
//			ch1 = (char)((int)ch1-32);
//		}
//		System.out.println(ch1);
//		
//		char result1 = (int)ch1 > 65 ? (char)((int)ch1 - 32) : ch1 ;
//		System.out.println(result1);
	}

}
