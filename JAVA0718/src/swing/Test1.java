package swing;

import javax.swing.JFrame;

/*
 * 400 400 크기의 창 생성
 * 제목 : JFrame 생성 연습
 * 닫기 버튼 클릭 시 프로그램 종료
 * 화면 표시 설정 true
 * => JFrame 상속받는 버전, JFrmae 객체 직접 생성하는 버전
 * 
 * 
 * 
 * */


public class Test1 extends JFrame {

	public Test1() {
		showFrame();
	}
	
	public void showFrame() {
		setSize(400, 400);
		setTitle("JFrame 생성 연습 - JFrame 상속");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// ---------------------------------------------------
		JFrame f = new JFrame("JFrame 생성 연습 - 객체 직접 생성");
		f.setSize(400, 400);
		f.setLocation(400, 400);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Test1();
		
		
	}

}
