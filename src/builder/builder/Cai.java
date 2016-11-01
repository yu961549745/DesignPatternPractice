package builder.builder;

import java.util.ArrayList;
import java.util.List;

public class Cai {
	private List<Item> items = new ArrayList<Item>();
	private String name;

	public Cai(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public int getPrice() {
		int s = 0;
		for (Item i : items) {
			s += i.getPrice();
		}
		return s;
	}

	public void showItems() {
		System.out.println(name);
		System.out.println("-----------含有-----------");
		for (Item i : items) {
			System.out.println(i.getName());
		}
		System.out.println("---------------------------");
	}
}
