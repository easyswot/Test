import java.util.Date;
import java.util.Calendar;
import java.io.*;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * import문을 자동 생성 Ctrl + Shift + O
		 * => 동일한 이름의 클래스가여러 패키지에 존재할 경우 선택창 표시
		 * 
		 * */
		
		// String 클래스 사용방법
		String s1 = "홍길동";		// 클래스명만으로 사용했었음
		
		// 정상적인 String 클래스 사용 방법 -> java.lang 패키지명을 포함하여 기술
		java.lang.String s2 = "abc";
		// => String 클래스가 포함된 java.lang 패키지는 기본적으로 포함된 패키지이므로
		//	  패키지명을 생략한 채 클래스 명만으로 객체 사용 가능
		
		// java.util 패키지의 Random 클래스 인스턴스 생성
//		Random r = new Random();	// 패키지명을 포함하지 않을 경우 클래스를 찾지 못하므로
		// 존재하지 않는 지정으로 인한 오류 발생
		
		// 패키지명을 포함하여 클래스 지정해야 함
		java.util.Random r = new java.util.Random();
		
		// java.util 패키지의 Date 클래스에 접근하려면
		// 기본적으로 java.util.Date 형식으로 
		// import문을 통해 java.util 패키지의 Date 클래스를 지정하면
		// 패키지명 없이 Date 클래스 이름만으로 사용 가능해짐
		Date d = new Date();	// java.util 패키지의 Date import 했으므로 이름만으로 접근 가능
		// 단, Date 클래스만 포함시켰으므로 java.util 패키지의 다른 클래스는 포함되지 않음
		// => 따라서, 다른 클래스도 import 문을 통해 포함시켜야 함
		Calendar cal;	// java.util 패키지의 Calendar 클래스
		
		InputStream is;
		BufferedReader buffer;
		
		
	}

}
