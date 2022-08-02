package loop;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 1-10까지 정수의 합 sum
		 * 출력 : 1~10까지 합 : sum
		 * 
		 * 구구단 출력 (예는 2단)
		 * 
		 * 
		 * */
		
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			
			sum += i;
			i++;
			
		}
		System.out.println("1~10까지의 합 : " + sum);
		
		
		
		System.out.println("\n========================================\n");
		
		
		
//		System.out.println("< 2단 >");
//		i = 1;
//		int a = 1;
//		while(i<10) {
//			
//		a = i*2;
//		System.out.println(" 2 * " + i + " = " + a);
//		
//		i++;
//			
//		}
		
		
		int dan = 2;
		System.out.println(" < " + dan + "단 > ");
		
		i = 1;
		while(i<10) {
			
			System.out.println(dan + " * " + i + " = " + (dan*i));
			
			i++;
			
		}
		
		
		
		System.out.println("\n========================================\n");
		
		
		
		
//		i = 0;
//		int x = 1;
//		while(i<9) {
//			
//			i++;
//			x = 2*i;
//			System.out.println("2 * "+ i +" = "+ x);
//			
//		}
		
		
		
		// 1~100까지 짝수의 합
		// 출력 - "1~100까지 짝수의 합 : "
		
		
		i = 1;
		sum = 0;
		while(i<=100) {
			
			if(i%2==0)  sum += i;
			
			i++;
			
		}
		
		System.out.println("1~100까지 짝수의 합 : " + sum);
		
		
//		i = 1;
//		sum = 0;
//		while(i<=100) {
//			
//			if(i%2==0) {
//				
//				sum += i;
//				
//			}
//			
//			i++;
//			
//		}
//		
		
		i = 2;
		sum = 0;
		while(i<=100) {
			sum	 += i;
			i	 += 2;
		}
		System.out.println("1~100까지 짝수의 합 : " + sum);
		
		
		
		
		
		System.out.println("\n========================================\n");
		
		
		
		
		
		
		
		
		
		
		
		// 1~100까지 홀/짝의 합 출력
		// int odd, int even
		// 출력 - "1~100까지 짝수의 합 : "
		// 출력 - "1~100까지 홀수의 합 : "
		
		
		i = 1;
		int odd	 = 0;
		int even = 0;
		
		while(i <= 100) {
			
			if(i%2==1)		odd += i;
			else			even += i;
			
			i++;
			
		}
		System.out.println("1~100까지 홀수의 합 : " + odd);
		System.out.println("1~100까지 짝수의 합 : " + even);
		
		
//		i = 1;
//		int odd = 0;
//		int even = 0;
//		
//		while(i <= 100) {
//			
//			if(i%2==1) {
//				
//				odd += i;
//				
//			} else {
//				
//				even += i;
//				
//			}
//			
//			i++;
//			
//		}
//		System.out.println("1~100까지 홀수의 합 : " + odd);
//		System.out.println("1~100까지 짝수의 합 : " + even);
		
		
		
		
		
		
		
		
		
		

	}

}
