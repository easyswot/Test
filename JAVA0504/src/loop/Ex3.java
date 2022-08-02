package loop;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 별찍기
		 * 
		 * 		*		i=1 일 때 j= 1 ~ 1 
		 * 		**		i=2 일 때 j= 1 ~ 2 
		 * 		***		i=3 일 때 j= 1 ~ 3 
		 * 		****	i=4 일 때 j= 1 ~ 4 
		 * 		*****	i=5 일 때 j= 1 ~ 5 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		for(int i = 1 ; i <= 5 ; i++) {	// 줄바꿈
			
			for(int j = 1 ; j <= i ; j++) {	// 별찍기
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}

		
		
//		for(int i = 1 ; i <= 5 ; i++ ) {
//			for(int j = 1; j <= 6-i ; j++) {
//				System.out.print("*");
//			}
//		System.out.println();
//		}
	
		
		
//		for(int i = 5 ; i >=1 ; i--) {
//			
//			for(int j = 1 ; j <= i ; j++) {
//				
//				System.out.print("*");
//				
//			}
//			
//			System.out.println();
//			
//		}

		
		
		

	}

}
