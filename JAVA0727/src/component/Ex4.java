package component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex4 {
	
	public Ex4() {
		showFrame();
	}
	
	private void showFrame() {
		
		JFrame f = new JFrame();
		
		f.setBounds(800, 400, 400, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * JCheckBox
		 * 
		 * */
		
		
		// 패널을 하나 생성한 후 프레임에 부착
		JPanel p = new JPanel();
		f.add(p, BorderLayout.CENTER);
		
		// 체크박스 4개 ("Java", "JSP", "Android", "전체선택") 생성 후 패널에 부착
		JCheckBox cb1 = new JCheckBox("Java");
		JCheckBox cb2 = new JCheckBox("JSP");
		JCheckBox cb3 = new JCheckBox("Android");
		JCheckBox cb4 = new JCheckBox("전체선택");
		
		p.add(cb1);	p.add(cb2);	p.add(cb3);	p.add(cb4);
		
		/*
		 * 전체 선택 체크박스에 대한 이벤트 처리 => AcitonListener
		 * => 전체 선택 체크 시 cb1, cb2, cb3를 모두 체크하고 (cb4에 텍스트 "전체선택 해제")
		 * 	  전체 선택 체크 해제 시 cb1, cb2, cb3을 모두 체크해제 (cb4에 텍스트 "전체선택")
		 * */
//		cb4.addActionListener(e -> {
//			cb1.doClick();
//			cb2.doClick();
//			cb3.doClick();
//		});
		
		cb4.addActionListener(e -> {
			
//			if(cb4.isSelected()) {
//				cb1.setSelected(true);
//				cb2.setSelected(true);
//				cb3.setSelected(true);
//				cb4.setText("전체선택 해제");
//			} else {
//				cb1.setSelected(false);
//				cb2.setSelected(false);
//				cb3.setSelected(false);
//				cb4.setText("전체선택");
//			}
			
			cb1.setSelected(cb4.isSelected());
			cb2.setSelected(!cb4.isSelected());
			cb3.setSelected(cb4.isSelected());
			cb4.setText(cb4.isSelected() ? "전체선택 해제" : "전체선택");
			
		});
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex4();

	}

}
