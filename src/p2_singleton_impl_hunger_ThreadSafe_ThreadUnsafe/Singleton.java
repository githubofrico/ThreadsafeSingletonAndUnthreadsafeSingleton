package p2_singleton_impl_hunger_ThreadSafe_ThreadUnsafe;

/**        
 * Title: 饿汉式单例模式   
 * Description: 饿汉式单例模式本身就是线程安全的
 * @author rico       
 * @created 2017年5月7日 下午4:22:29    
 */      
public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return instance;
	}
}
