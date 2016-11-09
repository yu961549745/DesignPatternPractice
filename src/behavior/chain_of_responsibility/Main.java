package behavior.chain_of_responsibility;

public class Main {
	public static void main(String[] args) {
		String[] eaters = new String[] { "虾米", "小鱼", "大鱼", "人类" };
		Eater chain = new Eater("河泥", 0);
		Eater cur = chain;
		for (int k = 0; k < eaters.length; k++) {
			Eater e = new Eater(eaters[k], k + 1);
			cur.setNextEater(e);
			cur = e;
		}
		chain.eat(new Eater("大鱼", 3));
	}
}
