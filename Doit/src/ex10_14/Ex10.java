package ex10_14;

import java.io.IOException;

public class Ex10 {

	public static void main(String[] args) throws IOException {
		// Q1) implements
		// 클래스가 인터페이스를 구현하기 위해 사용하는 예약어는 ---입니다.
		
		// Q2) 추상클래스
		// 클래스가 인터페이스를 구현할 때 인터페이스에 선언한 메서드를 모두
		// 구현하지 않으면 그 클래스는 ---가 됩니다.
		
		// Q3) 상수
		// 인터페이스에 선언한 변수는 컴파일할 때 ---로 변합니다.
		//
		
		// Q4) 다형성
		// 한 인터페이스를 여러 클래스가 다양한 방식으로 구현한 경우에
		// 프로그램에서 인터페이스에 선언된 메서드를 사용할 때
		// 각 클래스의 구현 내용과 상관없이 동일한 방식으로 사용할 수 있습니다.
		// 이렇게 같은 코드가 여러 구현 내용으로 실행되는 객체 지향 특성
		
		// Q5) default, static
		// 인터페이스에서 구현 코드를 제공하는 메서드
		
		// Q6) O
		// 한 클래스에서 여러 인터페이스를 구현할 수 있습니까
		
		// Q7)
		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		} else if (ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		} else if (ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
		
		/* <출력 결과>
		 * 정렬방식 선택
		 * B
		 * H
		 * Q
		 * Q<-를 입력한 경우
		 * QuickSort ascending
		 * QuickSort descending
		 * 숫자를 정렬하는 알고리즘입니다.
		 * QuickSort 입니다.
		 * */
		
	}

}

// Q7)
// 다음 시나리오처럼 인터페이스를 설계하고 인터페이스를 구현한 알고리즘 클래스를 만들어 봅시다.

interface Sort {
	default void ascending(int[] arr) {		// 정수형 배열을 인수로 받아서 오름차순으로 정렬하는 메서드
		System.out.println(this.getClass().getSimpleName() + " ascending");
	}
	default void descending(int[] arr) {	// 정수형 배열을 인수로 받아서 내림차순으로 정렬하는 메서드
		System.out.println(this.getClass().getSimpleName() + " descending");
	}
	default void description() {	// 알고리즘에 대한 설명 (단, 디폴트메서드)
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
		System.out.println(this.getClass().getSimpleName() + " 입니다.");
	}
}

class BubbleSort implements Sort {}

class HeapSort implements Sort {}

class QuickSort implements Sort {}



//interface Sort {
//	void ascending(int[] arr);		// 정수형 배열을 인수로 받아서 오름차순으로 정렬하는 메서드
//	void descending(int[] arr);		// 정수형 배열을 인수로 받아서 내림차순으로 정렬하는 메서드
//	default void description() {	// 알고리즘에 대한 설명 (단, 디폴트메서드)
//		System.out.println("숫자를 정렬하는 알고리즘입니다.");
//		System.out.println(this.getClass().getSimpleName() + " 입니다.");
//	}
//}
//
//class BubbleSort implements Sort {
//
//	@Override
//	public void ascending(int[] arr) {
//		System.out.println("BubbleSort ascending");
//	}
//
//	@Override
//	public void descending(int[] arr) {
//		System.out.println("BubbleSort descending");
//	}
//	
//}
//
//class HeapSort implements Sort {
//
//	@Override
//	public void ascending(int[] arr) {
//		System.out.println("HeapSort ascending");
//	}
//
//	@Override
//	public void descending(int[] arr) {
//		System.out.println("HeapSort descending");
//	}
//	
//}
//
//class QuickSort implements Sort {
//
//	@Override
//	public void ascending(int[] arr) {
//		System.out.println("QuickSort ascending");
//	}
//
//	@Override
//	public void descending(int[] arr) {
//		System.out.println("QuickSort descending");
//	}
//	
//}
















