package p2_singleton_impl_lazy_ThreadUnsafe;

/**        
 * Title: 线程不安全的懒汉式单例模式     
 * Description: 
 * @author rico       
 * @created 2017年5月7日 下午4:22:29    
 */      
public class Singleton {

	private static Singleton instance;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}
