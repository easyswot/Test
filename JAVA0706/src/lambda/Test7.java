package lambda;

import java.util.ArrayList;
import java.util.List;

public class Test7 {

	public static void main(String[] args) {
		Customer customer1 = new Customer("가나다", 40, 500);
		Customer customer2 = new Customer("라마바", 50, 700);
		Customer customer3 = new Customer("사아자", 60, 100);
		Customer customer4 = new Customer("차카타", 70, 5000);
		Customer customer5 = new Customer("파하가", 80, 850);
		
		List<Customer> list = new ArrayList<Customer>();
		
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		list.add(customer4);
		list.add(customer5);
		
		System.out.println("===== 고객 명단(이름만) 추가된 순서대로 출력 =====");
		list.stream().map(c -> c.getName())
					 .forEach(c -> System.out.println(c));
		
		int total = list.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용 : " + total + " 입니다.");
		
		System.out.println("===== 30세 이상 고객 중 여행비용이 큰 순으로 출력 =====");
		list.stream().filter(c -> c.getAge() >= 30)
					 .sorted((o1, o2) -> o2.getPrice() - o1.getPrice())
					 .forEach(c -> System.out.println(c));
		
		System.out.println("===== 가장 어린 사람 출력 =====");
		Customer customer = list.stream().min((o1, o2) -> o1.getAge() - o2.getAge()).get();
		System.out.println(customer);
		
		System.out.println("===== 가장 비용이 적은 사람 출력 =====");
		customer = list.stream().min((o1, o2) -> o1.getPrice() - o2.getPrice()).get();
		System.out.println(customer);
	}

}

/*
 * Customer 클래스
 * - 멤버변수(private): 이름(name, 문자열), 나이(age, 정수), 비용(price, 정수)
 * - 생성자 : 모든 멤버변수를 초기화 하는 생성자
 * - 메서드 :	1. 모든 멤버변수에 대한 getter 메서드
 * 			2. Object 클래스의 toString() 메서드 오버라이딩
 * 			   => 모든 멤버변수를 결합하려 리턴
 * */
class Customer {

	private String name;
	private int age;
	private int price;
	
	public Customer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
}








