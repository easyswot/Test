package static_var;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * static을 활용하여 자동 증가값 생성
		 * 
		 * 
		 * */
		Student s1 = new Student("아무개");
		Student s2 = new Student("저쩌구");
		Student s3 = new Student("어쩌구");
		
		System.out.println(s1.number);
		System.out.println(s2.number);
		System.out.println(s3.number);
		
		Student s4 = new Student("가나다");
		System.out.println(s4.number);
	}

}

class Student {
	static int idx = 0;
	int number;
	String name;
	
	public Student(String name) {
		idx++;
		this.number =idx;
		this.name = name;
	}
	
}








