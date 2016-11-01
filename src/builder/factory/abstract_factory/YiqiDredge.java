package build.factory.abstract_factory;

public class YiqiDredge implements Dredge {
	@Override
	public void drive() {
		System.out.println("一汽挖掘机开车了");
	}

	@Override
	public void dig() {
		System.out.println("一汽挖掘机挖土了");
	}
}
