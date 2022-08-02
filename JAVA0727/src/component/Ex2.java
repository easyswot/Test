package component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex2 {
	
	JTextField tf;
	
	public Ex2() {
		showFrame();
	}
	
	

	private void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(800, 400, 300, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * JPanel(패널)
		 * - 여러 개의 컴포넌트를 하나로 묶는 경량 컨테이너
		 * - 기본 레이아웃 : FlowLayout
		 * - 주로, 프레임(JFrame)에 패널(Panel)을 부착하여 컴포넌트를 배치하는 형태로 사용
		 * 
		 * */
		
		// 프레임의 CENTER 영역에 JTextField와 JButton 컴포넌트를 하나로 묶어서 부착
		// => 복수개의 컴포넌트를 묶기 위해서 JPanel 사용
		
		// 1. JPanel 객체 생성
		JPanel p = new JPanel();
		
		// 2. JPanel 컨테이너를 JFrame 컨테이너의 CENTER 영역에 부착 (나중에 부착해도 됨)
		f.add(p, BorderLayout.CENTER);
		
		// 3. TextField와 JButton 객체를 생성
		// => 주의 FlowLayout을 갖는 JPanel에 JTextField를 부착하는 경우
		//	  반드시 JTextField의 컬럼크기 설정 필수
		
		tf = new JTextField(15);
		JButton btn = new JButton("확인");
		
		// 4. JTextField와 JButton 객체를 JPanel에 부착
		p.add(tf);
		p.add(btn);
		
		// 5. 리스너 연결 => 리스너 구현 코드 중복 제거를 위해 4단계 구현
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				printMessage();
				
			}
		};
		
		tf.addActionListener(listener);
		btn.addActionListener(listener);
		
		
		
		f.setVisible(true);
	}
	
	// JTextField에 입력된 텍스트를 가져와서 출력하는 메서드 정의
	public void printMessage() {
		System.out.println(tf.getText());
		tf.setText("");
		
		tf.requestFocus();				// 안전코드 넣는 것도 중요함
		
	}



	public static void main(String[] args) {
		new Ex2();

	}

}
