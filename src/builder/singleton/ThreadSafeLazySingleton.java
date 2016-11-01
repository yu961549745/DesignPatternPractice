package build.singleton;

public class ThreadSafeLazySingleton {
	private static ThreadSafeLazySingleton INSTANCE = null;

	public static synchronized ThreadSafeLazySingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ThreadSafeLazySingleton();
		}
		return INSTANCE;
	}

	private ThreadSafeLazySingleton() {
	}
}
