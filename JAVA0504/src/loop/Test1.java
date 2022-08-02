package loop;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 중첩 while문을 사용하여 구구단 2단~9단 출력
		 * 
		 * < 2단 >
		 * 2 * 1 = 2
		 * 
		 * 
		 * < 3단 >
		 * 3 * 1 = 3
		 * 
		 * < 9단 >
		 * 9 * 1 = 9
		 * 9 * 9 = 81
		 * 
		 * */
		
		int i = 2;
		while(i < 10) {
			
			System.out.println("< " + i + "단 >");
			
			int j = 1;
			while(j < 10) {
				
				System.out.println(i + " * " + j + " = " + i*j);
				
				j++;
				
			}
			
			System.out.println();
			
			i++;
			
			
		}
		
		
		
		

	}

}
