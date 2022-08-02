package ex01_04;

public class Ex4_Q4 {

	public static void main(String[] args) {
		/*
		 * 
		 * Q4)
		 * 반복문과 조건문을 사용하여 다음 모양 출력
		 * 		*				공3 별1
		 *     ***				공2 별3
		 *    *****				공1 별5			
		 *   *******			공0 별7
		 * 
		 * */
		
		int line = 5;
		int star = 1;
		int space = line - 1;
		
		for(int i = 0 ; i < line ; i++) {
			
			for(int j = 0 ; j < space ; j++) {		//좌공백
				System.out.print(" ");
			}
			
			for(int j = 0 ; j < star ; j++) {	// 별찍기
				System.out.print("*");
			}
			
			for(int j = 0 ; j < space ; j++) {		//우공백
				System.out.print(" ");
			}
			
			System.out.println();
			
			star += 2;
			space--;
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
