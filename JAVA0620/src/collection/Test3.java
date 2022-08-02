package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * Stack
		 * 
		 * 
		 * */
		
		Stack stack = new Stack();
		stack.push("1 - www.naver.com");
		stack.push("2 - www.daum.net");
		stack.push("3 - www.google.com");
		stack.push("4 - www.itwillbs.co.kr");
		
		// 반복문을 사용하여 top에서부터 하나씩 객체를 꺼내서 출력 후 제거 -pop()
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
//		System.out.println("stack : " + stack);
		
//		int length = stack.size();
//		for(int i = 0 ; i < length ; i++) {
//			System.out.println(stack.pop());
//		}
		
//		for(int i = stack.size() ; i > 0 ; i--) {
//			System.out.println(stack.pop());
//		}
		
//		while(stack.size() > 0) {
//			System.out.println(stack.pop());
//		}
		
//		for(Object o : stack) {
//			System.out.println(stack.pop());
//		}	// 이 상황에서 향상된 for문은 어울리지 않음
		
		System.out.println("----------------------------------------------");
		
		Queue q = new LinkedList();
		q.offer("1 - a.txt");
		q.offer("2 - Test1.java");
		q.offer("3 - selectForm.jsp");
		q.offer("4 - Ex1.html");
		
		// 반복문을 사용하여 하나씩 객체를 꺼내서 출력 후 제거 - poll()
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		System.out.println("q : " + q);
		
	}

}
