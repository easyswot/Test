import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		
		Book b1 = new Book("그림자와 뼈", 17820);
		Book b2 = new Book("포위와 폭풍", 17820);
		Book b3 = new Book("폐허와 부활", 17820);
		Book b4 = new Book("alfjk", 6000);
		
		Book[] books = {b1, b2, b3, b4, new Book("kh", 10000)};
		
		for(int i = 0 ; i < books.length ; i++) {
			books[i].showInfo();
		}
		
		System.out.println("------------------------------");
		
		
		ArrayList<Book> bks = new ArrayList();
		bks.add(b1);
		bks.add(b2);
		bks.add(b3);
		bks.add(b4);
		bks.add(new Book("비싼 책", 10000000));
		
		for(int i = 0 ; i < bks.size() ; i++) {
			bks.get(i).showInfo();
		}
		
		System.out.println("------------------------------");
		
		for(Book book : bks) {
			book.showInfo();
		}
		
		System.out.println("------------------------------");
		
		Book.showAllInfo(books);
		
		System.out.println("------------------------------");
		
//		Book[] books2 = new Book[bks.size()];
		
//		int index = 0;
//		for(Book book : bks) {
//			books2[index] = book;
//			index++;
//		}
		
		Book.showAllInfo(bks);
		
		System.out.println("------------------------------");
		
		Book minBook = Book.getMinBook(books);
		minBook.showInfo();
		
		minBook = Book.getMinBook(bks);
		minBook.showInfo();
	}

}


// < Book 클래스 선언 >
// - 멤버변수 : 제목(subject, 문자열), 가격(price, 정수)
//			 (단, 외부에서 직접 접근할 수 없도록 접근제한자 지정)
// - 생성자 : 모든 멤버변수를 초기화하는 생성자
// - 메서드 :	1. 모든 멤버변수에 대한 get/set 메서드 생성
//		    2. 도서에 대한 정보를 출력하는 showInfo() 메서드 생성
//			   (출력 형식 : "제목 : 가격")
//			3. 도서 배열(Book[] 또는 ArrayList)을 전달받아
//			   모든 도서 정보를 출력하는 showAllInfo() 메서드 생성
//			4. 도서 배열(Book[] 또는 ArrayList)을 전달받아
//			   가장 가격이 저렴한 책을 리턴하는 getMinBook() 메서드 생성
// -----------------------------------------------------------------
// 1. main 메서드에서 책을 여러권 생성하고 생성한 도서 정보를 출력
// 2. 배열 또는 ArrayList에 생성한 책을 추가하여 모든 도서 정보를 출력

class Book {
	
	private String subject;
	private int price;
	
	public Book(String subject, int price) {
		this.subject = subject;
		this.price = price;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println(subject + " : " + price);
	}
	
	
//		도서 배열(Book[] 또는 ArrayList)을 전달받아
//		모든 도서 정보를 출력하는 showAllInfo() 메서드 생성
	public static void showAllInfo(Book[] books) {
		for(Book book : books) {
			book.showInfo();
		}
	}

	public static void showAllInfo(ArrayList<Book> books) {
		for(Book book : books) {
			book.showInfo();
		}
	}
	
	
//     도서 배열(Book[] 또는 ArrayList)을 전달받아
//	   가장 가격이 저렴한 책을 리턴하는 getMinBook() 메서드 생성
	public static Book getMinBook(Book[] books) {
		Book result = books[0];
		
		for(int i = 1 ; i < books.length ; i++) {
			if(result.getPrice() > books[i].getPrice()) {
				result = books[i];
			}
		}
		
		return result;
	}

	public static Book getMinBook(ArrayList<Book> books) {
		Book result = books.get(0);
		
		for(int i = 1 ; i < books.size() ; i++) {
			if(result.getPrice() > books.get(i).getPrice()) {
				result = books.get(i);
			}
		}
		
		return result;
	}	
}
















