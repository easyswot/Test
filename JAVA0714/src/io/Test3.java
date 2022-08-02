package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * 키보드로부터 입력받은 내용을 readme.txt 파일에 출력
		 * - 여러 줄을 입력 가능하도록 반복 입력 처리
		 * - 단, ":wq" 문자열이 입력되면 입력을 종료
		 * 
		 * */
		
		
		System.out.println("데이터를 입력하세요. (종료 시 :wq 입력)");
		
		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter out = new PrintWriter(new FileWriter(new File("C:\\temp\\readme.txt")))) {
			
			String str = buffer.readLine();
			
			while(!str.equals(":wq")) {	// :WQ 안됨
				out.println(str);
				str = buffer.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
