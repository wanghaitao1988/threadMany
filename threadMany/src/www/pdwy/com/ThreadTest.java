package www.pdwy.com;

public class ThreadTest {
	  public static void main(String[] args) {
		          for (int i = 0; i < 100; i++) {
		               System.out.println(Thread.currentThread().getName() + " " + i);
		             if (i == 30) {
		                  Thread myThread1 = new MyThread();     // ����һ���µ��߳�  myThread1  ���߳̽����½�״̬
		                  Thread myThread2 = new MyThread();     // ����һ���µ��߳� myThread2 ���߳̽����½�״̬
		                  myThread1.start();                     // ����start()����ʹ���߳̽������״̬
		                  myThread2.start();                     // ����start()����ʹ���߳̽������״̬
		             }
		          }
		      }
}
