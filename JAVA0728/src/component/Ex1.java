package component;

import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ex1 {
	
	public Ex1() {
		showFrame();
	}
	
	private void showFrame() {
		
		JFrame f = new JFrame();
		f.setBounds(800, 400, 400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * JTable
		 * - 데이터를 테이블(표) 형식으로 표현하는 컴포넌트
		 * - 행, 열 구조로 데이터가 구성
		 * - 2차원 배열을 사용하여 데이터를 추가하거나, Vector 객체 사용하여 추가 가능
		 * 	 => 직접 추가하는 것 보단 Model 객체(DefaultTableModel)를 사용하여 추가
		 * - 기본적으로 스크롤 기능이 없으므로 데이터가 많아지면 관리가 어려움
		 * 	 => JScrollPane 객체를 활용하여 스크롤 기능 추가하여 사용
		 * 	 => JTable -> JScrollPane -> JFrame 순서로 부착
		 * 
		 * */
		
		// 1. JScrollPane 객체 생성 후 JFrame에 부착
		JScrollPane scrollPane = new JScrollPane();
		f.add(scrollPane, BorderLayout.CENTER);
		
		// 2. JTable 객체 생성 후 JScrollPane의 ViewPortView 영역에 부착
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		
		// 3. JTable 데이터 추가
		// 1) DefaultTableModel 객체에 배열 형태로 데이터 추가
		// 	  => 1차원 배열 생성하여 열 제목 저장, 2차원 배열 생성하여 데이터 추가
		// 	  => 크기가 불변이므로 데이터가 추가되는 경우 사용이 어려움
		
//		String[] columnNames = {"번호", "이름", "아이디", "패스워드"};	// 제목 th
//		String[][] data = {	// 데이터 DB
//				{"1", "홍길동", "hong", "hong123"},
//				{"2", "가나다", "kanada", "a123"},
//				{"3", "라마바", "ramaba", "b456"},
//				{"4", "사아자", "saahja", "c789"},
//				{"5", "차카타", "chakata", "d1011"},
//				{"6", "파하가", "pahaka", "e1213"},
//				{"7", "나다라", "nadara", "f1415"},
//				{"8", "마바사", "mabqsa", "g1617"},
//				{"9", "아자차", "ahjacha", "h1819"},
//				{"10", "카타파", "katapa", "i2021"},
//		};
//		
//		DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
//		table.setModel(dtm);
		
		// ------------------------------------------------------------------------
		// 2) DefaultTableModel 객체에 Vector 객체 형태로 데이터 추가
		// 2-1. 제목과 데이터가 한꺼번에 추가되는 경우
		//	    => 데이터가 미리 준비된 상태에서 Model 객체 생성과 테이블 추가 작업이 수행
		
//		Vector<String> columnNames =
//				new Vector<String>(Arrays.asList("번호", "이름", "아이디", "패스워드"));
//		Vector data = new Vector();
//		
//		Vector rowData = new Vector();
//		rowData.add(1); rowData.add("홍길동"); rowData.add("hong"); rowData.add("hong123");
//		data.add(rowData);
//		
//		rowData = new Vector();
//		rowData.add(2); rowData.add("가나다"); rowData.add("kanada"); rowData.add("a123");
//		data.add(rowData);
//
//		rowData = new Vector();
//		rowData.add(3); rowData.add("라마바"); rowData.add("ramaba"); rowData.add("b456");
//		data.add(rowData);
//		
//		
//		// 제목이 저장된 Vector 객체와 전체 데이터가 저장된 Vector 객체를 Model 객체에 추가
//		DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
//		// Model 객체를 JTable에 추가
//		table.setModel(dtm);
		
		// ----------------------------------------------------------------------------------
		// 2-2 제목만 추가 후 1개 레코드씩 데이터 Vector 객체를 별도로 추가하는 경우
		// => 데이터가 미리 만들어져 있지 않은 상태에서 옆 제목만 먼저 추가하고
		//	  데이터는 차후에 추가하는 방법
		
		Vector<String> columnNames =
				new Vector<String>(Arrays.asList("번호", "이름", "아이디", "패스워드"));
		
		// DefaultTableModel 객체를 생성하여 제목열 Vector 객체를 먼저 추가
		DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
		// 제목만 저장된 DefaultTableModel 객체를 먼저 테이블에 추가 가능
		table.setModel(dtm);
		
		// 별도로 데이터를 추가하기 위해 Vector 객체를 생성하여
		// 1개 레코드를 저장한 후 DefaultTableModel 객체의 addRow() 메서드를 통해 추가
		// => 별도의 메서드에서 데이터 추가 작업이 이루어져야 할 경우
		//	  DefaultTableModel 객체를 JTable 객체로부터 가져와서 작업을 수행
		//	  => getModel() 메서드를 통해 Model 객체 형태로 리턴받아 추가작업 수행 
		DefaultTableModel myModel = (DefaultTableModel)table.getModel();
		// => 기존의 제목열 및추가된 데이터가 있을 경우 그대로 유지함
		
		Vector rowData = new Vector();
		rowData.add(1); rowData.add("홍길동"); rowData.add("hong"); rowData.add("hong123");
		myModel.addRow(rowData);
		
		rowData = new Vector();
		rowData.add(2); rowData.add("가나다"); rowData.add("kanada"); rowData.add("a123");
		myModel.addRow(rowData);

		rowData = new Vector();
		rowData.add(3); rowData.add("라마바"); rowData.add("ramaba"); rowData.add("b456");
		myModel.addRow(rowData);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ex1();

	}

}
