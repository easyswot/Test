package array;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 대소관계 비교 후 출력
		 * arr = [1, 2, 3, 2, 1]
		 * 
		 * 
		 * 1: < < < =
		 * 2: > < = >
		 * 
		 * 
		 * */
		
		int[] arr = {1, 2, 3, 2, 1};		
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			String result = (i+1) + ": ";
			for(int j = 0 ; j < arr.length ; j++) {
				
				if(i == j) continue;
					
				if(arr[i] > arr[j])			result += "> ";
				else if(arr[i] < arr[j])	result += "< ";
				else						result += "= ";
			}
			System.out.println(result);
			
		}
		
		
		
		
//		for(int i = 0 ; i < arr.length ; i++) {
//			
//			System.out.print((i+1) + " : ");
//			
//			for(int j = 0 ; j < arr.length ; j++) {
//				
//				if(i != j) {
//					
//					if(arr[i] > arr[j])			System.out.print("> ");
//						
//					else if(arr[i] < arr[j])	System.out.print("< ");
//						
//					else						System.out.print("= ");
//						
//				}
//			}
//			
//			System.out.println();
//			
//		}
		
		
		
		
		

	}

}
