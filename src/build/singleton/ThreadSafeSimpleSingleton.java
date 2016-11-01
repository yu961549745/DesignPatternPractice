package build.singleton;

public class ThreadSafeSimpleSingleton {
	private static final ThreadSafeSimpleSingleton INSTANCE = new ThreadSafeSimpleSingleton();

	public static ThreadSafeSimpleSingleton getInstance() {
		return INSTANCE;
	}

	private ThreadSafeSimpleSingleton() {
	}
}
