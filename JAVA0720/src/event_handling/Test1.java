package event_handling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 {
	
	public Test1() {
		showFrame();
	}
	
	public void showFrame() {
		/*
		 * 1. 300 200 프레임 생성
		 * 2. "버튼" 이라는 텍스트를 갖는 버튼 객체 부착
		 * 3. 클릭 이벤트 처리를 위해 ActionListener 인터페이스를 구현 핸들러(MyActionListener) 정의
		 * 	 => 추상 메서드 오버라이딩
		 * 	 => 메서드 내에 "버튼 클릭" 문자열 출력하는 코드 기술
		 * 4. ActionListener 인터페이스 구현체 객체 생성
		 * 5. 버튼 객체의 addXXXListener() 메서드 호출하여 MyActionListener 객체 전달
		 * */
		
		JFrame f = new JFrame("이벤트 처리 연습-1");
		f.setBounds(1000, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		
		f.setVisible(true);
		
		//==========================================================
		JFrame f2 = new JFrame("버튼 연습");
		f2.setBounds(300, 300, 300, 300);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn2 = new JButton("버튼2");
		f2.add(btn2);
		
		btn2.addActionListener(listener);
		
		f2.setVisible(true);
		
		
		
		
		
	}

	public static void main(String[] args) {
		new Test1();

	}

}


class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭");
		
	}
	
}