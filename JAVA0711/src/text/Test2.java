package text;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Test2 {

	public static void main(String[] args) throws ParseException {
		
		int money = 1280000000;
		
		// 정수 1280000000을 1,280,000,000원 형식으로 변경하여 출력
		System.out.println("정수 1280000000 => 1,280,000,000원");
		
		String pattern = "#,###원";
		
		DecimalFormat df = new DecimalFormat(pattern);
		
		String str = df.format(money);
		System.out.println(str);
		
		
		// 문자열 "1,280,000,000" 을 정수 1280000000으로 변경하여 출력
		System.out.println("\n문자열 \"1,280,000,000\" => 정수 1280000000");
		
//		try {
//			Number num = df.parse(str);
//			System.out.println(num);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		String strMoney2 = str;
		long parsedMoney = (long)df.parse(strMoney2);
		System.out.println(parsedMoney);
		
		
		
	}

}
