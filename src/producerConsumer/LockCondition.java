package producerConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lock lock=new ReentrantLock();
		Condition consumerCondition=lock.newCondition();
		Condition producerCondition=lock.newCondition();
		Resource2 resource2=new Resource2(lock, producerCondition, consumerCondition);
		
		ProducerThread2 p0=new ProducerThread2(resource2);
		
		ConsumerThread2 c1=new ConsumerThread2(resource2);
		ConsumerThread2 c2=new ConsumerThread2(resource2);
		ConsumerThread2 c3=new ConsumerThread2(resource2);
		
		p0.start();
		c1.start();
		c2.start();
		c3.start();
	}

}

class Resource2{
	private int num=0;
	private final int max_num=10;
	
	private Lock lock;
	private Condition producerCondition;
	private Condition consumerCondition;
	public Resource2(Lock lock, Condition producerCondition, Condition consumerCondition) {
		this.lock = lock;
		this.producerCondition = producerCondition;
		this.consumerCondition = consumerCondition;
	}
	
	public void add() {
		lock.lock();
		try {
			if (num < max_num) {
				num++;
				System.out.println("生产者" + Thread.currentThread().getName() + "生产了一件资源，当前线程池中还有" + num + "件资源");

				//唤醒等待的消费者
				consumerCondition.signalAll();
			} else {
				//让生产者线程等待
				try {
					producerCondition.await();
					System.out.println("生产者" + Thread.currentThread().getName() + "线程进入等待状态");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
	}
	
	public void remove() {
		lock.lock();
		try {
			if (num > 0) {
				num--;
				System.out.println("消费者" + Thread.currentThread().getName() + "消费了一件资源，当前线程池中还有" + num + "件资源");

				//唤醒等待的生产者
				producerCondition.signalAll();
			} else {
				//让消费者线程等待
				try {
					consumerCondition.await();
					System.out.println("消费者" + Thread.currentThread().getName() + "线程进入等待状态");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
	}
	
}


class ConsumerThread2 extends Thread{
	private Resource2 resource2;

	public ConsumerThread2(Resource2 resource2) {
		this.resource2 = resource2;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resource2.remove();
		}
	}
}

class ProducerThread2 extends Thread{
	private Resource2 resource2;

	public ProducerThread2(Resource2 resource2) {
		this.resource2 = resource2;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resource2.add();
		}
	}
}