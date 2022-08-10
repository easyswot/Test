
public class Ex6 {

	public static void main(String[] args) {
		/*
		 * String 클래스를 활용하여 주어진 문자열을 변수로 선언하고
		 * String 클래스의 메서드를 활용하여 다음 작업을 수행하시오
		 * 
		 * 1. 데이터 비교 equals()
		 * 2. 데이터 추출 후 비교 (남성, 여성, 외국인)
		 * 3. 필요한 데이터만 추출 (주소, 전화번호)
		 * 
		 * */
		
		// 1. equals()
		String s1 = "가나다";
		String s2 = "가나다";
		
		if(s1==s2) {	// 주소값 같음
			System.out.println("s1과 s2는 주소값이 같다");
		} else {
			System.out.println("s1과 s2는 주소값이 다르다");
		}
		
		if(s1.equals(s2)) {	// 문자열 같음
			System.out.println("s1과 s2는 문자열이 같다");
		} else {
			System.out.println("s1과 s2는 문자열이 같다");
		}
		
		String s3 = new String("가나아");
		String s4 = new String("가나아");
		
		if(s3==s4) {	// 주소값 다름
			System.out.println("s3와 s4는 주소값이 같다");
		} else {
			System.out.println("s3와 s4는 주소값이 다르다");
		}
		
		if(s3.equals(s4)) {	// 문자열 같음
			System.out.println("s3와 s4는 문자열이 같다");
		} else {
			System.out.println("s3와 s4는 문자열이 같다");
		}
		
		
		System.out.println();
		
		
		// 2. 데이터 추출 후 비교 (남성, 여성, 외국인)
		String jumin = "010101-4123570";
		
//		char ch = jumin.charAt(7);
		
		char ch = jumin.split("-")[1].charAt(0);
		String result = "";
		
		switch (ch) {
		case '1':
		case '3':	result = "남성";		break;
		case '2':
		case '4':	result = "여성";		break;
		case '5':
		case '6':	result = "외국인";	break;
		}
		
		System.out.println("성별 : " + result);
		
		System.out.println();
		
		// 3. 필요한 데이터만 추출 (주소, 전화번호)
		
		// 주소부분만 출력	 부산광역시 부산진구 동천로:109
		String data1 = "Address:부산광역시 부산 진구 동천로:109";
		System.out.println(data1.substring(data1.indexOf(":")+1));
		
		// 이름 부분만 출력 홍길동
		String data2 = "이름: 홍길동, 나이: 20";
		System.out.println(data2.split(",")[0].split(":")[1].trim());
		
		// 주소 부분만 출력 (서울특별시 용산구 24번길, 210동 702호)
		String data3 = "Address:서울특별시 용산구 24번길, 210동 702호, Tel:0518030909";
		System.out.println(data3.substring(data3.indexOf(":")+1, data3.lastIndexOf(",")));
		
		// 필요한 데이터만 추출 (부산광역시 부산 진구 동천로109|7층|0518030909)
		String data4 = "Address:부산광역시 부산 진구 동천로109, Floor:7층, Tel:051-803-0909";
		String[] strArr = data4.split(",");
		for(String str : strArr) {
			System.out.println(str.split(":")[1]);
		}
	}

}
