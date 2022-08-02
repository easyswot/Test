
public class Ex6 {

	public static void main(String[] args) {
		/*
		 * String 타입
		 * - 문자열을 표현하기 위한 데이터 타입
		 * - 기본형이 아닌 참조형 (Reference Type)
		 * - 1개 이상의 문자열을 큰 따옴표("")로 묶어서 표현
		 * - 아무것도 포함하지 않는 문자열("")을 널스트링(null String)
		 * - 덧셈 연산자 + 를 사용해 문자열간 결합이 가능
		 * 
		 * 
		 * */
		
		String s1 = "String 타입은 char 타입과 다르다";
		System.out.println(s1);
		
		String s2 = "";	//null Stirng
		System.out.println(s2);
		
		String s3 = "Hey \n My name is \n 'blah'.";
		System.out.println(s3);
		
		// 덧셈 연산자를 사용해 문자열 결합이 가능
		//=>	어떤 데이터와 문자열을 결합하면 결합된 결과가 새로운 문자열로 생성됨
		//			ex) X + "addd" = "Xaddd"
		//				"addd" + X = "adddX"
		System.out.println("1"+"2");
		System.out.println("1강의실"+"2강의실");
		System.out.println(1+"문자열");		// 정확히는 정수 1 -> 문자열로 변환된 후 결합된 것
		System.out.println(1+2+"문자열");
		int a = 1+2;
		System.out.println("문자열"+a);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
