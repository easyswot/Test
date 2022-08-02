package _if;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 중첩 if문
		 * - if문 블록 내에서 또 다른 if문을 기술하는 것
		 * 		(else 블록 내에서 기술해도 됨)
		 * - 중첩 횟수에는 제한 없음
		 * 
		 * 
		 * */
		
		/*
		 * 학생 score에 대한 grade 판별
		 * a	90-100
		 * b	80-89
		 * c	70-79
		 * d	60-69
		 * f	0-59
		 * 그외	"점수 입력 오류"
		 * */
		
		int score = 88;
		String grade = "";
//		if(score>=90&&score<=100)			grade="A학점";
//		else if(score>=80&&score<=89)		grade="B학점";
//		else if(score>=70&&score<=79)		grade="C학점";
//		else if(score>=60&&score<=69)		grade="D학점";
//		else if(score>=0&&score<=59)		grade="F학점";
//		else								grade="점수 입력 오류";
		
//		if(score>=90&&score<=100)		grade="A학점";
//		else if(score>=80)				grade="B학점";	//100이상의 점수 오면 b 출력
//		else if(score>=70)				grade="C학점";
//		else if(score>=60)				grade="D학점";
//		else if(score>=0)				grade="F학점";
//		else							grade="점수 입력 오류";
		
		if(score>=0&&score<=100) {
			
			//score는 무조건 0-100 사이값
			if(score>=90)			grade = "A학점";
			else if(score>=80)		grade = "B학점";
			else if(score>=70)		grade = "C학점";
			else if(score>=60)		grade = "D학점";
			else					grade = "F학점";
			
		} else {
			
			grade = "점수 입력 오류";
			
		}
		
//		else if(score>=80&&score<=89)		grade="B학점";
//		else if(score>=70&&score<=79)		grade="C학점";
//		else if(score>=60&&score<=69)		grade="D학점";
//		else if(score>=0&&score<=59)		grade="F학점";
//		else								grade="점수 입력 오류";
		
		
		System.out.println(grade);
		
		
		

	}

}
