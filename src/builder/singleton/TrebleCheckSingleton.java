package builder.singleton;

public class TrebleCheckSingleton {
	private static TrebleCheckSingleton INSTANCE = null;

	public static TrebleCheckSingleton getInstance() {
		if (INSTANCE == null) {// 可以有多个线程同时进入
			synchronized (DoubleCheckSingleton.class) {
				TrebleCheckSingleton temp = INSTANCE;
				if (temp == null) {
					synchronized (TrebleCheckSingleton.class) {
						temp = new TrebleCheckSingleton();
					}
					INSTANCE = temp;
				}
			}
		}
		return INSTANCE;
	}

	private TrebleCheckSingleton() {
	}
}
