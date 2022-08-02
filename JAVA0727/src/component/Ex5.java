package component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex5 {
	
	public Ex5() {
		showFrame();
	}
	
	private void showFrame() {
		JFrame f = new JFrame("ComboBox");
		f.setBounds(800, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		f.add(p, BorderLayout.CENTER);
		
		/*
		 * 콤보박스(JComboBox) = UIPlatform (Xplatform, Miplatform, Nexacro)
		 * = selectBox (HTML, JavaScript), DropdownList = DBL (C#)
		 * - 여러 항목을 목록 형태로 나열하는 컴포넌트
		 * - 목록은 Vector 객체를 사용하여 저장하고, JComboBox 객체 생성자에 전달하여 표시
		 * 
		 * */
		
		// 콤보박스에 표시할 데이터를 Vector 객체에 전달
		// => 이름을 문자열로 저장하므로 제네릭 타입을 String 타입으로 지정
		Vector<String> listData = new Vector<String>();
		listData.add("항목을 선택하세요.");
		listData.add("항목1");
		listData.add("항목2");
		listData.add("항목3");
		
		// JComboBox 객체 생성 시 생성자 파라미터로 목록이 저장된 Vector 객체 전달
		JComboBox comboBox = new JComboBox(listData);
		
		// JComboBox를 먼저 생성하고 차후에 데이터를 추가하는 경우 (가능)
		listData.add("항목4");
		listData.add("항목5");
		listData.add("항목6");
		
//		p.add(comboBox);
		f.add(comboBox);
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(comboBox.getSelectedIndex());
//				System.out.println(comboBox.getSelectedItem());
				
				// 콤보박스에 선택된 항목 출력
				// => 단, 첫 번째 항목(제목)을 제외한 나머지를 선택했을 때만 항목 출력
				if(comboBox.getSelectedIndex() != 0) {
					System.out.println(comboBox.getSelectedItem());
				}
				
			}
		});
		
		// --------------------------------------------------------------------
		
		/*
		 * 스피너(JSpinner)
		 * - 데이터를 목록 형태로 사용하는 것은 콤보박스와 동일하나
		 * 	 목록을 모두 표시하지 않고 화살표를 눌러서 목록을 하나씩 회전시키는 컴포넌트
		 * - 별다른 데이터 추가 및 설정이 없을 경우 기본적으로 정수 데이터가 사용됨
		 * 
		 * */
		
		JSpinner spinner = new JSpinner();
		
		ArrayList<String> items = new ArrayList<String>();
		items.add("자바"); items.add("JSP"); items.add("안드로이드");
		
		SpinnerListModel slm = new SpinnerListModel(items);
		spinner.setModel(slm);
		
		spinner.addChangeListener((e) -> {
			System.out.println(spinner.getValue());
		});
		
		
		
		f.add(spinner);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ex5();

	}

}
