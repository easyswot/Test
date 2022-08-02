package method;

/*
 * 계산기(Calculator) 클래스 정의
 * 덧셈, 뺄셈, 곱셈, 나눗셈 기능을 모두 calc() 메서드로 처리
 * => 첫번째 파라미터는 연산자(기호, char타입 opr)를 전달하고
 * 	  두번째 파라미터 부터는 피연산자(숫자, int타입 numx)를 2~4까지 전달하여
 * 	  연산자에 따라 각각의 연산을 누적하여 결과를 출력
 * 
 * */

class Calculator {
	
	public void calc(char opr, int num1, int num2) {
		if(opr == '+') {
			System.out.println(num1+num2);
		} else if(opr == '-') {
			System.out.println(num1-num2);
		} else if(opr == '*') {
			System.out.println(num1*num2);
		} else if(opr == '/') {
			System.out.println(num1/num2);
		}
	}
	
	public void calc(char opr, int num1, int num2, int num3) {
		if(opr == '+') {
			System.out.println(num1+num2+num3);
		} else if(opr == '-') {
			System.out.println(num1-num2-num3);
		} else if(opr == '*') {
			System.out.println(num1*num2*num3);
		} else if(opr == '/') {
			System.out.println(num1/num2/num3);
		}
	}
	
	public void calc(char opr, int num1, int num2, int num3, int num4) {
		if(opr == '+') {
			System.out.println(num1+num2+num3+num4);
		} else if(opr == '-') {
			System.out.println(num1-num2-num3-num4);
		} else if(opr == '*') {
			System.out.println(num1*num2*num3*num4);
		} else if(opr == '/') {
			System.out.println(num1/num2/num3/num4);
		}
	}
	
	
}













public class Ex3 {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.calc('+', 10, 20);
		cal.calc('+', 10, 20, 30);
		cal.calc('+', 10, 20, 30, 40);
		
		System.out.println("------------------------------");
		
		cal.calc('-', 100, 20);
		cal.calc('-', 100, 20, 30);
		cal.calc('-', 100, 20, 30, 40);
		
		System.out.println("------------------------------");
		
		cal.calc('*', 10, 2);
		cal.calc('*', 10, 2, 3);
		cal.calc('*', 10, 2, 3, 4);
		
		System.out.println("------------------------------");
		
		cal.calc('/', 100, 2);
		cal.calc('/', 100, 2, 2);
		cal.calc('/', 100, 2, 5, 10);
		
	}

}





















