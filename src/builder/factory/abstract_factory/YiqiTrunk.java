package builder.factory.abstract_factory;

public class YiqiTrunk implements Trunk {
	@Override
	public void drive() {
		System.out.println("一汽货车开了");
	}

	@Override
	public void load() {
		System.out.println("一汽货车装货了");
	}
}
