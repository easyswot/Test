package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 트럼프 카드 구현을 위해 List 객체 사용
		 * - ArrayList 객체(cards) 생성
		 * 	 기호 ♠, ♣, ♥, ◆ 와 숫자 2 ~ 9, 영문자 A, J, Q, K를 조합하여 카드 생성
		 * - marks ♠, ♣, ♥, ◆
		 * - numbers 숫자 2 ~ 9, 영문자 A, J, Q, K
		 * */
		
		/* 
		 * 반복문을 사용하여 숫자와 마크를 중첩으로 반복 (총 52개의 트럼프 카드 생성됨)
		 * => 마크 + 숫자를 결합한 쿤자열을 ArrayList객체 (cards)에 추가
		 * 	  ex) ♠ + 2 => ♠2를 cards에 추가
		 * => 최종적으로 생성된 트럼프 카드 목록을 출력
		 * 
		 * 
		 * */
		
//		List marks = new ArrayList();
//		marks.add("♠");
//		marks.add("♣");
//		marks.add("♥");
//		marks.add("◆");
		
		String[] marks = {"♠", "♣", "♥", "◆"};
		
//		List numbers = new ArrayList();
//		numbers.add("A");
//		for(int i = 2 ; i < 10 ; i++) {
//			numbers.add(i);
//		}
//		
//		numbers.add("J");
//		numbers.add("Q");
//		numbers.add("K");
		
		String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
		
		
		/* 
		 * 반복문을 사용하여 숫자와 마크를 중첩으로 반복 (총 52개의 트럼프 카드 생성됨)
		 * => 마크 + 숫자를 결합한 쿤자열을 ArrayList객체 (cards)에 추가
		 * 	  ex) ♠ + 2 => ♠2를 cards에 추가
		 * => 최종적으로 생성된 트럼프 카드 목록을 출력
		 * 
		 * 
		 * */
//		System.out.println(marks);
//		System.out.println(numbers);
//		
		List<String> cards = new ArrayList<String>();
		
//		for(int i = 0 ; i < numbers.length  ; i++) {
//			for(int j = 0 ; j < marks.length ; j++) {
//				cards.add(marks[j] + numbers[i]);
//			}
//		}
		
		for(String number : numbers) {
			for(String mark : marks) {
				cards.add(mark + number);
			}
		}
		
		System.out.println(cards);
		
		Collections.shuffle(cards);
		System.out.println(cards);
		
		System.out.println();
		
		
		String[] player1 = new String[5];
		String[] player2 = new String[5];
		String[] player3 = new String[5];
		
//		// get() 메서드를 사용하여 카드를 전달하는 경우
//		player1[0] = cards.get(0).toString();
//		player2[0] = cards.get(1).toString();
//		player3[0] = cards.get(2).toString();
//		
//		System.out.println(player1[0]);
//		System.out.println(player2[0]);
//		System.out.println(player3[0]);
//		
//		System.out.println(cards);
		
//		player1[0] = cards.remove(0);
//		player2[0] = cards.remove(0);
//		player3[0] = cards.remove(0);
//		player1[1] = cards.remove(0);
//		player2[1] = cards.remove(0);
//		player3[1] = cards.remove(0);
//		player1[2] = cards.remove(0);
//		player2[2] = cards.remove(0);
//		player3[2] = cards.remove(0);
		
		for(int i = 0 ; i < player1.length ; i++) {
			player1[i] = cards.remove(0);
			player2[i] = cards.remove(0);
			player3[i] = cards.remove(0);
		}
		
		System.out.println("플레이어1의 카드 : " + Arrays.toString(player1));
		System.out.println("플레이어2의 카드 : " + Arrays.toString(player2));
		System.out.println("플레이어3의 카드 : " + Arrays.toString(player3));
		System.out.println("전달하고 남은 카드 : " + cards);
		
		
		
	}

}
