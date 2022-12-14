package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 객체 직렬화(Serialization) & 역직렬화(Deserialiization)
		 * - 자바에서 사용하는 객체에 영속성을 부여하여
		 * 	 파일 또는 네트워크 등으로 내보내는 것을 직렬화라고 하며.
		 * 	 반대로 파일이나 네트워크로부터 데이터를 읽어 객체로 변환하는 것을 역직렬화라고 함
		 * - ObjectInputStream, ObjectOutputStream 클래스 사용
		 * - 주의 직렬화 대상이 되는 클래스를 정의할 때는
		 * 	 반드시 Serializable 인터페이스 상속 필수
		 * 
		 * */
		
		// Person 객체 생성
		Person p = new Person("홍길동", 20, "901010-1234567");
		
		// File 경로 관리를 위해 File 객체 생성
		File f = new File("C:\\temp\\person.txt");
		
		// Person 객체를 외부 파일로 출력하기 (=직렬화, Serialization)
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
			
			oos.writeObject(p);	// 업캐스팅 돼서 oos 전달
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("객체 출력 완료");
		
		System.out.println("============================================================");
		
		// 외부 폴더 (C드라이브 - temp - person.txt)에 저장되어 있는 파일 내의
		// Person 객체를 ObjectInputStream 객체를 사용하여 읽어오기
		// => 역직렬화(Deserialization)
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
			
			Object o = ois.readObject();
			if(o instanceof Person) {
				Person person = (Person)o;
				// toString() 메서드가 오버라이딩 되어 있으므로 변수명 바로 전달
				System.out.println(person);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}


// 직렬화를 위한 Person 클래스 정의
// => 주의 직렬화 대상이 되는 클래스를 정의할 때 반드시 Serializable 인터페이스 상속 필수
// 별도의 추상메서드가 없는 단순한 마커(Marker)
class Person implements Serializable {

	String name;
	int age;
	String jumin;
	
	public Person(String name, int age, String jumin) {
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}
	
	
}
