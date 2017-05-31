package www.listpool;

public class Run {

	public static void main(String[] args) {
		ListPool pool=new ListPool();
		MyThread[] tharr=new MyThread[12];
		for(int i=0;i<tharr.length;i++){
			tharr[i]=new MyThread(pool);
		}
		for(int i=0;i<tharr.length;i++){
			tharr[i].start();
		}
	}
}
