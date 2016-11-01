package build.singleton;

public class StaticFieldSingleton {
	private static class SingletonHolder {
		public final static StaticFieldSingleton INSTANCE = new StaticFieldSingleton();
	}

	public static StaticFieldSingleton getInstace() {
		return SingletonHolder.INSTANCE;
	}

	private StaticFieldSingleton() {
	}
}
