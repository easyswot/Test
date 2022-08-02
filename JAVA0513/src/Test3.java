
public class Test3 {

	public static void main(String[] args) {
		/*
		 * 도로 교통상황이 숫자로 주어짐
		 * 
		 * 출발 70 80 60 20 30 50 10 80 77 89
		 * 			 ||    ||    ||
		 * 	   70 60 40 50 55 65 23 44 37 88 도착
		 * 
		 * 북쪽 도로에서 남쪽 도로로 갈 수 있는 다리의 index번호가 주어짐
		 * 이때, 가장 최소 시간이 소요되는 다리는 몇 번 다리인지 출력하고 최소시간을 함께 출력
		 * 
		 * 출력 예시) 다리번호 : 6
		 * 			최소시간 : 512
		 * 
		 * 주의사항
		 * 1. 무조건 다리를 1번 건너야 함(도착지점 남쪽)
		 * 2. 다리를 건널때에는 남쪽, 북쪽 소요시간이 같이 소요(즉, 같이 합산해야 함)
		 * 3. 소요시간이 같은 경우가 발생하면 낮은 다리번호를 출력
		 * 
		 * */
		
		int[] north = {70, 80, 60, 20, 30, 50, 10, 80, 77, 89};
		int[] south = {70, 60, 40, 50, 55, 65, 23, 44, 37, 88};
		int[] bridge = {2, 4, 6};
		int[] result = new int[bridge.length];
		
		for(int i = 0 ; i < bridge.length ; i++) {
			result[i] = sum(north, south, bridge[i]);
		}
		
		int minIndex = 0;
		int min = result[0];
		
		for(int i = 0 ; i < result.length ; i++) {
			if(min > result[i]) {
				min = result[i];
				minIndex = i;
			}
		}
		
		System.out.println("다리번호 : " + bridge[minIndex]);
		System.out.println("최소시간 : " + min);
			

		
		
//		int sum = 0;
//		int index = 6;
//		
//		
//
//		for(int i = 0 ; i <= bridge[index/2-1] ; i++) {
//			sum += north[i];
//		}
//		
//		for(int i = bridge[index/2-1] ; i < south.length ; i++) {
//			sum += south[i];
//		}
//		
//		System.out.println("다리번호 : " + index + "\n시간 : " + sum);
		
		
		
		
		

	}
	
	public static int sum(int[] north, int[] south, int index) {
		int sum = 0;
		for(int i = 0 ; i <= index ; i++) {
			sum += north[i];
		}
		
		for(int i = index ; i < south.length ; i++) {
			sum += south[i];
		}
		return sum;
	}		

}
