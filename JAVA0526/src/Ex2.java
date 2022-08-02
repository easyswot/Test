import java.util.Scanner;

public class Ex2 {

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
		
		Scanner sc = new Scanner(System.in);
		Road north = new Road();
		Road south = new Road();
		
		for(int i = 0 ; i < north.arr.length ; i++) {
			north.arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < south.arr.length ; i++) {
			south.arr[i] = sc.nextInt();
		}
		
		Bridge bridge1 = new Bridge();
		Bridge bridge2 = new Bridge();
		Bridge bridge3 = new Bridge();
		bridge1.index = sc.nextInt();
		bridge2.index = sc.nextInt();
		bridge3.index = sc.nextInt();
		
		Bridge[] bridges = {bridge1, bridge2, bridge3};
		
//		System.out.println("북쪽 결과 : " + north.sum(0, bridge1.index));
//		System.out.println("남쪽 결과 : " + south.sum(bridge1.index, south.arr.length-1));
		
//		bridge1.total = north.sum(0, bridge1.index) + south.sum(bridge1.index, south.arr.length-1);
//		bridge2.total = north.sum(0, bridge2.index) + south.sum(bridge2.index, south.arr.length-1);
//		bridge3.total = north.sum(0, bridge3.index) + south.sum(bridge3.index, south.arr.length-1);
		
		for(Bridge b : bridges) {
			b.total = north.sum(0, b.index) + south.sum(b.index, south.arr.length-1);
		}
		
//		System.out.println(bridge1.total);
//		System.out.println(bridge2.total);
//		System.out.println(bridge3.total);
		
		
		Bridge minB = Bridge.getMinBridge(bridges);
		System.out.println("다리 번호 : " + minB.index);
		System.out.println("최소 시간 : " + minB.total);
	}

}

class Bridge {
	int index;
	int total;
	
	// total 값이 가장 작은 다리를 리턴해주는 메서드
	public static Bridge getMinBridge(Bridge[] bridges) {
		
		Bridge minBridge = bridges[0];
		
		for(int i = 1 ; i < bridges.length ; i++) {
			if(minBridge.total > bridges[i].total) {
				minBridge = bridges[i];
			}
		}
		
		return minBridge;
		
		
	}
}

class Road {
	// north, south, bridge, index, total
	int[] arr = new int[10];
	
	public int sum(int start, int end) {
		int sum = 0;
		for(int i = start ; i <= end ; i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
