package array;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * 1차원 배열names에 5명 학생 ㅇ이름 저장 
		 * 2차원 배열score에 5명 학생의 국어 영어 수학 점수 저장 후 출력
		 * 
		 * +) 학생별 총점 1차원 배열(total)에 저장 후 출력
		 * 
		 * ex
		 * 		 국어  영어  수학
		 * 홍길동  80   80   80
		 * 이순신  90   80   77
		 * 강감찬  60   50   60
		 * 김태희  100  100  100
		 * 전지현  50   80   100
		 * -----------------------
		 * 
		 * < 학생별 총점 >
		 * 홍길동 : 160점
		 * 
		 * 
		 * */
		
		String[] names = {"홍길동", "이순신", "강감찬", "김태희", "전지현"};
		
		int[][] score = {
				{80, 80, 80},
				{90, 80, 77},
				{60, 50, 60},
				{100, 100, 100},
				{50, 80, 100}
		};
		
		System.out.println("\t국어\t영어\t수학\t");
		
//		String a = "";
//		
//		for(int i = 0 ; i < names.length ; i++) {
//			a += names[i];
//			
//			for(int j = 0 ; j < score[i].length ; j++) {
//				a += "\t" + score[i][j];
//				
//			}
//			a += "\n";
//			
//		}
//		System.out.println(a);
		
		
		
		
		
		for(int i = 0; i < names.length ; i++) {
			System.out.print(names[i]);
			
			for(int j = 0 ; j < score[i].length ; j++) {
				System.out.print("\t" + score[i][j]);
				
			}
			System.out.println();
		}
		
		
		
		System.out.println("------------------------------------------------\n");
		
		
		System.out.println("< 학생별 총점 >");
		
//		String s = "";
//		int total;
//		
//		for(int i = 0 ; i < names.length ; i++) {
//			total = 0;
//			s += names[i] + " : ";
//			
//			for(int j = 0 ; j < score[i].length ; j++) {
//				total += score[i][j];
//			}
//			
//			s+= total + "점" + "\n";
//		}
//		System.out.println(s);
		
		int[] total = new int[names.length];
		
		for(int i = 0 ; i < score.length ; i++) {
			for(int j = 0 ; j < score[i].length ; j++) {
				total[i] += score[i][j];
			}
		}
		
		for(int i = 0 ; i < total.length ; i++) {
			System.out.println(names[i] + " : " + total[i] + "점");
		}
		
		
			
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
