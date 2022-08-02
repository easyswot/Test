package method;




class Calculator2 {
	public void calc(char opr, int...nums) {
		int sum = nums[0];
		System.out.print(nums[0]);
		
		if(opr == '+') {
			
			for(int i = 1 ; i < nums.length ; i++) {
				sum += nums[i];
				System.out.print(" + " + nums[i]);
			}
			
		} else if(opr == '-') {
			
			for(int i = 1 ; i < nums.length ; i++) {
				sum -= nums[i];
				System.out.print(" - " + nums[i]);
			}				
				
		} else if(opr == '*') {

			
			for(int i = 1 ; i < nums.length ; i++) {
				sum *= nums[i];
				System.out.print(" * " + nums[i]);
			}			
			
			
		} else if(opr == '/') {
			for(int i = 1 ; i < nums.length ; i++) {
				sum /= nums[i];
				System.out.print(" / " + nums[i]);
			}			
		}
		System.out.println(" = " + sum);
		
		
		//놓친 부분 사진찍어놓ㅁ 자료랑 비교해서 보셈
		
		
		
	}
}





public class Test4 {

	public static void main(String[] args) {
		
		Calculator2 a = new Calculator2();
		a.calc('+', 10, 2, 3, 4, 5, 9);
		
		Calculator2 b = new Calculator2();
		b.calc('-', 100, 1, 2, 3);
		
		Calculator2 c = new Calculator2();
		c.calc('*', 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Calculator2 d = new Calculator2();
		d.calc('/', 700, 2, 5, 7);
		
		
		
	}

}






















//int sum = 0;
//for(int i = 0 ; i < nums.length ; i++) {
//	sum += nums[i];
//	
//	if(i==nums.length-1) {
//		System.out.println(nums[i] + " = " + sum);
//	} else {
//		System.out.print(nums[i] + " + ");
//	}
//}



//int a = 0;
//for(int i = 0 ; i < nums.length ; i++) {
//	
//	if(i==0) {
//		a = nums[i];
//		System.out.print(nums[i] + " - ");
//	} else if (i==nums.length-1) {
//		a -= nums[i];
//		System.out.println(nums[i] + " = " + a);
//	} else {
//		a -= nums[i];
//		System.out.print(nums[i] + " - ");
//	}




//int b = 1;
//
//for(int i = 0 ; i < nums.length ; i++) {
//	b *= nums[i];
//	
//	if(i==nums.length-1)	System.out.println(nums[i] + " = " + b);
//	else					System.out.print(nums[i] + " * ");
//}





