package reflection;

import charactor.Hero;

public class TestReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String classname="charactor.Hero";
		
		try {
			Class c1=Class.forName(classname);
			System.out.println(c1);
			Class c2=Hero.class;
			System.out.println(c2);
			Class c3=new Hero().getClass();
			System.out.println(c3);
			
			System.out.println(c1==c2);
			System.out.println(c2==c3);
			System.out.println(c1==c3);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
