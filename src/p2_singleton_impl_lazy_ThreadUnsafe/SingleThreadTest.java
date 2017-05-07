package p2_singleton_impl_lazy_ThreadUnsafe;

/**        
 * Title: 单线程测试     
 * Description: 
 * @author rico       
 * @created 2017年5月7日 下午4:45:10    
 */      
public class SingleThreadTest {
	
	public static void main(String[] args) {

		Singleton instance1 = Singleton.getInstance();
		
		Singleton instance2 = Singleton.getInstance();
		
		//判断是否是同一个对象
		System.out.println(instance1 == instance2);
		
	}
}

