package www.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    
	private Semaphore semaphore=new Semaphore(3);
	private ReentrantLock lock=new ReentrantLock();
	
	/*public void testMesthod(){
		
		try{
			semaphore.acquire(2);
			System.out.println(Thread.currentThread().getName()+" begin timer="+System.currentTimeMillis());
			int sleepValue=((int)(Math.random()*10000));
			System.out.println(Thread.currentThread().getName()+"ֹͣ��"+(sleepValue/1000)+"��");
			Thread.sleep(sleepValue);
			
			System.out.println(Thread.currentThread().getName()+" end timer="+System.currentTimeMillis());
			semaphore.release(2);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}*/
	
public void testMesthod(){
		
		try{
			semaphore.acquire();
			
			Thread.sleep(1000);
			System.out.println("���д�Լ"+semaphore.getQueueLength()+"�̵߳ȴ�");
			System.out.println("�Ƿ����߳��ڵȴ���"+semaphore.hasQueuedThreads());
			
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			semaphore.release();
		}
	}
	
	public void sayHello(){
		
		try{
			
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName()+"׼��");
			lock.lock();
			System.out.println("begin hello"+System.currentTimeMillis());
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+"��ӡ"+(i+1));
			}
			System.out.println("end hello"+System.currentTimeMillis());
			lock.unlock();
			System.out.println(Thread.currentThread().getName()+"����");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
}
