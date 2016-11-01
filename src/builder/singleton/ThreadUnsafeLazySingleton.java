package builder.singleton;

public class ThreadUnsafeLazySingleton {
	private static ThreadUnsafeLazySingleton INSTANCE = null;

	public static ThreadUnsafeLazySingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ThreadUnsafeLazySingleton();
		}
		return INSTANCE;
	}

	private ThreadUnsafeLazySingleton() {
	}
}
