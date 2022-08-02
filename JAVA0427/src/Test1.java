import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 삼항연산자의 중첩사용
		 * 문자 ch에 대해 "대문자"와 "소문자" 판별, 그 나머지는 "기타문자"
		 * 
		 * 
		 * 
		 * */
		
		char ch = '!';	//65~90 : 대문자  97~122 : 소문자
		
		
		
//		String result = (int)ch >= 65 && (int)ch <=90   ? "대문자" :
//						(int)ch >= 97 && (int)ch <= 122 ? "소문자" : "기타문자";
		
		boolean upperCase = (int)ch >= 65 && (int)ch <=90;
		boolean lowerCase = (int)ch >= 97 && (int)ch <= 122;
		
		String result = upperCase   ? "대문자" :
						lowerCase   ? "소문자" : "기타문자";
		
		
		System.out.println(result);
		
		
		
		/*
		 * 뷔페 요금 계산
		 * 1. 뷔페의 기본요금(price)은 30000원이다.
		 * 2. 손님의 나이(age)에 따라 요금이 변경된다.
		 * 3. 뷔페 할인 조건 : 나이(age)가 5세 이하일 경우 70% 할인된 요금으로 계산
		 * 					나이(age)가 65세 이상일 경우 50% 할인
		 * 4. 최종적으로 뷔페요금(result) 출력
		 * 
		 * 
		 * 
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		int price = 30000;
		int age = sc.nextInt();
		
		int result_price = age <= 5  ? (int)(price*0.3)  :
						   age >= 65 ? (int)(price*0.5)  : price ;
					    
		System.out.println(result_price);
		
		
		/*
		 * 키보드로부터 입력 받기 (Scanner)
		 * 
		 * */
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
