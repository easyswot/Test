package event_handling;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Ex1 {
	
	public Ex1() {
		showFrame();
	}
	
	

	private void showFrame() {
		/*
		 * < 이벤트 처리 5단계 >
		 * 4단계. 익명 내부클래스 (Anonymous Inner Class) 형태로 정의
		 * - 리스너 인터페이스 또는 어댑터 클래스를 구현하는 핸들러를 별도로 정의하지 않고
		 * 	 해당 리스너 또는 어댑터의 이름을 그대로 사용하여
		 * 	 변수 선언 및 인스턴스 생성과 추상메서드 구현까지 한꺼번에 수행하는 방법
		 * - 개발자가 별도의 핸들러 이름을 부여하지 않으므로
		 * 	 이름이 없다는 뜻의 익병클래스라는 의미가 붙게 됨
		 * - 3단계 위치와 동일하며 클래스 정의 방법만 달라짐
		 * 
		 * */
		JFrame f = new JFrame("이벤트 처리 - 4");
		f.setBounds(600, 400, 300, 300);
		
		WindowAdapter listener = new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("로컬 windowClosing");
				System.exit(0);
			}
			
		};
		
		f.addWindowListener(this.listener);
		
		f.setVisible(true);
		
	}
	
	



	public static void main(String[] args) {
//		System.out.println(this.);	// static에서는 this 사용 안됨
		new Ex1();
		
		
		
	}
	
	// 이벤트 처리 4단계 익명 내부클래스 (Anonymous inner class) 형태로 정의
	// => windowAdapter또는 windowListener 이름을 그대로 사용하여
	// 멤버 내부 클래스 형태로 정의
	// => 인스턴스 멤버와 동일한 위치에 정의하므로 인스턴스 내부 클래스라고도 함
	// => 인스턴스 내의 여러 메서드에서 공유 가능
	WindowAdapter listener = new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("멤버 윈도우 클로징");
			System.exit(0);
		}
		
		
		
	};
	
	
	
	

}
