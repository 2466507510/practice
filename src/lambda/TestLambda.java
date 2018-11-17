package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		List<Hero> heros=new ArrayList<Hero>();
		
		for(int i=0;i<10;i++) {
			Hero hero=new Hero("hero"+i, r.nextInt(1000), r.nextInt(100));
			heros.add(hero);
		}
		
		System.out.println("初始化后的集合：");
		System.out.println(heros);
		System.out.println("筛选出hp>100&&damage<50的英雄：");
		filter(heros);
	}

	private static void filter(List<Hero> heros) {
		for(Hero hero:heros) {
			if(hero.hp>100&&hero.damage<50) {
				System.out.print(hero);
			}
		}
	}
}
