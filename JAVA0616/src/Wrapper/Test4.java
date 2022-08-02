package Wrapper;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * 문자열 "Aa5 $"을 각각 문자를 반복하면서
		 * 대문자, 소문자, 숫자,공백문자, 기타문자로 판별
		 * 
		 * */
		String str = "Aa5 $";
		
		
		// 좋지 않은 예 => str.charAt(i)을 많이 호출함
		//				=> char ch = str.charAt(i)
//		for(int i = 0 ; i < str.length() ; i++) {		
//			if(Character.isUpperCase(str.charAt(i))) {
//				System.out.println(str.charAt(i) + " : 대문자");
//			} else if(Character.isLowerCase(str.charAt(i))) {
//				System.out.println(str.charAt(i) + " : 소문자");
//			} else if(Character.isDigit(str.charAt(i))) {
//				System.out.println(str.charAt(i) + " : 숫자");
//			} else if(Character.isSpaceChar(str.charAt(i))) {
//				System.out.println(str.charAt(i) + " : 공백문자");
//			} else {
//				System.out.println(str.charAt(i) + " : 기타문자");
//			}
//		}
		
		for(int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.println(ch + " : 대문자");
			} else if(Character.isLowerCase(ch)) {
				System.out.println(ch + " : 소문자");
			} else if(Character.isDigit(ch)) {
				System.out.println(ch + " : 숫자");
			} else if(Character.isSpaceChar(ch)) {
				System.out.println(ch + " : 공백문자");
			} else {
				System.out.println(ch + " : 기타문자");
			}
		}
		
//		for(int i = 0 ; i < str.length() ; i++) {
//			char ch = str.charAt(i);
//			if(Character.isUpperCase(ch)) 		System.out.println(ch + " : 대문자");
//			else if(Character.isLowerCase(ch))	System.out.println(ch + " : 소문자");
//			else if(Character.isDigit(ch))		System.out.println(ch + " : 숫자");
//			else if(Character.isSpaceChar(ch))	System.out.println(ch + " : 공백문자");
//			else								System.out.println(ch + " : 기타문자");
//		}
		
		
		System.out.println("-----------------------------------------------------------------");
		
		char[] chs = str.toCharArray();
		
		for(char ch : chs) {
			if(Character.isUpperCase(ch)) {
				System.out.println(ch + " : 대문자");
			} else if(Character.isLowerCase(ch)) {
				System.out.println(ch + " : 소문자");
			} else if(Character.isDigit(ch)) {
				System.out.println(ch + " : 숫자");
			} else if(Character.isSpaceChar(ch)) {
				System.out.println(ch + " : 공백문자");
			} else {
				System.out.println(ch + " : 기타문자");
			}
		}
		
		
		
	}

}
