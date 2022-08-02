package array;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 학생 5명의 점수를 score에 저장
		 * 각 학생 점수의 총점과 평군을 계산해 출력
		 * 
		 * <예시>
		 * 1번 학생 : 80점
		 * 2	: 100
		 * 50
		 * 90
		 * 77
		 * -------------------
		 * 총점 : 397
		 * 평균 : 79.4점
		 * ===================*/
		
		int[] score = {80, 100, 50, 90, 77};
		for(int i = 0 ; i<score.length ; i++) {
			System.out.println("1번 학생 : " + score[i] + "점");
		}
		
		System.out.println("------------------------------");
		
		int sum = 0;
		for(int i = 0 ; i<score.length ; i++) {
			sum += score[i];
		}
		
		double avg = (double)sum/score.length;
		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		
		
		System.out.println("\n==============================\n");
		
		
		
		
		/*
		 * <추가항목>
		 * 1. 학생 이름을 저장하는 배열 names 생성해
		 * 	어쩌구, 저쩌구, 가나다, 라마바, 사아자 문자열 5개 저장후
		 *  학생 번호 대신 이름 출력
		 * 2. 학생 점수 중 최고점수와 최저점수 찾아 출력
		 * 
		 * <예시>
		 * 누구 : 80
		 * 100
		 * 50
		 * 90
		 * 77
		 * ---------------
		 * 총점 000점
		 * 평균 000점
		 * 최고점수 : 000점
		 * 최저점수 : 000점
		 * 
		 * */
		
		String[] names = {"이순신", "홍길동", "강감찬", "김태희", "전지현"};
		for(int i = 0 ; i<names.length ; i++) {
			System.out.println(names[i] + " : " + score[i] + "점");
		}
		
		System.out.println("------------------------------");
		
		System.out.println("총점	: " + (int)sum + "점");
		System.out.println("평균	: " + avg + "점");
		
		
//		int max = score[0], min = score[0];
//		
//		for(int i = 1 ; i < score.length ; i++) {
//			
//			if(score[i] > max)	 max = score[i];
//			
//			if(score[i] < min)	 min = score[i];
//		}
		
//		3항 연산자
		
		int max = score[0], min = score[0];
		
//		for(int i = 0 ; i < score.length ; i++) {
//			max = max < score[i] ? score[i] : max;
//			min = min > score[i] ? score[i] : min;
//		}
		
//		향상된 for문
		for(int num : score) {
			max = max < num ? num : max;
			min = min > num ? num : min;
		}
		
		
		
		System.out.println("최고 점수 : " + max + "점");
		System.out.println("최저 점수 : " + min + "점");
		
		
		System.out.println("\n==============================\n");
		
		
//		향상된 for문 for-each(forEach)
		String[] class1 = {"김윤진", "차동원", "소지섭"};
		
//		for(int i = 0 ; i < class1.length ; i++) {
//			String name = class1[i];
//		
//			System.out.println(class1[i]);
//			
//		}
		
		
		for(String name : class1) {
			System.out.println(name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
