package method;















public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 비정형 인자 (= 가변 인자, Variable Arguments)
		 * - 메서드 파라미터 개수가 정해져 있지 않을 때
		 * 	 다양한 개수의 파라미터를 모두 전달받을 수 있는 인자
		 * - 메서드 정의 시 매개변수 데이터타입과 변수명 사이에 ... 기호를 붙여서 표기
		 * - 전달되는 모든 데이터는 해당 변수명으로 된 배열로 관리되며
		 * 	 0개 이상의 파라미터를 전달할 수 있음
		 * 
		 * 
		 * */
		// 대표적인 예 printf("%d %d %d %d", 1, 2, 3, 4)
		
		// 전달할 파라미터의 개수가 정해져있지 않을 경우
		// 1. 배열을 사용한 배개변수를 선언 시 해당 배열 내의 데이터 개수는 무제한이므로
		//	  파라미터의 개수가 정해져있지 않더라도 배열 타입으로 모두 처리 가능
		
		ArrayArguments aa = new ArrayArguments();
		int[] arr = {1, 2, 3, 4, 5};
		aa.print(arr);
		
		VariableArguments va = new VariableArguments();
		va.print(1, 2, 3);
		va.print(4, 5, 6, 7, 8);
		va.print(arr);	// 배열을 전달해도 됨
		va.print();		// 심지어 파아미터 없이도 메서드 호출이 가능
		
	}

}


class VariableArguments {
	
	// 메서드 정의 시 가변인자 타입으로 매개변수를 선언하면
	// 개수 제한없이 0개부터 무한대의 파라미터를 한꺼번에 전달 받을 수 있음
	public void print(int... nums) {
		
		// 전달받은 모든 파라미터는 nums 라는 이름의 배열로 관리됨
		// 따라서, 배열 접근 방법을 그대로 사용 가능
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}
	}
	
	// 가변인자 사용 시 주의사항
	// 복수개의 매개변수 선언 시 가변 인자가 마지막에 사용되면 오류가 발생하지 않음
	public void print(String str, int...nums) {}
	
//	public void print(int... nums, String str) {}
	// 가변 인자는 이 메서드의 마지막 파라미터로 사용되어야 한다
	
//	public void print(int...nums, String...str) {}
	// 가변 인자는 단 한번만 사용 가능(=마지막 파라미터로 사용되어야 한다는 사유에 포함)
	
	
	
}









class ArrayArguments {
	
	// 메서드 정의 시 배열 타입으로 매개변수를 선언하면
	// 개수를 알 수 없는 여러 개의 파라미터를 한꺼번에 전달 받을 수 있다
	public void print(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}












