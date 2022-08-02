import java.util.ArrayList;
import java.util.Scanner;

// 금고문제
// 시계 방향으로 0과 1의 데이터를 갖는 다이얼 3개가 있다.
// 이 3개의 다이얼은 시계방향 또는 반시계 방향으로 회전이 가능하다.
// 어느 방향이든 1이 한 방향으로 모두 만날때 금고는 열린다.
// 이때, 최소 회전수를 출력하는 프로그램을 작성하시오.

public class Ex1 {
	
	static Scanner sc = new Scanner(System.in);
	
	static int[] dial1 = new int[24];
	static int[] dial2 = new int[24];
	static int[] dial3 = new int[24];
	
	public static void main(String[] args) {
		input();
//		print();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(min(dial1, dial2, dial3));	// 다이얼1번 기준으로 최소 회전수
		arr.add(min(dial2, dial3, dial1));	// 다이얼2번 기준으로 최소 회전수
		arr.add(min(dial3, dial1, dial2));	// 다이얼3번 기준으로 최소 회전수
		
		
		
		
		
		System.out.println(getMinValue(arr));
		
	}
	
	public static int min(int[] dial1, int[] dial2, int[] dial3) {
		// dial1 기준으로 최소회전수 들이 저장될 배열
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < dial1.length; i++) {
			
			// 첫번째 다이얼의 1을 발견!
			if(dial1[i] == 1) {
				
				// dial2 반복
				int min1 = Integer.MAX_VALUE;
				for(int j = 0; j < dial2.length; j++) {
					// 2번째 다이얼 1을 발견
					if(dial2[j] == 1) {
						int num = Math.abs(i - j);
						min1 = min1 > num ? num : min1;
					}
					
				}
				
				// dial3 반복
				int min2 = Integer.MAX_VALUE;
				for(int j = 0; j < dial3.length; j++) {
					// 2번째 다이얼 1을 발견
					if(dial3[j] == 1) {
						int num = Math.abs(i - j);
						min2 = min2 > num ? num : min2;
					}
					
				}
				
				arr.add(min1 + min2);
				
			}
			
		} // for문 끝
		
		return getMinValue(arr);
		
	}
	
	public static int getMinValue(ArrayList<Integer> arr) {
		int result = Integer.MAX_VALUE;
		for(int n : arr) {
			result = result > n ? n : result; 
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void input() {
		// dial1 입력받음
		for(int i = 0; i < dial1.length/2; i++) {
			int num = sc.nextInt();
			dial1[i] = num;
			dial1[i + 12] = num;
		}
		sc.nextLine();
		
		// dial2 입력받음
		for(int i = 0; i < dial2.length/2; i++) {
			int num = sc.nextInt();
			dial2[i] = num;
			dial2[i + 12] = num;
		}
		sc.nextLine();
		
		// dial3 입력받음
		for(int i = 0; i < dial3.length/2; i++) {
			int num = sc.nextInt();
			dial3[i] = num;
			dial3[i + 12] = num;
		}
		sc.nextLine();
	}
	
	public static void print() {
		for(int n : dial1) {
			System.out.print(n + " ");
		}
		System.out.println();
		for(int n : dial2) {
			System.out.print(n + " ");
		}
		System.out.println();
		for(int n : dial3) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
}

