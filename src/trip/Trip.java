package trip;

public class Trip {

	public synchronized void goToBeiJing() {
		System.out.println("去北京");
		buyATicket();
	}
	
	public synchronized void buyATicket() {
		System.out.println("买票");
	}
	
	public static void main(String[] args) {
		Trip trip=new Trip();
		trip.goToBeiJing();
	}
}
