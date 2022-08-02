package member;

import java.sql.Timestamp;

public class MemberDTO {
	
	//자바바일 : 데이터를 탐 전달
	// 데이터를 저장할 공간 =>  멤버변수 => private
	private String id;
	private String pass;
	private String name;
	private Timestamp date;
	
	// 데이터 접근 메서드, 값을 저장하는 메서드 set, 값을 가져오는 메서드 get
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	

}
