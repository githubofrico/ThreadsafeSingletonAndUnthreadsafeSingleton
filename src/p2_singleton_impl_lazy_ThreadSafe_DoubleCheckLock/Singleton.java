package p2_singleton_impl_lazy_ThreadSafe_DoubleCheckLock;

/**
 * Title: 线程安全的懒汉式单例模式 
 * Description: 双重检查锁定，效率较高
 * 
 * @author rico
 * @created 2017年5月7日 下午4:22:29
 */
public class Singleton {

	// volatile： 防止指令重排序
	private volatile static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		// 第一次检查
		if(instance == null){
			// 只在最初几次会进入该同步块，提高效率
			synchronized(Singleton.class){
				// 第二次检查
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
