package ex05_09;

public class Ex6 {

	public static void main(String[] args) {
		// 197p
		
		// Q1	this
		// 클래스 내부에서 자신의 주소를 가리키는 예약어를 ---
		
		// Q2	this()
		// 클래스에 여러 생성자가 오버로드되어 있을 경우
		// 하나의 생성자에서 다른 생성자를 호출할 때 --- 사용
		
		// Q3	클래스 변수
		// 클래스 내부에 선언하는 static 변수는 생성되는 인스턴스마다 만들어지는 것이 아닌
		// 여러 인스턴스가 공유하는 변수. 따라서 클래스에 기반한 유일한 변수라는 의미로 ---라고 함
		
		// Q4	스택		데이터 영역
		// 지역변수는 함수나 메서드 내부에서만 사용할 수 있고 --- 메모리에 생성
		// 멤버변수중 static 예약어를 사용하는 static --- 메모리에 생성
		
		// Q5
		// 아침 출근길에 김씨는 4000원 내고 별에서 아메리카노 구임
		// 이씨는 콩에서 4500원 내고 라떼 구입
		// 이 과정을 객체지향으로 프로그래밍
		
		// Cafe - Star, Bean
		// Menu - americano(4000), latte(4500)
		// 
		
//		Person p1 = new Person("김", 4000);
//		Person p2 = new Person("이", 4500);
//		
//		p1.StarCafe();
//		p2.BeanCafe();
		
		CoffeeShop 스벅 = new CoffeeShop("별다방");
		CoffeeShop 커피빈 = new CoffeeShop("콩다방");
		
		Customer 김씨 = new Customer("김씨", 100000);
		Customer 이씨 = new Customer("이씨", 5000);
		
		
		
	}

}

class Customer {
	
	String name;
	int money;
//	Coffee coffee;
	
	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 커피를 구매하는 기능
	// => 어느 가게, 메뉴, 돈
	public void buyCoffee(CoffeeShop coffeeshop, String kind, int price){
		this.money -= price;
	}
}


class CoffeeShop {
	
	String name;
	int money;
	
	
	public CoffeeShop(String name) {
		this.name = name;
	}



	// 커피를 판매하는 기능 (sellCoffee)
	// => 전달받을 데이터 : 종류, 돈, 
	// => 리턴 데이터 : 커피
	public Coffee sellCoffee(String kind, int money) {
		this.money += money;
		return new Coffee(kind, money);
	}
}


class Coffee {
	String kind;
	int price;
	
	public Coffee(String kind, int price) {
		this.kind = kind;
		this.price = price;
	}
	
	
}


//class Person {
//	String name;
//	int money;
//	
//	
//	public Person(String name, int money) {
//		this.name = name;
//		this.money = money;
//	}
//	
//	public void StarCafe() {
//		String c = "";
//		if(money==4000) {
//			c = "아메리카노";
//		} else if(money==4500) {
//			c = "라떼";
//		}
//		System.out.println(name + "씨는 별다방에서 " + money + "원으로 " + c + "를 구입했습니다.");
//		
//	}
//	
//	public void BeanCafe() {
//		String c = "";
//		if(money==4000) {
//			c = "아메리카노";
//		} else if(money==4500) {
//			c = "라떼";
//		}
//		System.out.println(name + "씨는 콩다방에서 " + money + "원으로 " + c + "를 구입했습니다.");
//	}
//
//}


