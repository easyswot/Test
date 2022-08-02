
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 돈이 10000원 있고 사과 한 개에 1000원이라고 할 때
		 * 1. 최대 구매 개수
		 * 2. 사과 3개의 가격
		 * 3. 사과 5개를 사고 남는 금액
		 * 4. 사과 5개를 사고 쌓이는 적립금 (구매 금액의 1%)
		 * 
		 * */
		
		int money = 10000;
		int apple = 1000;
		System.out.println("1. 최대 구매 개수 : " + money/apple);
		System.out.println("2. 사과 3개의 가격 : " + apple*3);
		System.out.print("3. 사과 5개를 사고 남는 금액 : ");
		System.out.println(money-(apple*5));
		System.out.println("4. 사과 5개를 사고 쌓이는 적립금 : " + apple*5*0.01);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
