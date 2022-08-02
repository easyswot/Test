package event_handling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test2 {
	
	public Test2() {
		showFrame();
	}
	
	
	private void showFrame() {
		// 이벤트 처리5. 익명 내부클래스의 임시객체 형태로 이벤트 처리
		// JButton 컴포넌트에 대한 이벤트 처리 담당 리스너 ActionListener 인터페이스
		
		JFrame f = new JFrame("이벤트 처리 - 5");
		f.setBounds(800, 500, 300, 300);
		
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭");
				
			}
		};
		
//		ActionListener listener2 = e -> System.out.println("람다 버튼 클릭");
//		
//		
//		btn.addActionListener(listener2);
		
		btn.addActionListener(e -> System.out.println("람다 버튼 클릭"));
		
		
		f.setVisible(true);
		
		
	}


	public static void main(String[] args) {
		new Test2();
	}
	
	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("button click");
			
		}
	};

}
