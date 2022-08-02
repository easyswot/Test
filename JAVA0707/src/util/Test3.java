package util;

import java.util.StringTokenizer;

public class Test3 {

	public static void main(String[] args) {
		String data = "Address:부산광역시 부산진구 동천로109,Floor:7층,Tel:051-803-0909";
		// 1. 각 항목별 분리(StringTokenizer 클래스 사용)
		// 2. 각 항목에서 실제 데이터를 분리하여 출력
		
//		StringTokenizer st = new StringTokenizer(data, ":,AdeFlorsT");
//		while(st.hasMoreTokens()) {
//			
//			System.out.println(st.nextToken());
//		}
		
		StringTokenizer st = new StringTokenizer(data, ",");
		while(st.hasMoreTokens()) {
//			StringTokenizer st2 = new StringTokenizer(st.nextToken(), ":");
//			st2.nextToken();	// Address, Floor, Tel 항목들은 그대로 내보내기
//			System.out.println(st2.nextToken());
//			st2.nextToken();
//			String address = st2.nextToken();
//			String floor = st2.nextToken();
//			System.out.println(address + " : " + floor);
			
			// 2. String 클래스의 split() 메서드 사용시
//			String[] strArr = st.nextToken().split(":");
//			System.out.println(strArr[1]);
			
			System.out.println(st.nextToken().split(":")[1]);
			
		}
		
		System.out.println("--------------------------------------------------");
		String result = "";
		for(String str : data.split(",")) {
			result += str.split(":")[1] + " ";
		}
		System.out.println(result);
		
		System.out.println("--------------------------------------------------");
		
		StringTokenizer st3 = new StringTokenizer(data, ",:");
		while(st3.hasMoreTokens()) {
			st3.nextToken();
			System.out.println(st3.nextToken());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
