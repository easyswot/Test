package event_handling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 {
	public Test1() {
		showFrame();
	}
	
	

	private void showFrame() {
		JFrame f = new JFrame("이벤트 처리 연습 - 4");
		f.setBounds(800, 300, 400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		// 람다식 O
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button click");
				
			}
		};
		
		ActionListener listener2 = e -> System.out.println("람다 버튼 클릭");
		
		btn.addActionListener(listener);
		
		// 이벤트 처리4. 익명 내부 클래스 형태로 정의 (멤버 레벨)
		// Jbutton 컴포넌트에 대한 이벤트 처리 담당 리스너 : ActionListener 인터페이스
		f.setVisible(true);
		
		
	}



	public static void main(String[] args) {
		new Test1();

	}
	
	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("버튼 클릭");
			
		}
	};
	
	ActionListener listener2 = e -> System.out.println("버튼 클릭");
	

}
