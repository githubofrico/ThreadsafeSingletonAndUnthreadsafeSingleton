package p2_singleton_impl_lazy_ThreadUnsafe;

  
/**        
 * Title: 多线程测试        
 * Description: 
 * @author rico       
 * @created 2017年5月7日 下午4:44:33    
 */      
public class MultiThreadTest {
	
	public static void main(String[] args) {
		
		MyThread[] threads = new MyThread[20];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MyThread();
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
	}
}

class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println(Singleton.getInstance());
	}
}