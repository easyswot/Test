import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

public class CustomerGUI {
	JFrame f;
	// North 영역 (조회조건, 버튼)
	private JTextField sName, sAge, sJumin;
	private JButton btnSelect;
	// Center 영역
	private JTable table;
	// West 영역
	private JTextField tfIdx, tfName, tfAge, tfEmail, tfJumin;
	// South 영역
	private JButton btnInsert, btnDelete;
	
	public CustomerGUI() {
		showFrame();
	}

	private void showFrame() {
		f = new JFrame("고객 관리 프로그램");
		f.setBounds(500, 300, 900, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ------------ North 영역 (조회조건) -----------------
		JPanel pNorth = new JPanel();
		f.add(pNorth, BorderLayout.NORTH);
		pNorth.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		pNorth.setLayout(new GridLayout(0, 4, 0, 0));
		
		// 조회조건 sName 입력 패널
		JPanel panelName = new JPanel();
		pNorth.add(panelName);
		
		panelName.add(new JLabel("이름"));
		sName = new JTextField(10);
		panelName.add(sName);
		sName.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) select();
			}
		});
		
		// 조회조건 sAge 입력 패널
		JPanel panelAge = new JPanel();
		pNorth.add(panelAge);

		panelAge.add(new JLabel("나이"));
		sAge = new JTextField(10);
		panelAge.add(sAge);
		sAge.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) select();
			}
		});
		
		// 조회조건 sJumin 입력 패널
		JPanel panelJumin = new JPanel();
		pNorth.add(panelJumin);

		panelJumin.add(new JLabel("주민번호"));
		sJumin = new JTextField(10);
		panelJumin.add(sJumin);
		sJumin.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) select();
			}
		});
		
		btnSelect = new JButton("조회");
		pNorth.add(btnSelect);
		
		
		// ------------ West 영역 (회원 정보 입력 영역) -----------------
		JPanel pWest = new JPanel(new GridLayout(5, 0, 0, 0));
		f.add(pWest, BorderLayout.WEST);
		
		// 번호(IDX) 패널
		JPanel pIdx = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pIdx);
		pIdx.add(new JLabel("번 호"));
		tfIdx = new JTextField(10);
		tfIdx.setEditable(false);	// 번호 입력 불가능하도록 잠금
		pIdx.add(tfIdx);
		
		// 이름(NAME) 패널
		JPanel pName = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pName);
		pName.add(new JLabel("이 름"));
		
		tfName = new JTextField(10);
		pName.add(tfName);
		
		// 나이(AGE) 패널
		JPanel pAge = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pAge);
		pAge.add(new JLabel("나 이"));
		
		tfAge = new JTextField(10);
		pAge.add(tfAge);
		
		// 이메일(EMAIL) 패널
		JPanel pEmail = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pEmail);
		pEmail.add(new JLabel("E-Mail"));
		
		tfEmail = new JTextField(10);
		pEmail.add(tfEmail);
		
		// 주민번호(JUMIN) 패널
		JPanel pJumin = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pWest.add(pJumin);
		pJumin.add(new JLabel("주민번호"));
		
		tfJumin = new JTextField(10);
		pJumin.add(tfJumin);
		
		
		// ------------ Center 영역 (회원 정보 표시 영역) -----------------
		// 스크롤바 기능 추가를 위해 JScrollPane 객체 생성 후
		// 프레임에 추가한 뒤, JTable 객체는 JScrollPane에 추가
		JScrollPane scrollPane = new JScrollPane();
		f.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		// 컬럼 제목을 표시하기 위해 DefaultTableModel 객체 생성
		// 배열을 사용하여 제목을 생성한 뒤 Model 객체에 추가
		String[] columnNames = {"번 호", "이 름", "나 이", "E-Mail", "주민번호"};
		DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
		table.setModel(dtm);
		
		
		// ------------ South 영역 (버튼 영역) -----------------
		JPanel pSouth = new JPanel();
		f.add(pSouth, BorderLayout.SOUTH);
		
		btnInsert = new JButton("회원추가");
		btnDelete = new JButton("회원삭제");
		
		pSouth.add(btnInsert);
		pSouth.add(btnDelete);
		
		// 조회 버튼 클릭 시 select() 메서드 호출
		btnSelect.addActionListener(e -> select());
		// 회원 추가 버튼 클릭 시 insert() 메서드 호출
		btnInsert.addActionListener(e -> insert());
		// 회원 삭제 버튼 클릭 시 delete() 메서드 호출
		btnDelete.addActionListener(e -> delete());
		
		
		f.setVisible(true);
		
		
	}
	
	public void select() {
		
		CustomerDAO dao = new CustomerDAO();
		
		Map<String, String> param = new HashMap<String, String>();
		param.put("NAME", sName.getText());
		param.put("AGE", sAge.getText());
		param.put("JUMIN", sJumin.getText());
		
		Vector<Vector> data = dao.select(param);
		
		DefaultTableModel dtm = (DefaultTableModel)table.getModel();
		
		// 현재 표시된 회원목록 초기화
		dtm.setRowCount(0);
		
		for(Vector rowData : data) {
			dtm.addRow(rowData);
		}
	}
	
	public boolean validCheck() {
		
		// 필수 입력 확인
//		tfName.getText().equals("")
		if(tfName.getText().length() == 0) {
			// alert
			JOptionPane.showMessageDialog(
					f, "이름 입력 필수", "입력 오류", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		if(tfAge.getText().length() == 0) {
			JOptionPane.showMessageDialog(
					f, "나이 입력 필수", "입력 오류", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		if(tfEmail.getText().length() == 0) {
			JOptionPane.showMessageDialog(
					f, "E-Mail 입력 필수", "입력 오류", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		if(tfJumin.getText().length() == 0) {
			JOptionPane.showMessageDialog(
					f, "주민번호 입력 필수", "입력 오류", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		// 만약, 입력 항목에 대한 양식 체크 시 => 정규표현식 활용
		// ex) 나이 입력에 대한 숫자 양식 체크
		String pattern = "^[0-9]{1,3}$";	// 숫자 1~3자리 체크하는 패턴
		if(!Pattern.matches(pattern, tfAge.getText())) {
			JOptionPane.showMessageDialog(
					f, "나이는 숫자 3자리 이하 입력 필수", "입력 오류", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		return true;
	}
	
	// 회원 추가
	public void insert() {
		
		// 유효성 체크
		// => 유효성 체크 후 insert할 수 없는 상황일때 insert() 메서드 종료
		if(!validCheck()) return;
		
		String name = tfName.getText();
		String age = tfAge.getText();
		String email = tfEmail.getText();
		String jumin = tfJumin.getText();
		
		CustomerDTO dto = new CustomerDTO("", name, age, email, jumin);
		CustomerDAO dao = new CustomerDAO(); 
		
		boolean isSuccess = dao.insert(dto);
		
		// TODO
		if(isSuccess) {	// 작업 성공시
			JOptionPane.showMessageDialog(
					f, "회원 추가 성공", "성공", JOptionPane.INFORMATION_MESSAGE);
			select();
			
		} else { // 작업 실패시
			JOptionPane.showMessageDialog(
					f, "회원 추가 실패", "실패", JOptionPane.ERROR_MESSAGE);
			
		}
	}
	
	// 삭제
	public void delete() {
		// InputDialog를 사용하여 삭제할 회원번호(idx)를 입력받아
		// CustomerDAO의 delete() 메서드에 전달하여 회원삭제 작업 요청
		// => 삭제 결과를 boolean 타입으로 리턴받아
		//	  삭제 성공/실패를 MessageDialog로 출력
		// => 삭제 성공일 경우 회원목록 갱신(select())
		String idx = JOptionPane.showInputDialog(f, "삭제할 회원 번호를 입력하세요");
		
		System.out.println(idx);
		
		// 취소, X => 메서드 종료
		if(idx == null)	return;
		
		// 입력 번호가 없을 경우(널스트링 또는 길이 0) 오류 메시지 출력
		if(idx.length() == 0 /*idx.equals("")*/) {
			JOptionPane.showMessageDialog(
					f, "번호 입력 필수", "입력 오류", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		// IDX값이 1부터 증가되므로 0 데이터도 오류 메시지 출력
		if(idx.equals("0")) {
			JOptionPane.showMessageDialog(
					f, "번호는 1이상 입력", "입력 오류", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		CustomerDAO dao = new CustomerDAO();
		boolean isDeleteSuccess = dao.delete(idx);
		
		if(isDeleteSuccess) {
			JOptionPane.showMessageDialog(
					f, "회원 삭제 성공", "성공", JOptionPane.INFORMATION_MESSAGE);
			// 회원 목록 갱신 => select() 메서드 호출
			select();
		} else {
			JOptionPane.showMessageDialog(
					f, "회원 삭제 실패", "실패", JOptionPane.ERROR_MESSAGE);
		}
		
	}

	public static void main(String[] args) {
		new CustomerGUI();
	}

}












