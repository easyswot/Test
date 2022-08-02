package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test_Calc {
	
	public Test_Calc() {
		showFrame();
	}
	
	
	private void showFrame() {
		
		JFrame f = new JFrame("계산기");
		f.setBounds(800, 400, 260, 350);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ----------------- << 계산기 > --------------------
		// -------------- 상단 숫자 표시 패널 ------------------
		
		JTextField tfNum = new JTextField();
		tfNum.setHorizontalAlignment(JTextField.RIGHT);	// 텍스트 우측 정렬
		tfNum.setMargin(new Insets(5, 10, 5, 10));
		tfNum.setText("0");			// 초기 숫자
		tfNum.setEditable(false);	// 숫자 편집 불가
		tfNum.setFont(new Font("맑은고딕", Font.BOLD, 25));
		f.add(tfNum, BorderLayout.NORTH);
		
		// ------------ 중앙 숫자 버튼 패널 -------------
		JPanel pCenter = new JPanel(new GridLayout(5, 4));
		f.add(pCenter, BorderLayout.CENTER);
		
		Font btnfont = new Font("맑은고딕", Font.BOLD, 18);
		
		
		// CE C ← ÷
		JButton btnCE = new JButton("CE");
		btnCE.setFont(btnfont);
		btnCE.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnCE);
		
		JButton btnC = new JButton("C");
		btnC.setFont(btnfont);
		btnC.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnC);
		
		JButton btnDel = new JButton("←");
		btnDel.setFont(btnfont);
		btnDel.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnDel);
		
		JButton btnDiv = new JButton("÷");
		btnDiv.setFont(btnfont);
		btnDiv.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnDiv);
		
		// 7 8 9 ×
		JButton btn7 = new JButton("7");
		btn7.setFont(btnfont);
		btn7.setBackground(Color.WHITE);
		pCenter.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(btnfont);
		btn8.setBackground(Color.WHITE);
		pCenter.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(btnfont);
		btn9.setBackground(Color.WHITE);
		pCenter.add(btn9);
		
		JButton btnMul = new JButton("×");
		btnMul.setFont(btnfont);
		btnMul.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnMul);
		
		// 4 5 6 -
		JButton btn4 = new JButton("4");
		btn4.setFont(btnfont);
		btn4.setBackground(Color.WHITE);
		pCenter.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(btnfont);
		btn5.setBackground(Color.WHITE);
		pCenter.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(btnfont);
		btn6.setBackground(Color.WHITE);
		pCenter.add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(btnfont);
		btnSub.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnSub);
		
		// 1 2 3 +
		JButton btn1 = new JButton("1");
		btn1.setFont(btnfont);
		btn1.setBackground(Color.WHITE);
		pCenter.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(btnfont);
		btn2.setBackground(Color.WHITE);
		pCenter.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(btnfont);
		btn3.setBackground(Color.WHITE);
		pCenter.add(btn3);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(btnfont);
		btnAdd.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnAdd);
		
		// ± 0 . =
		JButton btnSign = new JButton("±");
		btnSign.setFont(btnfont);
		btnSign.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnSign);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(btnfont);
		btn0.setBackground(Color.WHITE);
		pCenter.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(btnfont);
		btnDot.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnDot);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setFont(btnfont);
		btnEquals.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnEquals);
		
		// C(Clear) 버튼 클릭 시 숫자 표시창 초기화
		btnC.addActionListener(e -> tfNum.setText("0"));
		
		// 모든 버튼을 하나의 ActionListener 리스너에 연결
		ActionListener btnListener =  new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 숫자 0 ~ 9 버튼 판별하기
				// 1. 이벤트 대상 객체 (e)의 getSource() 메서드를 통해 버튼 객체 비교하기
				// => 숫자 버튼 모두 비교해야함
//				if(e.getSource() == btn0 ||
//				   e.getSource() == btn1 ||
//				   e.getSource() == btn2 ||
//				   e.getSource() == btn3 ||
//				   e.getSource() == btn4 ||
//				   e.getSource() == btn5 ||
//				   e.getSource() == btn6 ||
//				   e.getSource() == btn7 ||
//				   e.getSource() == btn8 ||
//				   e.getSource() == btn9) {
//					System.out.println("숫자 버튼");
//				}
				
				// 2. 이벤트 대상
				char btnCh = e.getActionCommand().charAt(0);
//				if('0' <= btnCh && btnCh <= '9') {
//					System.out.println("숫자 버튼");
//				}
				
				
				if(Character.isDigit(btnCh)) {	// 숫자인지 판별
					// 현재 표시된 숫자 가져오기
					String currNum = tfNum.getText();
					
					if(currNum.equals("0")) {	// 0일 경우
						// 0대신 입력받은 숫자 표시
						tfNum.setText(btnCh + "");
					} else {	// 0 이외의 숫자가 표시되어 있을 경우
						// 새로 입력된 숫자를 기존 숫자 뒤에 연결하여 표시
						tfNum.setText(currNum + btnCh);
					}
					
					
				} else if(btnCh == '←') {	// 삭제버튼 클릭 시
					
					String currNum = tfNum.getText();	// 현재 표시된 숫자 가져오기
					
					if(currNum.length() < 2) {	// 현재 숫자가 2자리 미만일 경우
						tfNum.setText("0");
					} else {
						
						// 마지막 숫자 제거
						// => 가장 마지막 숫자를 제외한 나머지 숫자만 추출하여 출력
						// => 마지막 숫자 앞자리까지 추출
						tfNum.setText(currNum.substring(0, currNum.length() - 1));
						
					}
					
				}
				
				
			}
		};
		
		btnDel.addActionListener(btnListener);
		btn0.addActionListener(btnListener);
		btn1.addActionListener(btnListener);
		btn2.addActionListener(btnListener);
		btn3.addActionListener(btnListener);
		btn4.addActionListener(btnListener);
		btn5.addActionListener(btnListener);
		btn6.addActionListener(btnListener);
		btn7.addActionListener(btnListener);
		btn8.addActionListener(btnListener);
		btn9.addActionListener(btnListener);
		
		
		f.setVisible(true);
		
	}


	public static void main(String[] args) {
		new Test_Calc();

	}

}
