
public class Test2 {

	public static void main(String[] args) {
		/*
		 * 문자열이 공백없이 입력
		 * 문자열의 시작 위치와 글자 개수가 입력
		 * 1. (시작 위치 ~ 글자 개수)까지 출력하는 mySubstr 메서드를 작성
		 * 
		 * 2. return 하는 메서드
		 * ex) abcdef
		 * 
		 * 출력 예시 ced
		 * 
		 * 
		 * 
		 * */
		
		// 1. 
//		mySubstr("abcdef", 2, 3);
		
		// 2.
		System.out.println(mySubstr("abcdef", 2, 3));
		
	}
	
	// 1. 
//	public static void mySubstr(String str, int start, int count) {
//		for(int i = start ; i < start+count ; i++) {
//			System.out.print(str.charAt(i) + " ");
//		}
//	}
	
	
	// 2. 
	public static String mySubstr(String str, int start, int count) {
		String result = "";
		for(int i = start ; i < start+count ; i++) {
			result += str.charAt(i);
		}
		return result;
	}
	

}
