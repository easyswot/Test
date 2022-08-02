package loop;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 구구단
		 * 
		 * 
		 * */
		
		
		
		int dan = 2;
		
			System.out.println("< " + dan + "단 >");
		
		
		for(int i = 1 ; i < 10 ; i++) {
			
			System.out.println(dan + " * " + i + " = " + dan*i);
			
		}
		
		
		System.out.println("\n==================================================\n");
		
		
		/*
		 * 1~100 까지
		 * even, odd 누적한 후 출력
		 * 
		 * 
		 * 
		 * */
		int even = 0;
		int odd  = 0;
		
		for(int i = 2 ; i < 101 ; i += 2) {
			even += i;
		}
		System.out.println("1~100 까지 짝수의 합 : " + even);

		
		for(int i = 1; i < 101 ; i += 2) {
			odd += i;
		}
		System.out.println("1~100 까지 홀수의 합 : " + odd);
		
		
		System.out.println("\n==================================================\n");
		
		
		/*
		 * 
		 * 두 정수 a~b까지 3의 배수의 합
		 * 출력 : "a~b까지 3의 배수의 합 : "
		 * 
		 * */
		
		
		int a = 1, b = 10, sum = 0;
		
		for(int i = a ; i < b ; i++) {
			
			if(i%3 == 0) {
				sum += i;
			}
			
		}
		System.out.println("a ~ b까지 3의 배수의 합 : " + sum);
		
		
		System.out.println("\n==================================================\n");
		
		
		/*
		 * 
		 * 7의 개수를 카운트
		 * int n = 247427723
		 * 출력 : "7의 개수 : 3"
		 * 
		 * 
		 * */
		
		
		int n = 247427723, c = 0;
		
		while(n>0) {
			if(n%10==7) 	c++;
			n /= 10;
		}
		System.out.println("7의 개수 : " + c);
		

	}

}
