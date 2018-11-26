package test;

import java.util.HashSet;

public class Test8 {
	public static void main(String[] args) {

		HashSet set = new HashSet<>();

		set.add(1);
		set.add(2);
		set.add(null);
		System.out.println(set.size());
	}

}
