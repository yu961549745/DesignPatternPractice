package builder.builder;

public class CaiBuilder {
	public Cai getQincaiChaoRou() {
		Cai c = new Cai("青菜炒肉");
		c.addItem(new Qingcai());
		c.addItem(new Rou());
		return c;
	}

	public Cai getTudouChaoRou() {
		Cai c = new Cai("土豆炒肉");
		c.addItem(new Tudou());
		c.addItem(new Rou());
		return c;
	}
}
