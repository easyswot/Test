package polymorphism;

class Weapon {
	int damage;
	int range;
	public void attack() {
		
	}
}

class Sword extends Weapon {
	
	public Sword(int damage, int range) {
		this.damage = damage;
		this.range = range;
	}
	
	@Override
	public void attack() {
		System.out.println("무기타입 : 검, 데미지 : " + damage + ", 사정거리 : " + range);
	}
	
}

class Gun extends Weapon {

	public Gun(int damage, int range) {
		this.damage = damage;
		this.range = range;
	}
	
	@Override
	public void attack() {
		System.out.println("무기타입 : 총, 데미지 : " + damage + ", 사정거리 : " + range);
	}
	
}

class Bow extends Weapon {
	
	public Bow(int damage, int range) {
		this.damage = damage;
		this.range = range;
	}

	@Override
	public void attack() {
		System.out.println("무기타입 : 활, 데미지 : " + damage + ", 사정거리 : " + range);
	}
	
}

class Hero{
	private Weapon w;
	
	public void setW(Weapon w) {
		this.w = w;
	}
	
	public void attack() {
		if(w == null) {
			System.out.println("맨손");
		} else {
			w.attack();
		}
	}
	
	
}
public class Ex2 {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.attack();
		
		h.setW(new Bow(100, 5));
		h.attack();
		
		h.setW(new Gun(200, 100));
		h.attack();
		
		h.setW(new Sword(100000, 2));
		h.attack();
		
	}

}






















