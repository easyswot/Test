package lang;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * 주민등록번호
		 * 판별 조건
		 * 1) 뒷자리 첫번째 숫자가 1또는 3 "남성" 출력
		 * 2) 2 4 "여성"
		 * 3) 5 6 "외국인"
		 * 4) 7 8 "괴물"
		 * */
		
		String jumin = "010101-5123459";
		
		
		char a = jumin.charAt(7);
		String result ="";
		switch (a) {
			case '1':
			case '3': result = "남성";		break;
			case '2':
			case '4': result = "여성";		break;
			case '5':
			case '6': result = "외국인";		break;

//			default: result = "누구";	// default는 써야하는 상황이 있을때만 쓰는것이 좋다.
		}
		
		System.out.println("성별 : " + result + "\n");
		
		System.out.println(jumin.split("-")[1].charAt(0) + "\n");	// 이런 방법도 ㅣㅇㅆ다
		
		
		
		
		
		
		
		// 주소부분만 출력
		String data1 = "Address:부산광역시 부산 진구 동천로:109";	// 부산광역시 부산진구 동천로:109
//		System.out.println(data1.split(":")[1]+ data1.split(":")[2]);
		System.out.println(data1.substring(data1.indexOf(":")+1));
		
		// 이름 부분만 출력 홍길동
		String data2 = "이름: 홍길동, 나이: 20";
		System.out.println(data2.replace(" ", "").replace(",", ":").split(":")[1]);
		System.out.println(data2.split(",")[0].split(":")[1].trim());
		
		// 주소 부분만 출력 (서울특별시 용산구 24번길, 210동 702호)
		String data3 = "Address:서울특별시 용산구 24번길, 210동 702호, Tel:0518030909";
		System.out.println(data3.substring(data3.indexOf(":")+1, data3.lastIndexOf(",")));
		
		// 필요한 데이터만 추출 (부산광역시 부산 진구 동천로109|7층|0518030909)
		String data4 = "Address:부산광역시 부산 진구 동천로109, Floor:7층, Tel:051-803-0909";
		String[] strArr = data4.split(",");
		for(String s : strArr) {
			System.out.println(s.split(":")[1].replace("-", ""));
		}
		
		
		
		
		
		
		
		
		
		
	}

}
