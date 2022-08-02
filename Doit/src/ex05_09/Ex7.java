package ex05_09;

import java.util.ArrayList;

public class Ex7 {

	public static void main(String[] args) {
		// Q1	같은
		// 배열은 --- 자료형을 순서대로 관리할 때 사용하는 자료 구조
		
		// Q3
		// 배열의 길이가 5인 정수형 배열을 선언하고,
		// 1~10중 짝수만을 배열에 저장한 후 그 합을 출력
		
//		int[] arr = new int[5];
//		int a = 2;
//		int sum = 0;
//		for(int i = 0 ; i < arr.length ; i++) {
//			arr[i] = a;
//			sum += a;
//			a += 2;
//		}
//		
//		System.out.println(sum);
//		
//		
//		System.out.println("--------------------");
//		
//		
//		int[] arr2 = {2, 4, 6, 8, 10};
//		int total = 0;
//		for(int i = 0 ; i < arr2.length ; i++) {
//			total += arr2[i];
//		}
//		System.out.println("1~10 중 짝수의 합 : " + total);
//		
//		System.out.println("--------------------");
//		
//		
//		int[] arr3 = new int[5];
//		
//		int index = 0;
//		for(int i = 1 ; i <= 10 ; i++) {
//			if(i % 2 == 0) {
//				arr3[index] = i;
//				index++;
//			}
//		}
//		
//		sum = 0;
//		for(int i = 0 ; i < arr3.length ; i++) {
//			sum += arr3[i];
//		}
//		System.out.println(sum);
		
		
		
		
// ArrayList version		
		
		ArrayList arr4 = new ArrayList();
		
		// 이때 i는 1~10까지 증가할 용도
		for(int i = 1 ; i <= 10 ; i++) {
			if(i%2==0) {
				arr4.add(i);
			}
		}
		
		// 이때 i는 배열의 인덱스 용도로 사용
		int sum = 0;
		for(int i = 0 ; i < arr4.size() ; i++) {
			sum += (Integer)arr4.get(i);
		}
		
		System.out.println(sum);
		
		// Wrapper 클래스
		int a = 10;
		Integer b = 10;
		Integer c = 20;
		System.out.println(b.compareTo(c));
		System.out.println(c.compareTo(b));
		
		// 제네릭
		ArrayList<Integer> arr5 = new ArrayList();
		arr5.add(1);
//		arr5.add(3.14);		//err
//		arr5.add("문자");	//err
//		arr5.add('c');		//err
		
		
		
		
		
		ArrayList<Integer> arr6 = new ArrayList();
		
		for(int i = 1 ; i <= 10 ; i++) {
			if(i%2==0) {
				arr6.add(i);
			}
		}
		
		sum = 0;
		for(int i = 0 ; i < arr6.size() ; i++) {
			sum += arr6.get(i);
		}
		
		System.out.println("------------------------------");
		
// Q4
// Dog 클래스
// 배열 길이가 5인 Dog[] 배열을 만든 후 Dog 인스턴스를 5개 생성하여
// 배열 추가. for문과 향상된 for문에서 Dog클래스의
// showDogInfo() 메서드를 사용하여 배열에 추가한 Dog 정보를 모두 출력
		
//		Dog[] dogArr = new Dog[5];
//		dogArr[0] = new Dog("뽀삐", "시츄");
//		dogArr[1] = new Dog("코코", "푸들");
//		dogArr[2] = new Dog("비숑", "비숑프리제");
//		dogArr[3] = new Dog("시바", "시바견");
//		dogArr[4] = new Dog("요크", "요크셔테리어");
		
		Dog dog1 = new Dog("뽀삐", "시츄");
		Dog dog2 = new Dog("코코", "푸들");
		Dog dog3 = new Dog("비숑", "비숑프리제");
		Dog dog4 = new Dog("시바", "시바견");
		Dog dog5 = new Dog("요크", "요크셔테리어");
		
//		Dog[] dogs = new Dog[] {dog1, dog2, dog3, dog4, dog5};
		Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};
		

		// for문
		for(int i = 0 ; i < dogs.length ; i++) {
			dogs[i].showDogInfo();
		}
		
		System.out.println("---------------");
//		for(int i = 0 ; i < dogArr.length ; i++) {
//			System.out.println(dogArr[i].showDogInfo());
//		}
//		
//		System.out.println("---------------");
		
		// 향상된 for문
		for(Dog dog : dogs) {
			dog.showDogInfo();
		}
//		for(Dog dog : dogArr) {
//			System.out.println(dog.showDogInfo());
//		}
		
		System.out.println("---------------");
		
//		ArrayList arrDogs = new ArrayList();
		ArrayList<Dog> arrDogs = new ArrayList();
		arrDogs.add(dog1);
		arrDogs.add(dog2);
		arrDogs.add(dog3);
		arrDogs.add(dog4);
		arrDogs.add(dog5);
		
		for(int i = 0 ; i < arrDogs.size(); i++) {
//			Dog dog = (Dog)arrDogs.get(i);
			
//			Dog dog = arrDogs.get(i);
//			dog.showDogInfo();
			arrDogs.get(i).showDogInfo();
		}
		
		System.out.println("---------------");
		
		// 향상된 for문
		for(Dog dog : arrDogs) {
			dog.showDogInfo();
		}
		
		
		
	}

}

class Dog {
	private String name;
	private String type;
	
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
//	public String showDogInfo() {
//		return name + ", " + type; 
//	}
	public void showDogInfo() {
		System.out.println(name + ", " + type);
	}
	
}
