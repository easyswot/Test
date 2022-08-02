package text;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		// Date 객체를 생성하여 오늘 날짜 및 현재 시간을 다음과 같이 변환하여 출력
		// ex) 2022년 07월 11일(월) 오전 09시 35분 40초
		
		Date now1 = new Date();
		String pattern1 = "yyyy년 MM월 dd일(E) a hh시 mm분 ss초";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern1);
		String formattingNow = sdf.format(now1);
		System.out.println(formattingNow);
		
		
		
		System.out.println();
		
		
		
		String pattern2 = "yyyy년 MM월 dd일(E) a hh시 mm분 ss초";
		System.out.println(new SimpleDateFormat(pattern2).format(new Date()));
		
//		LocalDateTime now2 = LocalDateTime.now();
//		String pattern2 = "yyyy년 MM월 dd일(E) a hh시 mm분 ss초";
//		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern2);
//		System.out.println(now2.format(dtf));
		
	}

}
