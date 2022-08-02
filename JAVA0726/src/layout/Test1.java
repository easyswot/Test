package layout;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 {
	public Test1() {
		showFrame();
	}
	
	

	private void showFrame() {
		/*
		 * JFrame의 기본 레이아웃 BorderLayout의 5개의 영역에
		 * 버튼 5개 (CENTER, EAST, WEST, SOUTH, NORTH) 부착하고
		 * 각 버튼을 클릭하면 "XXX 클릭됨" 출력하도록 (4단계 또는 5단계) 이벤트 처리
		 * 
		 * */
		
		JFrame f = new JFrame("");
		
		f.setBounds(800, 400, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnCenter = new JButton("CENTER");
		JButton btnEast = new JButton("EAST");
		JButton btnWest = new JButton("WEST");
		JButton btnSouth = new JButton("SOUTH");
		JButton btnNorth = new JButton("NORTH");
		
		f.add(btnCenter, BorderLayout.CENTER);
		f.add(btnEast, BorderLayout.EAST);
		f.add(btnWest, BorderLayout.WEST);
		f.add(btnSouth, BorderLayout.SOUTH);
		f.add(btnNorth, BorderLayout.NORTH);
		
		// 이벤트 연결 5단계 방식
//		btnCenter.addActionListener((e) -> System.out.println("CENTER 버튼 클릭됨"));
//		btnEast.addActionListener((e) -> System.out.println("EAST 버튼 클릭됨"));
//		btnWest.addActionListener((e) -> System.out.println("WEST 버튼 클릭됨"));
//		btnSouth.addActionListener((e) -> System.out.println("SOUTH 버튼 클릭됨"));
//		btnNorth.addActionListener((e) -> System.out.println("NORTH 버튼 클릭됨"));
		
		// 이벤트 연결 4단계 방식
		ActionListener listener = e ->
			System.out.println(e.getActionCommand() + "버튼 클릭됨");
			
		btnCenter.addActionListener(listener);
		btnEast.addActionListener(listener);
		btnSouth.addActionListener(listener);
		btnWest.addActionListener(listener);
		btnNorth.addActionListener(listener);
		
		
		
		f.setVisible(true);
		
	}



	public static void main(String[] args) {
		new Test1();
		
		
		
		

	}

}
