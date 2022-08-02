package switch_case;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 학생 score에 대한 grade 판별
		 * a	90-100
		 * b	80-89
		 * c	70-79
		 * d	60-69
		 * f	0-59
		 * 그외	"점수 입력 오류"
		 * 
		 * 단, if + switch~case문
		 * 
		 * */
		
		
		int score = 100;
		String grade = "";
		
//		if(score>=0&&score<=100) {
//		
//			switch (score/10) {
//			case 10:
//				
//			case 9:
//				grade += "A학점";
//				break;
//			case 8:
//				grade += "B학점";
//				break;
//			case 7:
//				grade += "C학점";
//				break;
//			case 6:
//				grade += "D학점";
//				break;
//			default:
//				grade += "F학점";
//				break;
//		}
//			System.out.println(grade);
//		} else	{
//			System.out.println("점수 입력 오류");
//		}
		
		if(score>=0&&score<=100) {
			
			switch (score/10) {
			case 10:
				
			case 9:
				grade += "A학점";
				break;
			case 8:
				grade += "B학점";
				break;
			case 7:
				grade += "C학점";
				break;
			case 6:
				grade += "D학점";
				break;
			default:
				grade += "F학점";
		}
			
		} else	{
			grade = "점수 입력 오류";
		}
		System.out.println(grade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(score>=0&&score<=100) {
//			
//			switch (score/10) {
//			case 10:
//				grade += "A학점";
//				break;
//			case 8:
//				grade += "B학점";
//				break;
//			case 7:
//				grade += "C학점";
//				break;
//			case 6:
//				grade += "D학점";
//				break;
//			case 5:
//				grade += "F학점";
//				break;
//			} 
//			
//		}
		

	}

}
