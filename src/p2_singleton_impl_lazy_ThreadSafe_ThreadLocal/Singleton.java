package p2_singleton_impl_lazy_ThreadSafe_ThreadLocal;

/**
 * Title: 线程安全的懒汉式单例模式 
 * Description: ThreadLocal
 * 
 * @author rico
 * @created 2017年5月7日 下午4:22:29
 */
public class Singleton {

	// ThreadLocal 线程局部变量
	private static ThreadLocal<Singleton> threadlocal = new ThreadLocal<Singleton>();
	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		// 第一次检查：若线程第一次访问，则进入if语句块；否则，若线程已经访问过，则直接返回ThreadLocal中的值
		if (threadlocal.get() == null) {
			synchronized (Singleton.class) {
				if (instance == null) {  // 第二次检查：该单例是否被创建
					instance = new Singleton();
				}
			}
			threadlocal.set(instance); // 将单例放入ThreadLocal中
		}
		return threadlocal.get();
	}
}
