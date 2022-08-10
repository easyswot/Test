
public class CustomerDTO {

	private String idx;
	private String nm;
	private String age;
	private String email;
	private String jumin;
	
	public CustomerDTO(String idx, String nm, String age, String email, String jumin) {
		this.idx = idx;
		this.nm = nm;
		this.age = age;
		this.email = email;
		this.jumin = jumin;
	}
	
	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
	// 데이터 확인용 toString 오버라이딩
	@Override
	public String toString() {
		return "CustomerDTO [idx=" + idx + ", nm=" + nm + ", age=" + age + ", email=" + email + ", jumin=" + jumin
				+ "]";
	}
	
}
