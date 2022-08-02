package loop;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 중첩 for문
		 * - for문 재에 또 다른 for문을 기술하여 반복 문장을 여러번 반복하는 문
		 * - 기존 반복문을 바깥쪽 for문 이라고 가정했을 때
		 * 	 해당 반복문 내에서 다시 반복을 수해하는 for문을 안쪽 for문 이라고 함
		 * 	  => 안쪽 for문 반복횟수 = 안쪽 for문 반복횟수 * 바깥쪽 for문 반복횟수
		 * 
		 *  < 기본 문법 >
		 *  
		 *  for(초기식1; 조건식1; 증감식1) {
		 *  
		 *  	for(초기식2; 조건식2; 증감식2) {
		 *  
		 *  
		 *  		{
		 *  
		 *  
		 *  }
		 * 
		 * 중첩 for문을 활용한 시계 구현
		 * => 0분~59분까지 1씩 증가할 동안 0초~59초까지 1씩 증가
		 * 
		 * 
		 * 
		 * */
		
//		for(int min = 0 ; min <= 59 ; min++) { // 0 ~ 59분
//			
//			
//			for(int sec = 0 ; sec <= 59 ; sec++) { // 0~59초
//		
//				System.out.println(min + "분" + sec + "초");
//		
//			}
//			
//		}
		
		for(int h = 0 ; h <= 23 ; h++) {
			
			for(int min = 0 ; min <= 59 ; min++) {
				
				for(int sec = 0 ; sec <= 59 ; sec++) {
					
					System.out.println(h + "시" + min + "분" + sec + "초");
					
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
