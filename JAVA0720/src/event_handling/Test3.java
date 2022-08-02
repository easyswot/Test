package event_handling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test3 {
	// 멤버레벨
	
	
	
	public Test3() {
		showFrame();
	}
	
	
	class MyMemberActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("button click");
			
		}
		
	}
	
//	class MyMemberActionListener [ implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("button click");
//			
//		}
//
//		
//	} ] => 람다식
	
	// 람다식 X
	// 추상메서드가 한개뿐인 인터페이스를 생성할 때 쓰는 문법 
//	class MyMemberActionListener e -> System.out.println("button click");
	
	private void showFrame() {
		// 1. 프레임 생성
		JFrame f = new JFrame("이벤트 처리 연습 - 3");
		f.setBounds(1000, 500, 200, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2. 버튼 객체 생성 및 JFrame 객체에 부착
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		// 3. 이벤트 처리3. 내부클래스 형태로 이벤트 처리
		MyMemberActionListener listener = new MyMemberActionListener();
		btn.addActionListener(listener);
		
		f.setVisible(true);
		
		
	}



	public static void main(String[] args) {
		new Test3();
		
		
		
		// 로컬

	}

}
