import java.util.Random;

public class Ex1_이지원 {

	public static void main(String[] args) {
		int pee = 50000;
		
		Random r = new Random();
		int age = r.nextInt(100)+1;
		
		boolean b1 = age < 5 || age >= 65;
		boolean b2 = age >= 5 && age <= 19;
		
		if(b1) 			pee *= 0.5;
		else if(b2)		pee *= 0.7;
		
		System.out.printf("나이가 %d세이므로 입장료는 %d원입니다.", age, pee);
	}

}
