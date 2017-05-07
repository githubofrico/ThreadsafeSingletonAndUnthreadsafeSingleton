package p2_singleton_impl_lazy_ThreadSafe_ThreadLocal;

  
/**        
 * Title: 线程安全的懒汉式单例  
 * Description: 双重检查锁定
 * @author rico       
 * @created 2017年5月7日 下午4:44:57    
 */      
public class SingleThreadTest {
	
	public static void main(String[] args) {

		Singleton instance1 = Singleton.getInstance();
		
		Singleton instance2 = Singleton.getInstance();
		
		//判断是否是同一个对象
		System.out.println(instance1 == instance2);
		
	}
}

