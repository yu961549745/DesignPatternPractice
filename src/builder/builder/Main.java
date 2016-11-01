package builder.builder;

public class Main {
	public static void main(String[] args) {
		Cai c = new CaiBuilder().getTudouChaoRou();
		c.showItems();
		System.out.println("价格：" + c.getPrice());
	}
}
