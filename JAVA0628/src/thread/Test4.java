package thread;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * main() 메서드 (main 스레드) 내에서
		 * "메세지 송신", "메세지 수신", "파일 전송" 작업을 동시에 100번씩 수행
		 * 
		 * */
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 100; i++) {
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(i + " : 메세지 송신");
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int i = 1; i <= 100; i++) {
					System.out.println(i + " : 메세지 수신");
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int i = 1; i <= 100; i++) {
					System.out.println(i + " : 파일 전송");
				}
			}
		}).start();
		
	}

}