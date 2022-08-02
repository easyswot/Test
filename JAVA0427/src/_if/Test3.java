package _if;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * 1. 정수형 변수 num1에 대한 양수, 음수, 0 판벌
		 * 2. 정수형 변수 num2에 대한 홀수, 짝수, 0 판별
		 * 3. 문자 ch가 대문자 -> 소문자, 소문자 -> 대문자
		 *	  아니면 "ch는 영문자가 아님" 출력
		 * 
		 * */
		
//		정수형 변수 num1에 대한 양수, 음수, 0 판벌
		
//		Scanner sc = new Scanner(System.in);
//		sc.nextInt();
		
		int num1 = 645;
		String result1 = "1. num1은 ";
		
//		if(num1 < 0)			result1 += "음수";
//		else if(num1 == 0)		result1 += "0";
//		else					result1 += "양수";
		//==보다 범위(< , >)가 더 빠르다.
		
		result1 += num1<0	? "음수" :
				   num1>0	? "양수"	: "0";
		
		System.out.println(result1);
		
		
		
		
		
		
//		정수형 변수 num2에 대한 홀수, 짝수, 0 판별
		
		int num2 = 0;
		int a = num2%2;
		String result2 = "2. " + num2 + " : ";
		
//		if(a>0)					result2 += "홀수";
//		else if(num2==0)		result2 += "0";
//		else					result2 += "짝수";
		
		result2 += a>0		? "홀수"	:
				   num2==0	? "0"	: "짝수";
		
		System.out.println(result2);
		
		
		
		
		
		
		
//		문자 ch가 대문자 -> 소문자, 소문자 -> 대문자
//		  아니면 "ch는 영문자가 아님" 출력
		
		char ch = '!';
		boolean b1 = ch>='A'&&ch<='Z';
		boolean b2 = ch>='a'&&ch<='z';
		
		String result3 = "3. ch -> ";
		
//		if(b1) 					result3 += (char)(ch+32);
//		else if(b2) 			result3 += (char)(ch-32);
//		else					result3 = "ch는 영문자가 아님";
		
//		if(b1) 					ch += 32;
//								System.out.println(result3 + ch);
//		else if(b2) 			ch += -32;
//								System.out.println(result3 + ch);
//		else					System.out.println("ch는 영문자가 아님");
		
//		result3 += b1	?	(char)(ch+32)	:
//				   b2	?	(char)(ch-32)	:	"영문자가 아님";
//		
//		System.out.println(result3);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 학생 score에 대한 grade 판별
		 * a	90-100
		 * b	80-89
		 * c	70-79
		 * d	60-69
		 * f	0-59
		 * 
		 * */
		
//		Scanner sc = new Scanner(System.in);
//		int score = sc.nextInt();
		int score = 75;		//0<=score<=100
//		char grade;
		String grade;
		
//		if(score>=90&&score<=100)			grade="A학점";
//		else if(score>=80&&score<=89)		grade="B학점";
//		else if(score>=70&&score<=79)		grade="C학점";
//		else if(score>=60&&score<=69)		grade="D학점";
//		else 								grade="F학점";
		
//		if(score>=90)			grade="A학점";
//		else if(score>=80)		grade="B학점";
//		else if(score>=70)		grade="C학점";
//		else if(score>=60)		grade="D학점";
//		else					grade="F학점";
		
		
		
//		System.out.println("학생의 점수는 "+score+"점 이고, 학점은 "+grade+"입니다.");
		
//		if(90<=score)		    grade="A";
//		else if(80<=score)		grade="B";
//		else if(70<=score)		grade="C";
//		else if(60<=score)		grade="D";
//		else					grade="F";
//		
//		grade += "학점";
		
		
		grade = 90<=score ? "A" :
				80<=score ? "B" :
				70<=score ? "C" :
				60<=score ? "D" : "F";
		System.out.println(grade);
		
		
		
		
		
		

	}

}
