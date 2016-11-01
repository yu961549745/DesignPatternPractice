package build.singleton;

public class DoubleCheckSingleton {
	private static DoubleCheckSingleton INSTANCE = null;

	public static DoubleCheckSingleton getInstance() {
		if (INSTANCE == null) {// 可以有多个线程同时进入
			synchronized (DoubleCheckSingleton.class) {
				// 多个线程依次进入
				if (INSTANCE == null) {
					INSTANCE = new DoubleCheckSingleton();
				}
			}
		}
		return INSTANCE;
	}

	private DoubleCheckSingleton() {
	}
}
