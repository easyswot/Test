
public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 
		 * n개의 숫자가 입력되면
		 * n개의 숫자를 왼쪽으로 하나씩 돌려서 출력
		 * 
		 * ex)
		 * 5
		 * 1 2 3 4 5
		 * 2 3 4 5 1
		 * 3 4 5 1 2
		 * 4 5 1 2 3
		 * 5 1 2 3 4
		 */
		
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i = 0 ; i < arr.length ; i++) {
			printArray(arr);
			rotation(arr);
		}
		
		
		
		
//		int a = 10;
//		method(a);
//		System.out.println(a);
		
		int[] a = {10, 20};
		method(a);
		
		System.out.println("----------a----------");
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
		
		
		
	}
	
	public static void method(int[] b) {
		b[0] += 10;
		b[1] += 10;
		System.out.println("----------b----------");
		for(int i = 0 ; i < b.length ; i++) {
			System.out.println(b[i]);
		}
	}
	
//	public static void method(int b) {
//		b += 10;
//		System.out.println(b);
//		
//	}
	
	
	// 배열을 출력하는 메서드
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
		
	//rotation
	public static void rotation(int[] arr) {
		int temp = arr[0];
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			arr[i] = arr[i+1];			
		}
		arr[arr.length - 1] = temp;
	}
	
	
	
	
	
	
	
	

}
