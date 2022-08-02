package generic;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("이순신", 30);
		
		System.out.println(p1.toString());
		System.out.println(p1);
		
		Object[] objArr = {p1, p2};		// Person -> Object 업캐스팅되어 관리됨
		
		for(int i=0; i<objArr.length ; i++) {
//			Object o = objArr[i];
//			System.out.println(o.getName());	// 컴파일에러 발생
			
			
			Person p = (Person)objArr[i];	// Object -> Person 다운캐스팅 필수
			System.out.println(p.getName() + ", " + p.getAge());
		}
		
		// 2. Collection (ArrayList)을 활용하여 Person 객체 여러개를 관리할 경우 (제네릭 활용)
		// => 저장할 객체 타입이 Person 타입이므로 제네릭 타입 <Person> 지정
		//		- 객체 저장 시 Person 타입 객체만 저장 가능하도록 자동으로 판별 수향
		//		  즉, 잘못된 객체(데이터)가 저장될 우려가 없다
		//		- Object 타입으로 업캐스팅 되지 않고 Person 타입 자체로 저장되기 때문에
		//		  객체(데이터)를 꺼내는 시점에도 Person 타입 그대로 꺼낼 수 있다
		//		  => 별도의 다운캐스팅 등 형변환이 불필요
		//		- 또한, 추가적인 타입 판별도 불필요 (instanceof)
		List<Person> list= new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(new Person("강감찬", 35));
//		list.add("전지현");
		
		for(Person p : list) {
//			System.out.println(p.getName() + ", " + p.getAge());
			System.out.println(p);
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		MemberBean mb1 = new MemberBean("abc", "1234", "김가나", "kim@gmail.com", "부산광역시", "051-111-1111", "010-1111-1111");
		MemberBean mb2 = new MemberBean("def", "5678", "이다라", "lee@gmail.com", "서울특별시", "02-222-2222", "010-2222-2222");
		MemberBean mb3 = new MemberBean("ghi", "9101", "박마바", "park@gmail.com", "대구광역시", "053-333-3333", "010-3333-3333");
		
		List<MemberBean> list2 = new ArrayList<MemberBean>();
		list2.add(mb1);
		list2.add(mb2);
		list2.add(mb3);
		
		
		for(int i = 0 ; i < list2.size() ; i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println();
		
		for(MemberBean mb : list2) {
			System.out.println(mb);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

class MemberBean {

	private String id;
	private String pass;
	private String name;
	private String email;
	private String address;
	private String phone;
	private String mobile;
	
	public MemberBean(String id, String pass, String name, String email, String address, String phone, String mobile) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "MemberBean [id=" + id + ", pass=" + pass + ", name=" + name + ", email=" + email + ", address="
				+ address + ", phone=" + phone + ", mobile=" + mobile + "]";
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
	
}