
public class Ex1 {

	public static void main(String[] args) {
		// 1. 구조적 프로그래밍 언어에 해당하는 프로그래밍 언어를 한가지만 쓰시오. - C, Pascal
		// 2. 다음 중 키워드(예약어)에 해당하는 것을 모두 고르시오. - return, For, 자바, switch, void
		// 3. 문자열로 된 이름 "홍길동"을 저장하는 변수 name - String name = "홍길동";
		//	  실수 3.14를 저장하는 변수 dNum - double dNum = 3.14;
		//	  문자 'A'를 저장하는 변수 ch - char ch = 'A';
		//	  **정수 300억 저장하는 변수 num - long num = 30000000000L;
		long num = 30000000000000l;
		
		// 5. 정수형 변수 3개를 저장가능한 배열 arr을 선언하고, 임의의 정수 3개로 초기화하는 코드
		// int[] arr	선언
		// new int[3]	생성
		// int[] arr = new int[] {1, 2, 3};
		int[] arr = new int[] {1, 2, 3};
		
	}

}

//class Manager extends Employee {
//String depart;
//
//public Manager(String name, int salary, String depart) {
//super(name, salary);
//this.depart = depart;
//}
//
//public String getManager() {
////return name + " " + salary + " " + depart; -> 중복된다.
//	 return getEmployee() + " " + depart;
//}

//}