package www.semaphore;

public class ThreadC extends Thread{

	private Service service;
	
	public ThreadC(Service service){
		this.service=service;
	}
	
	public void run(){
		service.testMesthod();
	}
	
}
