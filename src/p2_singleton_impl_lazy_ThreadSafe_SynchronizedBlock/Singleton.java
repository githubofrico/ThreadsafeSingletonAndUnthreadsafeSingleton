package p2_singleton_impl_lazy_ThreadSafe_SynchronizedBlock;

/**
 * Title: 线程安全的懒汉式单例模式 
 * Description: 同步块实现，相比双重检查锁定，效率较低
 * 
 * @author rico
 * @created 2017年5月7日 下午4:22:29
 */
public class Singleton {

	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		// 同步块
		synchronized (Singleton.class) {
			if(instance == null){
				instance = new Singleton();
			}
		}
		return instance;
	}
}
