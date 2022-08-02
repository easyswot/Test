package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test_Chat {
	
	public Test_Chat() {
		showFrame();
	}
	
	private void showFrame() {
		
		JFrame f = new JFrame("채팅");
		f.setBounds(800, 400, 400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ---------------- 중앙(CENTER 영역) 채팅 메시지 출력 ---------------------
		// 채팅 메시지 스크롤을 위해 JScrollPane 생성 후 JTextArea 부착 필요
		JScrollPane scrollPane = new JScrollPane();
		f.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea ta = new JTextArea();
		ta.setEditable(false);					// 편집 불가능 하도록 설정
		ta.setBackground(Color.LIGHT_GRAY);		// 배경색 설정
		scrollPane.setViewportView(ta);
		
		// ---------------- 하단(SOUTH 영역) 채팅 메시지 입력 및 버튼 ---------------------
		
		JPanel pSouth = new JPanel();
		f.add(pSouth, BorderLayout.SOUTH);
		
		JTextField tf =new JTextField(20);	// Panel 부착 시 COLUMN 크기 지정 필수
											// 기본적으로 FlowLayout 이기 때문
		pSouth.add(tf);
		
		JButton btnSend = new JButton("전송");
		JButton btnClear = new JButton("초기화");
		
		pSouth.add(tf);
		pSouth.add(btnSend);
		pSouth.add(btnClear);
		
		// 1. 전송 버튼 클릭 및 텍스트 필드 입력 후 엔터키 입력 시 메시지 전송 (JTextArea 출력)		4단ㄱㅖ
		ActionListener listener = e -> {
			String str = tf.getText();
//			if(ta.getText().equals("")) {
//				ta.setText(str);
//			} else {
//				ta.setText(ta.getText() + "\n" + str);
//			}
			
			String msg = ta.getText().equals("") ? str : ta.getText() + "\n" + str;
			ta.setText(msg);
			tf.setText("");
			
			tf.requestFocus();
			
			
		};
		
		
		// 2. 초기화 버튼 클릭 시 JTextArea에 표시된 내용 모두 삭제하고 JTextField에 커서 요청		5단계
		btnClear.addActionListener(e -> {
			ta.setText("");
			tf.requestFocus();
		});
		
		
		
		tf.addActionListener(listener);
		btnSend.addActionListener(listener);
		
		f.setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		new Test_Chat();

	}

}
