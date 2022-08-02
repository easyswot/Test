
public class Test1 {

	public static void main(String[] args) {
		/*
		 * 거스름돈 계산
		 * 
		 * n이 32850일 경우,
		 * 
		 * <출력 예시>
		 * 50000원 : 0개
		 * 10000원 : 3개
		 * 5000원 : 0개
		 * 1000원 : 2개
		 * 500원 : 1개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 0개
		 * 
		 * 
		 * if switch while for method
		 * 
		 * */
		
		// 풀이
		
		int N = 32850;
		
//		System.out.println("50000원 : " + N / 50000 + "개");
//		N %= 50000;
//		
//		System.out.println("10000원 : " + N / 10000 + "개");
//		N %= 10000;
//		
//		System.out.println("5000원 : " + N / 5000 + "개");
//		N %= 5000;
//		
//		System.out.println("1000원 : " + N / 1000 + "개");
//		N %= 1000;
//		
//		System.out.println("500원 : " + N / 500 + "개");
//		N %= 500;
//		
//		System.out.println("100원 : " + N / 100 + "개");
//		N %= 100;
//		
//		System.out.println("50원 : " + N / 50 + "개");
//		N %= 50;
//		
//		System.out.println("10원 : " + N / 10 + "개");
		
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
//		int[] cnts = new int[money.length];		// 거스름돈 배열
		
//		for(int i = 0 ; i < money.length ; i++) {
//			cnts[i] = N / money[i];
//			N %= money[i];
//		}
		
//		int[] cnts = change(money, N);
//		print(money, cnts);
		
		print(money, change(money, N));
		
//		for(int i = 0 ; i < money.length ; i++) {
//			System.out.println(money[i] + "원 : " + cnts[i] + "개");
//		}
		
		
		System.out.println("\n=======================================\n");
		
		
		
		
		
		
		
		
		// 1.
		int mon = 32850;
		
		int[] a = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i] + "원 : " + mon/a[i] + "개");
			
			mon %= a[i];
		}
		
		
		System.out.println("\n=======================================\n");
		
		
		
		
		// 2.
		m(524140);
		
		
		
		
		
		

	}
	
	// 풀이
	// 금액과 화폐 배열을 전달받아서
	// 거스름돈 배열을 리턴하는 메서드
	public static int[] change(int[] money, int N) {
		int[] cnts = new int[money.length];
		
		for(int i = 0 ; i < money.length ; i++) {
			cnts[i] = N / money[i];
			N %= money[i];
		}
		
		return cnts;
		
	}
	
	public static void print(int[] money, int[] cnts) {
		for(int i = 0 ; i < money.length ; i++) {
			System.out.println(money[i] + "원 : " + cnts[i] + "개");
		}
	}
	
	
	
	
	
	
	// 2.
	public static void m(int a) {
		int[] b = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for(int i = 0 ; i < b.length ; i++) {
			System.out.println(b[i] + "원 : " + a/b[i] + "개");
			
			a %= b[i];
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
