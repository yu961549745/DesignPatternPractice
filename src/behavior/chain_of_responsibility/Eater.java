package behavior.chain_of_responsibility;

public class Eater {
	private String name;
	private int level;
	private Eater nextEater;

	public Eater(String name, int level) {
		this.name = name;
		this.level = level;
	}

	public Eater getNextEater() {
		return nextEater;
	}

	public void setNextEater(Eater nextEater) {
		this.nextEater = nextEater;
	}

	public int getLevel() {
		return level;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

	public void eat(Eater food) {
		if (food.getLevel() < this.getLevel()) {
			System.out.println(name + "吃" + food);
		} else {
			Eater ne = this.getNextEater();
			if (ne != null) {
				ne.eat(food);
			} else {
				System.out.println(food.getName() + "没有天敌");
			}
		}
	}

}
