package reflection;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;

import charactor.Hero;

public class TestReflection3 {
	
	public static void main(String[] args) {
		Hero h=getHero();
		System.out.println(h);
	}
	
	public static Hero getHero() {
		File file=new File("D:/how2j/hero.config");
		try {
			FileReader fr=new FileReader(file);
			char[] all=new char[(int) file.length()];
			fr.read(all);
			String className=new String(all);
			Class clazz=Class.forName(className);
			Constructor c=clazz.getConstructor();
			Hero h=(Hero) c.newInstance();
			return h;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}