package struct.functional.decorator;

public class BasicSword implements Sword {

	@Override
	public void attack() {
		System.out.println("砍你1点血");
	}

}
