package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 키보드로부터 데이터를 입력받아 처리하는 방법
		 * 5. BufferedReader 객체를 사용하여 String 단위로 입력 데이터를 처리하는 방법
		 * 		- InputStream 객체를 파라미터로 갖는 InputStreamReader 객체 생성 후
		 * 		  다시 InputStreamReader 객체를 파라미터로 같는 BufferdReader 객체 생성
		 * 
		 * 
		 * 
		 * 
		 * */
		
		// 1. 기본 입력스트림 객체(InputStream) 생성 = byte 단위 처리
//		InputStream is = System.in;
		
		// 2. 입력스트림을 연결하는 보조스트림 InputStreamReader 객체 생성 = char 단위 처리
//		InputStreamReader reader = new InputStreamReader(is);
		
		// 3. 향상된 입력 보조스트림 BufferedReader 객체 생성 = String 단위 처리
//		BufferedReader buffer = new BufferedReader(reader);
		
		// ----- 위 세 문장을 하나의 문장으로 결합 -----
//		BufferedReader buffer =	new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("데이터를 입력하세요.");
		
//		try(BufferedReader buffer =	new BufferedReader(new InputStreamReader(System.in));){
//			
//			// 입력스트림에서 한 줄의 데이터(문자열) 읽어오기
//			String str = buffer.readLine();
//			System.out.println("입력데이터: " + str);
//			
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
		
		// ====================================================================
		
		// 반복문을 사용하여 Ctrl + Z 입력 시 까지의 모든 문자열을 출력
		// => 주의 Ctrl + 입력데이터가 정수일때는 -1, 문자열일때는 null값 사용
		
		System.out.println("데이터를 입력하세요. (Ctrl + Z)");
		try(BufferedReader buffer =	new BufferedReader(new InputStreamReader(System.in));){
			
//			int n = buffer.read();
			
//			while(n > 0) {
//				// 입력스트림에서 한 줄의 데이터(문자열) 읽어오기
//				String str = buffer.readLine();
//				System.out.println("입력데이터: " + str);
//				
//			}
			
			String str = buffer.readLine();
			
			while(str != null) {
				System.out.println("입력데이터: " + str);
				str = buffer.readLine();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
