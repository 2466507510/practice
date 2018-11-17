package lambda;

public class Hero implements Comparable<Hero>{
	
	public String name;
	public float hp;
	public int damage;
	public Hero(String name, float hp, int damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}


	public Hero(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Hero o) {
		// TODO Auto-generated method stub
		if(damage<o.damage) {
			return 1;
		}else {
			return -1;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
	}
	
	
	
	
	
}
