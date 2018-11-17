package test1;

import java.lang.reflect.Constructor;

public class Test {

	public static void main(String[] args) throws Exception {
		f(4, 2, 3);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static int f(int a, int b, int c) throws Exception {
		Class clazz = Class.forName("test1.A" + a);
		Constructor con = clazz.getConstructor();
		A aclass = (A) con.newInstance();
		System.out.println(aclass.calculate(b, c));
		return 0;
	}

}
