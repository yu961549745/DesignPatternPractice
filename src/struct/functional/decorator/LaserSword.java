package struct.functional.decorator;

public class LaserSword extends SwordDecorator {

	public LaserSword(Sword sword) {
		super(sword);
	}

	@Override
	public void attack() {
		super.attack();
		System.out.println("并向你发射了激光");
	}
}
