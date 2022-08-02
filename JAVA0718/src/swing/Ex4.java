package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex4 {

	public Ex4() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(800, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * JButton 클래스
		 * - 버튼 기능(클릭입력)을 수행하는 컴포넌트
		 * - 생성자 파라미터에 문자열 전달 시 버튼의 텍스트 설정 가능
		 * - 단독으로 사용은 불가능하며, 컨테이너(프레임 또는 패널 등)에 부착해서 사용 필요
		 * 	 => 해당 컨테이너의 add() 메서드를 호출하여 추가(부착)
		 * 
		 * */
		
		// 1. JButton 객체 생성
		JButton btn = new JButton("버튼");
		
		// 2. JButton 객체를 JFrame 객체에 부착(추가)
		f.add(btn);	// 프레임 버튼 부착
		
		f.setVisible(true);
		
		// --------------------------------------------------------------------
		
		JFrame f2 = new JFrame("button frame");
		f2.setBounds(200, 200, 500, 500);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn2 = new JButton("button");
		f2.add(btn2);
		f2.setVisible(true);
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Ex4();
		
	}

}
