package build.factory.abstract_factory;

public class BenzTrunk implements Trunk {
	@Override
	public void drive() {
		System.out.println("奔驰货车开了");
	}

	@Override
	public void load() {
		System.out.println("奔驰货车装货了");
	}
}
