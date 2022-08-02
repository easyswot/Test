package ex01_04;

public class Ex4_Q2 {

	public static void main(String[] args) {
		/*123p
		 * 구구단을 짝수 단만 출력하도록 프로그램을 만들
		 * 단, continue문 사용
		 * 
		 * */
		
//		for(int dan = 1 ; dan <= 9 ; dan++) {
//			
//			if(dan%2==0) {
//				
//				System.out.println("< " + dan + "단 >");
//				
//					for(int i = 1 ; i <= 9 ; i++) {
//						System.out.println(dan + " * " + i + " = " + dan*i);
//					}
//					
//				System.out.println();
//			
//			}
//			
//		}

		
		
		for(int dan = 1 ; dan <= 9 ; dan++) {
			
			if(dan%2==1) {
				continue;
			}
			System.out.println("< " + dan + "단 >");
			
			for(int i = 1 ; i <= 9 ; i++) {
						
				System.out.println(dan + " * " + i + " = " + dan*i);
						
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
