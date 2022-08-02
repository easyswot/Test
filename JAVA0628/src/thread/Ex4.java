package thread;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 멀티스레딩 구현 코드의 변형
		 * - 실제 프로그래밍에서 더 많이 쓰는 형식
		 * - Runnable 인터페이스를 구현하는 구현체 클래스를 별도로 정의하지 않고
		 * 	 Thread 클래스의 생성자에 Runnable 인터페이스 객체 생성 코드를 바로 작성
		 * 	 => Runnable 인터페이스의 임시 객체 형채를 Thread 생성자에 전달
		 * - Runnable 객체를 담는 변수가 없으므로 Runnable 객체에는 접근 불가능
		 * 	 만약, Thread 객체의 변수도 제거하는 경우 Thread 객체도 접근 불가능
		 * 	 => 일회용 객체(= 임시 객체)라고 한다
		 * 
		 * < 기본 문법 >
		 * Thread t = new Thread(new Ruannable(){
		 * 		@Override
		 * 		public void run(){
		 * 			// 멀티 스레딩으로 구현할 코드
		 * 		}
		 * });
		 * t.start();
		 * 
		 * => 위 두 문장을 하나로 결합하여 Thread객체도 임시객체로 사용 가능
		 * new Thread(new Runnable(){ 생략 }).start();
		 * 
		 * */
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i<=1000000; i++) {
					System.out.println(i + ":A작업");
				}
				
			}
		});
//		t.start();
		
		// -----------------------------------
		// 위의 작업을 하나의 문장으로 결합
		// => Thread 클래스의 변후를 제거 후 객체 생성 코드만 기술하고,
		// 	  start() 메서드를 바로 호출
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i<=1000000; i++) {
					System.out.println(i + ":A작업");
				}
				
			}
		}).start();
		
		new Thread(new Runnable() {
					
					@Override
					public void run() {
						for(int i = 1; i<=1000000; i++) {
							System.out.println(i + ":B작업");
						}
						
					}
				}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i<=1000000; i++) {
					System.out.println(i + ":C작업");
				}
				
			}
		}).start();
		
		// 람다 맛만		():run 메서드의 매개변수, {}:run메서드의 바디
//		new Thread(() -> {})
		new Thread(() -> {
			for(int i = 1; i<=1000000; i++) {
				System.out.println(i + ": 람다 작업");
			}
		}).start();
		
		/*
		 * 참고. Thread 클래스만으로 멀티스레딩을 구현하는 방법
		 * 
		 * < 기본 문법 >
		 * new Thread() {
		 * 		@Override
		 * 		public void run(){
		 * 			// 멀티스레딩으로 처리할 코드
		 * 
		 * 		}
		 * }.start()
		 * */
		
		new Thread() {

			@Override
			public void run() {
				
				for(int i = 1; i<=1000000; i++) {
					System.out.println(i + ":A작업");
				}
			}
			
		}.start();

		
		new Thread() {

			@Override
			public void run() {
				
				for(int i = 1; i<=1000000; i++) {
					System.out.println(i + ":B작업");
				}
			}
			
		}.start();
		

		
		new Thread() {

			@Override
			public void run() {
				
				for(int i = 1; i<=1000000; i++) {
					System.out.println(i + ":C작업");
				}
			}
			
		}.start();
		

		
		new Thread() {

			@Override
			public void run() {
				
				for(int i = 1; i<=1000000; i++) {
					System.out.println(i + ":D작업");
				}
			}
			
		}.start();
		
		
		AA a = new AA() {	// 오버라이딩 하여 여기서 다르게 동작할 객체(1회성, 딱 1번만 쓰는거)

			@Override
			public void method() {
				System.out.println("오버라이딩 A");
			}
			
			public void methodB() {
				System.out.println("B");
			}
			
		};	//다운캐스팅 못함
		
		a.method();
//		a.methodB();	// 메서드B가 호출이 안되는 이유는 업캐스팅 됐기 때문.
						// 다운캐스팅 후 사용 가능한데 익명클래스는 다운캐스팅 못함 
		
		Super s = new Sub();
		s.method();
		
	}

}


class AA {
	public void method() {
		System.out.println("A");
	}
}

class Super {
	public void method() {
		System.out.println("Super");
	}
}

class Sub extends Super {

	@Override
	public void method() {
		System.out.println("Sub");
	}
	
}