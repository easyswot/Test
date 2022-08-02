package thread;

public class Ex1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100; i++) {
					System.out.println("A작업");
				}
				
			}
		});
		t1.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100; i++) {
					Thread t = Thread.currentThread();
					System.out.println("B작업 현재스레드 : " + t.getName());
				}
				
			}
		}, "t2 스레드").start();
		
		System.out.println("현재 스레드명 : " + Thread.currentThread().getName());
		System.out.println("t1 스레드명 : " + t1.getName());
//		System.out.println("t2 스레드명 : " + t2.getName());
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 100; i++) {
					// 현재 수행중인 스레드 객체를 가져오는 방법
					// => Thread 클래스의 static 메서드 currentThread() 메서드 호출
					Thread t = Thread.currentThread();
					System.out.println("C작업 현재 스레드 : " + t.getName());
				}
				
			}
		});
		t3.setName("t3 스레드");	// 지정된 스레드명 변경
		t3.start();
		System.out.println("t3.getName() : " + t3.getName());
		
		System.out.println("===========================");
		
		MyThread mt = new MyThread(/*"<< 내 스레드 >>",*/ 1000);
		mt.setName("my thread");
		mt.start();
		
	}

}

//class Thread {
//	run
//	getName
//	setName
//	start
//}

//class 할아버지 {
//	String house = "이층집";
//	public void setHouse(String house) {
//		this.house = house;
//	}
//}
//
//class 아버지 extends 할아버지 {
//	String car = "외제차";
//	
//	public 아버지(String house, String car) {
//		setHouse(house);
//		this.car = car;
//	}
//}

class MyThread extends Thread {
	int count;
	
	public MyThread(/*String threadName,*/ int count) {
//		setName(threadName);
		this.count = count;
	}

	@Override
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println(i + " : " + getName());
		}
	}
	
	
}