package producerConsumer;

public class ProducerConsumerWithWaitNofity {
	
	public static void main(String[] args) {
		Resource resource=new Resource();
		
		ProducerThread p0=new ProducerThread(resource);
		ProducerThread p1=new ProducerThread(resource);
		ProducerThread p2=new ProducerThread(resource);
		ConsumerThread c3=new ConsumerThread(resource);
//		ConsumerThread c4=new ConsumerThread(resource);
//		ConsumerThread c5=new ConsumerThread(resource);
		
		p0.start();
		p1.start();
		p2.start();
		c3.start();
//		c4.start();
//		c5.start();
	}

	
	
	
}

class Resource{
	//当前资源数量
	private int num=0;
	//资源池中最大允许的资源数量
	private final int max_num=10;
	
	//从资源池中取走资源
	public synchronized void remove() {
		if(num>0) {
			num--;
			System.out.println("消费者"+Thread.currentThread().getName()+"消费一件资源，当前线程池还有"+num+"个资源");
			System.out.println();
			notifyAll();//通知生产者生产资源
		}else {
			//如果没有资源，通知消费者进入等待状态
			try {
				wait();
				
				System.out.println("消费者"+Thread.currentThread().getName()+"线程进入等待状态");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//从资源池中添加资源
	public synchronized void add() {
		if(num<max_num) {
			num++;
			System.out.println("生产者"+Thread.currentThread().getName()+"生产一件资源，当前线程池还有"+num+"个资源");
			System.out.println();
			notifyAll();//通知消费者消费资源
		}else {
			//如果没有资源，通知生产者进入等待状态
			try {
				wait();
				
				System.out.println("生产者"+Thread.currentThread().getName()+"线程进入等待状态");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//消费者线程
class ConsumerThread extends Thread{
	private Resource resource;
	public ConsumerThread(Resource resource) {
		this.resource=resource;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resource.remove();
		}
	}
}

//生产者线程
class ProducerThread extends Thread{
	private Resource resource;

	public ProducerThread(Resource resource) {
		this.resource = resource;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resource.add();
		}
	}
}










