package layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex3 {
	public Ex3() {
		showFrame();
	}

	private void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(800, 400, 600, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * GridLayout
		 * - 컴포넌트를 테이블(표) 형태로 배치하는 레이아웃
		 * - 행, 열 형태의 구조를 가지며, 배치되는 컴포넌트의 크기가 균등함
		 * 	 => GridBagLayout 사용 시 크기가 다른 행, 열 구조 편성 가능
		 * - 첫 행의 좌측열부터 우측열 방향, 다음 행의 좌측열부터 우측열 순으로 배치
		 * - BorderLayout과 마찬가지로 컨테이너 크기가 변경되면
		 * 	 컴포넌트의 크기만 변경되고, 컴포넌트의 배치 위치는 변경되지 않음
		 * */
		// 현재 JFrame 객체를 GridLayout의 3행 2열 구조로 변경
//		GridLayout gridLayout = new GridLayout(3, 2);			// 행, 열 선택
		GridLayout gridLayout = new GridLayout(3, 2, 10, 20);	// 행, 열 선택, 수평 간격, 수직 간격 선택
		f.setLayout(gridLayout);
		
		// 버튼 5개 생성
		JButton btn1 = new JButton("BUTTON 1");
		JButton btn2 = new JButton("BUTTON 2");
		JButton btn3 = new JButton("BUTTON 3");
		JButton btn4 = new JButton("BUTTON 4");
		JButton btn5 = new JButton("BUTTON 5");
		
		// 생성된 버튼들을 frame에 부착
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		
		JButton btn6 = new JButton("BUTTON 6");
		f.add(btn6);
		
		JButton btn7 = new JButton("BUTTON 6");
		f.add(btn7);
		
		
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex3();

	}

}
