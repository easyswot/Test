package ex01_04;

public class Ex4_Q5 {

	public static void main(String[] args) {
		/*
		 * 
		 * Q5)
		 * 반복문과 조건문을 사용하여 다음 모양 출력
		 * 		*
		 * 	   ***
		 * 	  *****
		 * 	 *******
		 *    *****
		 *     ***
		 *      *
		 * 
		 * 
		 * */
		
		int line = 7;
		int star = 1;
		int space = line/2;
		
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
			
			if(i < line/2) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}
