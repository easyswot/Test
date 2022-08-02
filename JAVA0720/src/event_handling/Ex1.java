package event_handling;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Ex1 {
		/*
		 * 이벤트(Event)
		 * - 컴포넌트(버튼 등)에서 사용자에 의해 어떤 상호작용이 일어나는 것
		 * 	 ex) 버튼 클릭, 마우스 이동, 키보드 입력, 체크박스 선택 등
		 * - 이벤트가 발생했을 때 어떤 동작을 수행하기 위해서는
		 * 	 대상 컴포넌트와 이벤트를 처리하는 이벤트 리스너를 서로 연결해야함
		 * 	 => 각 컴포넌트에 따라 서로 다른 리스너가 제공됨
		 * 		ex) 버튼 클릭 이벤트 담당 : ActionLinstener 사용
		 * 	 => 컴포넌트 객체의 addXXX() 메서드를 호출하여 리스너 객체를 파라미터로 전달하여 연결
		 * 		이 때, XXX은 담당 리스너 인터페이스(또는 클래스) 이름
		 * 		ex) btn.addActionListener(리스너 객체_;
		 * 
		 * 이벤트 처리(Event Handling)
		 * - 컴포넌트에 특정 이벤트가 발생했을 때 수행할 동작을 지정하여 처리하는 것
		 * - 리스너 인터페이스(또는 어댑터 클래스) 구현을 통해 내부에 수행할 동작을 명시
		 * 	 => XXXListener 인터페이스 또는 XXXAdapter 클래스가 제공됨
		 * - 리스너 객체를 직접 구현하거나, 별도의 핸들러(Handler) 클래스를 정의하여
		 * 	 리스너 인터페이스(또는 어댑터 클래스)를 상속받아 구현
		 * 
		 * < 이벤트 처리 5단계 >
		 * 1. 리스너 인터페이스를 구현하는 구현체 클래스(핸들러)를 정의
		 * 	  => 이벤트 발생 시 수행할 동작을 구현체 내부의 메서드에 기술하고
		 * 		 리스너 연결 시 구현체 객체 생성하여 addXXXListener() 메서드 파라미터로 전달
		 * 
		 * 
		 * */
	public Ex1() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("이벤트 처리-1");
		f.setBounds(600, 400, 300, 300);
		MyWindowListener listener = new MyWindowListener();
		f.addWindowListener(listener);
		f.setVisible(true);
		
		// =====================================================
		JFrame f2 = new JFrame();
		f2.setBounds(800, 400, 400, 400);
		// 만약, 처리할 이벤트가 동일할 경우 새 객체를 생성하지 않고
		// 기존에 생성한 리스너 객체를 그대로 재사용 가능
		f2.addWindowListener(listener);
		f2.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ex1();
		
		
		
		
	}

}


class MyWindowListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// 맨 처음 프로그램이 실행될 때 프레임이 생성되어 표시되면 호출되는 메서드(1회)
		System.out.println("windowOpened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 맨 마지막 프로그램이 종료될 때 닫기 버튼을 클릭하면 호출되는 메서드
		System.out.println("windowClosing");
		System.exit(0);	// 프로그램이 종료(0: 정상 종료, 0이외의 값: 비정상 종료)
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		//
		System.out.println("windowClosed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// 프레임의 최소화 버튼 클릭 시 호출되는 메서드
		System.out.println("windowIconified");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// 프레임의 최소화가 애제될 때 호출되는 메서드
		System.out.println("windowDeiconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// 프레임이 사용자와 상호작용이 가능한 상태가 될 때 호출되는 메서드
		System.out.println("windowAcrivated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// 프레임이 사용자와 상호작용이 불가능한 상태가 될 때 호출되는 메서드
		// ex) 다른 프로그램에 가려진 상태가 될 때
		System.out.println("windowDeactivated");
		
	}
	
}
