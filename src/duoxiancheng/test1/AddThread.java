package duoxiancheng.test1;

public class AddThread extends Thread {

	private Number number;
	

	public Number getNumber() {
		return number;
	}


	public void setNumber(Number number) {
		this.number = number;
	}


	public void run() {
		number.add(1);
		//System.out.println("kkk");
	}
}
