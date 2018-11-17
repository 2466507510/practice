package test;

public class Test3 {
	
	public static void main(String[] args) {	
		String str="CCFC-12345";
		int index=str.indexOf("-");
		System.out.println(index);
		System.out.println(str.substring(0, index));
	}
}
