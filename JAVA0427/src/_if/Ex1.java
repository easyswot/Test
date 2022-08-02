package _if;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * - 특정 조건에 따라 문장의 실행여부를 결정하는 문
		 * 
		 * if문
		 * - 조건식에 따라 특정 문장 실행여부를 결정하는 기본적인 조건문
		 * - 조건식 판별 결과가 true 이면 블록{} 내의 문장을 실행
		 * - 조건식 판별 결과가 false 이면 블록문 생략
		 * 
		 * <기본 문법>
		 * 문장 1;
		 * if(조건식){
		 * 		문장2;
		 * }
		 * 문장3;
		 * 
		 * 조건식 판별 결과가 true일때 : 문장 1 -> 문장 2 -> 문장 3
		 * 조건식 판별 결과가 flase일때 : 문장 1 -> 문장3
		 * 
		 * 
		 * 
		 * */
		
		int num = 3;
		//정수형 변수 num의 값이 5보다 크면 "num은 5보다 크다!"라고 출력
		if(num>=5) {
			System.out.println("num은 5보다 크다.");
			
		}
		System.out.println("num: "+num);

	}

};