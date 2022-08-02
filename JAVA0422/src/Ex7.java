
public class Ex7 {

	public static void main(String[] args) {
		/*
		 *  < print(), println(), printf() >
		 *  1. print() 와 println() 은 출력 후 줄바꿈 여부의 차이
		 *  => print() 메서드는 아무 데이터도 없으면 출력 불가능
		 * 
		 *  2. printf()
		 *  	- 출력할 형식을 미리 지정하여 원하는 형태로 데이터 출력
		 *  	  (printf() 메서드의 'f'는 format의 약자)
		 * 		- 출력할 형식을 "" 큰따옴표 안에 형식 지정 문자를 사용하여 형식을 지정한 뒤
		 * 		  큰따옴표 우측에 콤마를 붙이고 실제 데이터 지정
		 * 
		 * */
//		System.out.print();	//err
//		System.out.println();
		
		System.out.printf("%d \n", 12345);
		
		String s1 = "java";
		String s2 = "프로그래밍";
		System.out.printf("%s %s\n", s1, s2);
		System.out.println(s1 + " " +s2);
		
		String name = "가나다";
		int age = 123;
		
		// 안녕하세요 제 이름은 어쩌구입니다.
		// 제 나이는 몇세 입니다.
		
		//printf version
		System.out.printf("안녕하세요. 제 이름은 %s 입니다.\n제 나이는 %d세 입니다.\n", name, age);
		
		//println version
		System.out.println("안녕하세요. 제 이름은 " + name + " 입니다.");
		System.out.println("제 나이는 " + age + "세 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
