package www.semaphore;

public class ThreadA extends Thread{

	private Service service;
	
	public ThreadA(Service service){
		this.service=service;
	}
	
	public void run(){
		service.sayHello();
	}
}
