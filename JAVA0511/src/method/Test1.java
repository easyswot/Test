package method;

public class Test1 {

	public static void main(String[] args) {
		
		
		// 1. 매개변수 x 리턴값x 메서드 호출
		// "Hello World" 문자열 10번 반복 출력하는 hello()메서드 호출
		
		// 2. 매개변수 o 리턴값x 메서드 호출
		// "안녕하세요" 를 매개변수로 전달, 반복횟수도 전달한 만큼 반복하는 메서드 작성
		
		// 3. 매개변수x 리턴값o 메서드 호출
		// 1~10까지 정수의 합(55)을 계산해 리턴하는 메서드 sum() 호출 후 결과 출력
		
		// 4. 위 sum을 수정해 1부터 전달받은 매개변수 까지의 합을 리턴하는 메서드로 수정
		
		// 5. 정수 5개{1, 2, 3, 4, 5}가 저장된 배열을 리턴하는 메서드
		// getArray() 를 호출하여 리턴되는 배열을 전달받아 배열 내의 모든 요소 출력
		
		// 6. 정수 start, end 값을 매개변수로 받아 start 부터 end까지의
		// 배열을 리턴하는 베서드를 호출 후 출력(데이터 start ~ end)
		
		
		 
		// 1.
		hello();
		
		
		// 2.
		hello2("안녕하세요", 1);
		
		
		// 3.
////		int result = sum();
////		System.out.println("합 : " + result);
//		System.out.println("합 : " + sum());		//리턴값이 있으므로 이렇게 써도 됨
		
		
		// 4.
		int result = sum(10);
		System.out.println("합 : " + result);
		
		
		// 5.
		int arr[] = getArray();
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//6.
		int arr2[] = getArray2(1, 3);
		for(int i = 0 ; i < arr2.length ; i++) {
			System.out.print(arr2[i] + " ");
		}
		

	}

	
	// 1. 10번 반복 출력
	public static void hello() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Hello, World!");
		}
	}
	
	
	// 2.
	public static void hello2(String h, int a) {
		for(int i = 0 ; i < a ; i ++) {
			System.out.println(h);
		}
	}
	
	
	// 3. 1~10까지 정수 합 sum()
//	public static int sum() {
//		int sum = 0;
//		for(int i = 1 ; i <= 10 ; i++) {
//			sum += i;
//		}
//		return sum;
//	}
	
	
	// 4.
	public static int sum(int a) {
		int sum = 0;
		for(int i = 1 ; i <= a ; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	// 5. 정수 5개{1, 2, 3, 4, 5}가 저장된 배열을 리턴하는 메서드
	// getArray() 를 호출하여 리턴되는 배열을 전달받아 배열 내의 모든 요소 출력
	
	public static int[] getArray() {
		int[] a = {1, 2, 3, 4, 5};
		
		return a;
	}
	
	
	// 6. 정수 start, end 값을 매개변수로 받아 start 부터 end까지의
	// 배열을 리턴하는 베서드를 호출 후 출력(데이터 start ~ end)
	
//	public static int[] c(int a, int b) {
//		int[] t = new int[b-a];
//		t[0] = a;
//		for(int i = 0 ; i < b-a ; i++) {
//			t[i+1] += 1; 
//		}
//		return t;
//	}
	
	public static int[] getArray2(int start, int end) {
		int size = end-start +1 ;
		int[] arr = new int[size];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = start;
			start++;
		}
		return arr;
	}
	
	
	
	
	
	
}
