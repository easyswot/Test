package component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ex3 {
	
	public Ex3() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(800, 400, 350, 110);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * JOptionPane
		 * - 다이얼로그(팝업창)을 생성하는 객체
		 * - 사용자에게 알림 메세지를 팝업창으로 표시하거나 (alert)
		 * 	 사용자의 선택을 받거나 (confirm), 사용자로부터 데이터를 입력받는 용도 (prompt) 사용
		 * - JOptionPane 클래스의 static 메서드인 showXXXDialog() 메서드를 호출해서 표시
		 * 	 => xxx부분의 이름에 따라 다이얼로그 종류가 달라짐
		 * - 생성자 파라미터에 따라 각각 다른 옵션 설정이 가능
		 * 
		 * 1) MessageDialog : 사용자에게 메세지를 표시하기 위한 다이얼로그
		 * 2) ConfirmDialog : 사용자로부터 선책을 받도록 버튼을 표시하는 다이얼로그
		 * 3) InputDialog : 사용자로부터 데이터를 입력받기 위한 다이얼로그
		 * 
		 * */
		
		// JPanel 객체 생성하여 CENTER 영역에 부착
		JPanel p = new JPanel();
		f.add(p, BorderLayout.CENTER);
		
		// JButton 객체 3ro (btnMessage, btnConfirm, btnInput) 생성
		JButton btnMessage = new JButton("btnMessage");
		JButton btnConfirm = new JButton("btnConfirm");
		JButton btnInput = new JButton("btnInput");
		
		p.add(btnMessage);
		p.add(btnConfirm);
		p.add(btnInput);
		
		// 각 버튼 이벤트 처리 - 4단계
		// => ActionListener 구현체 내부에서 버튼 3개를 판별
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnMessage) {	// alert
					
//					JOptionPane.showMessageDialog(
//							f,								// 다이얼로그 표시 대상 객체
//							"다이얼로그 메시지",				// 본문
//							"다이얼로그 제목",					// 제목
//							JOptionPane.QUESTION_MESSAGE);		// 메시지 형태
					
					// 제목 : 메시지, 메시지종류 : INFORMATION_MESSAGE로 자동 지정됨
					JOptionPane.showMessageDialog(f, "다이얼로그");
					
				} else if(e.getSource() == btnConfirm) {	// confirm
					int select = JOptionPane.showConfirmDialog(
							f,									// 표시할 대상 객체
							"종료하시겠습니까?",					// 메시지
							"종료",								// 제목
							JOptionPane.YES_NO_CANCEL_OPTION,			//
							JOptionPane.QUESTION_MESSAGE);		// 메시지 형태
					System.out.println(select);		// 0(YES), 1(NO), 2(CANCEL), -1(CLOSE)
					if(select == JOptionPane.YES_OPTION) {				// 0
						System.out.println("종료");
					} else if(select == JOptionPane.NO_OPTION) {		// 1
						System.out.println("종료 안함");
					} else if(select == JOptionPane.CANCEL_OPTION) {	// 2
						System.out.println("종료 취소");
					} else if(select == JOptionPane.CLOSED_OPTION) {	// -1
						System.out.println("confirm창 닫음");
					}
					
					
				} else if (e.getSource() == btnInput) {		// prompt
					
					String input = JOptionPane.showInputDialog(f, "검색할 이름 입력");
					if(input != null) {	// 무조건 확인버튼 눌림
						System.out.println("입력할 데이터" + input);
					}
				}
				
			}
		};
		
		btnMessage.addActionListener(listener);
		btnConfirm.addActionListener(listener);
		btnInput.addActionListener(listener);
		
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ex3();

	}

}
