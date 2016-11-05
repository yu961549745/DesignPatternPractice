package struct.functional.decorator;

public abstract class SwordDecorator implements Sword {
	protected Sword sword;

	public SwordDecorator(Sword sword) {
		this.sword = sword;
	}

	@Override
	public void attack() {
		sword.attack();
	}
}
