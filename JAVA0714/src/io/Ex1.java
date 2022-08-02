package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 자바의 기본 데이터 입출력
		 * - DataInputStream, DataOutputStream 사용
		 * - 자바의 기본데이터타입 8가지 + 문자열(String) 타입 처리 가능
		 * 	 => readXXX(), writeXXX() 메서드 사용하며 XXX은 기본데이터타입의 이름 사용
		 * 		ex) int형 데이터 출력 : writeInt()
		 * 			double형 데이터 입력 시 : readDouble()
		 * 	 => 주의! String 타입은 XXX 부분에 String 대신 UTF 사용
		 * 		ex) readString() 메서드 (X) -> readUTF() 메서드 (O)
		 * 
		 * 
		 * */
		
		// 자바 기본 데이터를 파일로 출력하기
		// 1. FileOutputStream 객체를 생성하여 출력할 파일 위치 및 파일명 지정
//		FileOutputStream fos = new FileOutputStream("C:\\femp\\data.txt");
		
		//1. FileOutputStream 객체를 생성하여 출력할 파일 위치 및 파일명 지정
//		DataOutputStream dos = new DataOutputStream(fos);
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\temp\\data.txt"))) {
			
			dos.writeInt(100);
			dos.writeDouble(3.14);
			dos.writeUTF("홍길동");
			
		} catch (FileNotFoundException e) {
			// FileOutputStream 에서 지정한 경로가 존재하지 않을 경우 예외 발생
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("===========================================================");
		
		// 파일에 출력된 자바 기본데이터를 읽어와서 화면에 출력하기
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("C:\\temp\\data.txt"))) {
			
			int num = dis.readInt();
			double dNum = dis.readDouble();
			String str = dis.readUTF();
			
			System.out.println("int형 정수: " + num);
			System.out.println("double형 실수: " + dNum);
			System.out.println("문자열: " + str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
