package duoxiancheng.test1;

public class TestAddThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number num=new Number();
		num.num=1;
		
		AddThread add=new AddThread();
		add.setNumber(num);
		add.start();
	}

}
