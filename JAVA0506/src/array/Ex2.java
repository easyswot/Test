package array;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * */
		
		int[] a;
		int b[];
		
//		만약, 동일한 데이터타입 변수를 한꺼번에 선언하는 경우
		int[] c, d;		// 변수 c와 d모두 배열 변수로 선언 => 이 경우를 더 많이 씀
		int e, f[];		// 변수 e는 기본타입 변수, 변수 f만 배열 변수로 선언
		
		
		/*
		 * 배열 크기는 고정이므로 크기를 확장하려면
		 * 새로운 배열 생성하고, 기존 데이터를 새 배열에 복사
		 * 
		 * */
		
		int[] arr = {10, 20, 30};	//3개의 데이터가 저장된 배열
//		만약, 40을 추가할 경우 추가(확장) 불가능
//		따라서, 4개의 정수가 저장되는 배열을 새로 생성한 후 기본 배열 데이터를 복사
		
		int[] arr2 = new int[4];
		for(int i = 0 ; i < arr.length ; i++) {
			arr2[i] = arr[i];
		}
		arr2[3] = 40;
		
		for(int i = 0 ; i < arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("===========================================");
		
		int aNum = 10;
		int bNum = 20;
		bNum = aNum;	// aNum의 데이터를 bNum에 저장(기존에 있던 20은 제거)
		
		
		int[] aArr = {1, 2, 3};
		int[] bArr = {4, 5, 6};
		int[] cArr = {7, 8, 9};
		
		aArr = bArr;	// bArr이 가리키는 공간의 주소값을 aArr변수에 저장
		
		bArr = cArr;	// cArr이 가리키는 공간의 주소값을 bArr변수에 저장
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
