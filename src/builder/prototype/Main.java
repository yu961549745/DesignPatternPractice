package builder.prototype;

public class Main {
	public static void main(String[] args) {
		TopUsers top10 = TopUsersChache.getInstance().getTopUsers(10);
		System.out.println(top10.getUsers());
		TopUsers top5 = TopUsersChache.getInstance().getTopUsers(5);
		System.out.println(top5.getUsers());
	}
}
