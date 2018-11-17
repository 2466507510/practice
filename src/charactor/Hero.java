package charactor;

public class Hero {

	public String name;
	public float hp;
	public int damage;
	
	
	static String copyright;
	 
    static {
        System.out.println("初始化 copyright");
        copyright = "版权由Riot Games公司所有";
    }
	
	
	
	
	public void attackHero(Hero h) {
		try {
			Thread.sleep(1000);
			h.hp-=damage;
			System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
			if(h.isDead()) {
				System.out.println(h.name+"死了！");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isDead() {
		// TODO Auto-generated method stub
		if(hp>0) return false;
		else return true;
	}
}
