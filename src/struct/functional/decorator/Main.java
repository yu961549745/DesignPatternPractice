package struct.functional.decorator;

public class Main {
	public static void main(String[] args) {
		Sword basicSword = new BasicSword();
		Sword laserSword = new LaserSword(basicSword);
		laserSword.attack();
	}
}
