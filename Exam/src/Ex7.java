import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		/*
		 * 다음 조건에 따라 if문을 사용하여 나이(age)에 따른 입장료(fee)를 출력하시오
		 * 
		 * 1. 입장료(fee)는 정수이며, 초기 입장료는 100000원을 변수에 저장
		 * 2. 나이(age)는 정수이며 1~100 사이의 임의의 값을 변수에 저장
		 * 3. 할인 조건에 따른 입장료(fee)를 계산하여 나이와 입장료를 출력
		 * 		1) 5세 이하는 50% 할인
		 * 		2) 70세 이상은 70% 할인
		 * 		3) 나머지의 경우 할인 X
		 * 
		 * */
		// 1. if
		int fee = 100000;
		int age = 30;
		
		if(age <= 5) 			fee *= 0.5;
		else if( age >= 70)		fee *= 0.3;
		
		System.out.printf("나이 : %d세, 입장료 : %d원\n", age, fee);
		
		// 2.
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		int result = age <= 5	?	(int)(fee*0.5)	:
					 age >= 70	?	(int)(fee*0.3)	:	fee;
		System.out.println("나이 : " + age + "세, 입장료 : " + result +"원");
		
	}

}
