package break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * up & down 게임
		 * 1~999 사이의 난수 하나를 target에 저장
		 * 20번 반복하면서 정수를 입력받는다
		 * - target보다 작은 수를 입력받았을 경우 "up" 출력
		 * - target보다 큰 수를 입력받았을 경우 "down" 출력
		 * - 일치하는 숫자를 입력받았을 경우 target과 몇회만에 맞췄는지 출력 후 반복 종료
		 * 	 정답 : xxx, 횟수 : xxx
		 * - 20번 안에 정답을 맞추지 못한 경우 "실패" 출력
		 * 
		 * 추가) 난이도를 선택할 수 있도록 프로그램 변경
		 * 상, 중, 하(2, 1, 0) 중 하나를 입력받음
		 * 상(2) : 반복 횟수 8번
		 * 중(1) : 반복 횟수 12번
		 * 하(0) : 반복 횟수 20번
		 * => 단, 이외 숫자가 입력될 경우 "입력오류 : 상(2), 중(1), 하(0) 중에 하나 입력"
		 * 
		 * */
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int target = r.nextInt(999) + 1;
		
		System.out.println("< Up & Down Game >");
		System.out.println("난이도를 선택하세요. 상(2), 중(1), 하(0) : ");
		
		int count;
		while(true) {
			int mode = sc.nextInt();
			
			if(mode == 2) {
				count = 8;
				break;
			} else if(mode == 1) {
				count = 12;
				break;
			} else if(mode == 0) {
				count = 20;
				break;
			} else {
				System.out.println("입력오류 : 상(2), 중(1), 하(0) 중에 하나 입력");
			}
			
		}
		
		String mode = "";
		if(count==8) 			mode = "상";
		else if(count==12)		mode = "중";
		else if(count==20) 		mode = "하";
		
		
		
//		if(l == 0) {
//			n = 20;
//		} else if(l == 1) {
//			n = 12;
//		} else if(l == 2) {
//			n = 8;
//		} else {
//			System.out.println("입력오류 : 상(2), 중(1), 하(0) 중에 하나 입력");
//		}
		
//		for(int i=1 ; i <= 20 ; i++) {
//			
//			int a = sc.nextInt();
//			
//			if(a < target) {
//				System.out.println("UP");
//				
//				if(i==20) {
//					System.out.println("실패");
//				}
//				
//			} else if(a > target) {
//				System.out.println("Down");
//				
//				if(i==20) {
//					System.out.println("실패");
//				}
//				
//			} else {
//				System.out.println("정답 : " + target + ", 횟수 : " + i);
//				
//				break;
//			}
		
		
		boolean isSuccess = false;
		System.out.println("1~999 사이 정수를 입력 : ");
		for(int i=1 ; i <= count ; i++) {
			
			int a = sc.nextInt();
			
			if(a < target) {
				System.out.println("UP");
				
			} else if(a > target) {
				System.out.println("Down");
				
			} else {
				System.out.println("정답 : " + target + ", 횟수 : " + i);
				isSuccess = true;
				break;
			}	
			
			
		}
		
		if(!isSuccess) {
			System.out.println("실패");
		}
		
		
		
		

	}

}
