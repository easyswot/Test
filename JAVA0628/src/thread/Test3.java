package thread;

public class Test3 {

	public static void main(String[] args) {
		GugudanThread gt1 = new GugudanThread(2);
		GugudanThread gt2 = new GugudanThread(5);
		GugudanThread gt3 = new GugudanThread(9);
		
		
//		gt1.start();
//		gt2.start();
//		gt3.start();
		
//		Thread t1 = new Thread(gt1);
//		Thread t2 = new Thread(gt2);
//		Thread t3 = new Thread(gt3);
		
//		GugudanRunnable gr1 = new GugudanRunnable(6);		
//		Runnable gr1 = new GugudanRunnable(6);
		
//		Thread gr1 = new Thread(new GugudanRunnable(6));
//		gr1.start();
		
		new Thread(new GugudanRunnable(6)).start();
		new Thread(new GugudanRunnable(3)).start();
		new Thread(new GugudanRunnable(8)).start();
		
	}

}


class GugudanThread extends Thread {

	int dan;

	public GugudanThread(int dan) {
		this.dan = dan;
	}
	
	
	@Override
	public void run() {
		
		for(int count = 1; count <= 100 ; count++) {
			for(int i = 1 ; i <= 9 ; i++) {
				System.out.printf("%d단 : %d * %d = %d\n", dan, dan, i, (dan*i));
			}
		}
	}
	
}

class GugudanRunnable implements Runnable {
	int dan;

	public GugudanRunnable(int dan) {
		this.dan = dan;
	}

	@Override
	public void run() {
		
		for(int count = 1; count <= 100 ; count++) {
			for(int i = 1 ; i <= 9 ; i++) {
				System.out.printf("%d단 : %d * %d = %d\n", dan, dan, i, (dan*i));
			}
		}
		
	}
	
	
	
	
	
}