package duoxiancheng.test1;

public class TestAddThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number number=new Number();
		number.num=1;
		
		AddThread addThread[]=new AddThread[10];
		//for(int i=0;i<addThread.length;i++) {
			addThread[0].setNumber(number);
			//addThread[0].start();
		//}
		
//		AddThread addThread=new AddThread();
//		addThread.setNumber(number);
//		addThread.start();
//		
//		AddThread addThread2=new AddThread();
//		addThread2.setNumber(number);
//		addThread2.start();
		

		
	}

}
