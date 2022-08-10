
public class Ex2_이지원 {

	public static void main(String[] args) {
		char ch = '1';
		
		boolean upperCase= 'A' <= ch && 'Z' >= ch;
		boolean lowerCase = 'a' <= ch && 'z' >= ch;
		boolean digit = '0' <= ch && '9' >= ch;
		
		String result = "";
		
		if(upperCase)		result = "대문자";
		else if(lowerCase)	result = "소문자";
		else if(digit)		result = "숫자";
		else				result = "기타문자";
		
		System.out.printf("%c : %s", ch, result);
	}

}
