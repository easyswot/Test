
public class Ex4 {

	public static void main(String[] args) {
		/*
		 * if문을 사용하여 입력받은 문자(ch)에 대한 판별 결과를 출력
		 * 1. 문자 1개를 ch에 저장한다
		 * 2. 다음 조건에 따라 문자를 판별 후 결과를 출력하시오
		 * 		1) 대문자 ('A' ~ 'Z') "대문자" 출력
		 * 		2) 소문자 ('a' ~ 'z') "소문자"
		 * 		3) 문자형 숫자 ('0'~'9') "숫자"
		 * 		4) 위 모든 조건이 만족하지 않을 경우 "기타문자" 출력
		 * */
		
		char ch = ' ';
		
//		boolean upperCase= (int)'A' <= ch && (int)'Z' >= ch;
//		boolean lowerCase = (int)'a' <= ch && (int)'z' >= ch;
//		boolean digit = (int)'0' <= ch && (int)'9' >= ch;
		
		boolean upperCase= 'A' <= ch && 'Z' >= ch;
		boolean lowerCase = 'a' <= ch && 'z' >= ch;
		boolean digit = '0' <= ch && '9' >= ch;
		
		
		// 1. 삼항연산자 중첩 사용
		String result = upperCase ? "대문자"	:
						lowerCase ? "소문자"	:
						digit	  ? "숫자"	: "기타문자";
		
		System.out.println("1. " + result);
		
		
		// 2. if
		if(upperCase)		result = "대문자";
		else if(lowerCase)	result = "소문자";
		else if(digit)		result = "숫자";
		else				result = "기타문자";
		
		System.out.println("2. " + result);
		
		
		// 3. Wrapper 클래스 메서드
		if(Character.isUpperCase(ch))		result = "대문자";
		else if(Character.isLowerCase(ch))	result = "소문자";
		else if(Character.isDigit(ch))		result = "숫자";
		else if(Character.isSpaceChar(ch))	result = "공백문자";
		else								result = "기타문자";
		
		System.out.println("3. " + result);
		
		
	}

}
