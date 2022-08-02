
class Hero {
	String name;
	int hp;
	int damage;
	
	public void showHeroInfo() {
		System.out.println("이름 : " + name);
		System.out.println("현재체력 : " + hp);
		System.out.println("공격력 : " + damage);
	}
	
	public void attack(Hero hero) {
		hero.hp -= damage;
	}
	
}


public class Ex3 {

	public static void main(String[] args) {
		
		Hero 가렌 = new Hero();
		가렌.name = "가렌";
		가렌.hp = 500;
		가렌.damage = 50;
		
		 Hero 뽀삐 = new Hero();
		뽀삐.name = "뽀삐";
		뽀삐.hp = 450;
		뽀삐.damage = 40;
		
		가렌.showHeroInfo();
		
		System.out.println("--------------------");
		
		뽀삐.showHeroInfo();
		
		System.out.println("--------------------");
		
		가렌.attack(뽀삐);
		
		System.out.println("한 대 맞은 뽀삐의 hp : " + 뽀삐.hp);
		
		
		뽀삐.attack(가렌);
		
		System.out.println("한 대 맞은 가렌의 hp : " + 가렌.hp);
		

	}

}
