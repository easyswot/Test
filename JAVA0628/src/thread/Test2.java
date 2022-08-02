package thread;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 메시지 전송과 파일 전송을 동시에 수행할 경우
		 * 1. 싱글스레드로 구현한 경우
		 * 
		 * */
		SendMessage sm = new SendMessage("안녕하세요", 100);
		FileTransfer ft = new FileTransfer("a.java", 1000000);
		
//		ft.run();
//		sm.run();
		
		// 2. 멀티스레드로 구현한 경우
		
		SendMessageThread smt = new SendMessageThread("안녕하세요", 10000);
		FileTransferThread ftt = new FileTransferThread("b.java", 10000);
		ReceiveMessageThread rmt = new ReceiveMessageThread("안녕하세요", 10000);
		
		// 반드시 start() 메서드 호출 필수
		smt.start();
		ftt.start();
		rmt.start();
		
		
		
		
		
		
		
		
		
		
	}

}
// 메세지 전송 클래스를 Thread 클래스를 상속받아 정의 SendMessageThread
class SendMessageThread extends Thread {

	String str;
	int count;
	
	public SendMessageThread(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<= count; i++) {
			System.out.println(i + " : " + str + " 메세지전송");
		}
	}
	
}

// 파일 전송 클래스를 Thread 클래스를 상속받아 정의 FileTransferThread
class FileTransferThread extends Thread {

	String str;
	int count;
	
	public FileTransferThread(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	
	@Override
	public void run() {
		for(int i = 1; i<= count; i++) {
			System.out.println(i + " : " + str + " 파일전송");
		}
	}
}

// 메세지 수신 클래스를 thread 클래스를 상속받아 정의 ReceiveMessageThread

class ReceiveMessageThread extends Thread {

	String str;
	int count;
	
	public ReceiveMessageThread(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<= count; i++) {
			System.out.println(i + " : " + str + " 메시지수신");
		}
	}
	
}














class SendMessage {
	String str;
	int count;
	
	public SendMessage(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	public void run() {
		for(int i = 1; i<= count; i++) {
			System.out.println(i + " : " + str + " 메세지전송");
		}
	}
}

class FileTransfer {
	String str;
	int count;
	
	public FileTransfer(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	public void run() {
		for(int i = 1; i<= count; i++) {
			System.out.println(i + " : " + str + " 파일전송");
		}
	}
}



