package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * temp 폴더에 저장된 source.txt 파일을 읽어들여
		 * 각 라인에 라인변호를 추가하여 콘솔 화면에 출력
		 * - FileReader, BufferedReader 사용
		 * 	 (키보드로 입력받는 InputStreamReader 대신
		 * 	  File로 부터 입력받는 FileReader 사용)
		 * */
		
		
		try(BufferedReader buffer = new BufferedReader(new FileReader(new File("C:\\temp\\source.txt")))) {
			
			String str = buffer.readLine();
			int count = 1;
			
			while(str != null) {
				
				System.out.println(count + " " + str);
				str = buffer.readLine();
				count++;
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
