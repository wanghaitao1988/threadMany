package www.semaphore;

public class Run {

	public static void main(String[] args) {
		Service service =new Service();
	/*	ThreadA a=new ThreadA(service);
		a.setName("A");
		
		ThreadB b=new ThreadB(service);
		b.setName("B");
		
		ThreadC c=new ThreadC(service);
		c.setName("C");
		
		a.start();
		b.start();
		c.start();*/
		
	/*	ThreadA[] a=new ThreadA[10];
		for(int i=0;i<10;i++){
			a[i]=new ThreadA(service);
			a[i].start();
		}
		ThreadA a=new ThreadA(service);
		a.start();*/
		
		ThreadA[] arr=new ThreadA[12];
		for(int i=0;i<arr.length;i++){
			arr[i]=new ThreadA(service);
			arr[i].start();
		}
		
		
	}
}
