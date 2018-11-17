package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4 {
	
	public static void main(String[] args) {	
		Integer []aaaa= {1,2,3,4,5,6};
		System.out.println(aaaa);
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		Collections.swap(list, 0, 1);
		System.out.println(list);
	}		
}
