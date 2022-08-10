
public class Ex4_이지원 {

	public static void main(String[] args) {
		
		// 1. 변수명 id에 대해 문자열 "ADMIN"과 비교 후 아이디 일치 여부
		//	  (단, 대소문자 구별 없이 비교)
		String id = "admin";
		
		if(id.equalsIgnoreCase("ADMIN")) {
			System.out.println("아이디가 일치합니다.");
		} else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		
		
		
		// 2. 변수명 jumin에 대해 성별 판별
		String jumin = "901010-1234567";
		
		char ch = jumin.split("-")[1].charAt(0);
		String result = "";
		
		switch (ch) {
		case '1':
		case '3':	result = "남성입니다.";		break;
		case '2':
		case '4':	result = "여성입니다.";		break;
		case '5':
		case '6':	result = "외국인입니다.";		break;
		}
		
		System.out.println(result);
		
		
		
		// 3. 변수명 company에 대해 문자열 추출 - "부산"만 추출
		String company = "아이티윌 부산 교육센터";
		
//		System.out.println(company.split(" ")[1]);
		System.out.println(company.split(" ")[1].trim());	// 사소하지만 trim() 넣어주는 센스
		
	}

}
