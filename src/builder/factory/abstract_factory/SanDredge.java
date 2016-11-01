package builder.factory.abstract_factory;

public class SanDredge implements Dredge {
	@Override
	public void drive() {
		System.out.println("三菱挖掘机开车了");
	}

	@Override
	public void dig() {
		System.out.println("三菱挖掘机挖土了");
	}
}
