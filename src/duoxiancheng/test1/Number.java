package duoxiancheng.test1;

public class Number {

	public int num;

	
	
	public synchronized void add(int number) {
		num+=number;
		System.out.println(num);
	}
}
