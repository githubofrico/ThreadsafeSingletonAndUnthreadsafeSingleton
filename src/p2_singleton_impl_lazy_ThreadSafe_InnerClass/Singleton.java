package p2_singleton_impl_lazy_ThreadSafe_InnerClass;

/**        
 * Title: 线程安全的懒汉式单例模式   
 * Description: 内部类实现
 * @author rico       
 * @created 2017年5月7日 下午4:22:29    
 */      
public class Singleton {

	//静态私有内部类
	private static class InnerClass {
		private final static Singleton instance = new Singleton();
	}
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return InnerClass.instance;
	}
}
