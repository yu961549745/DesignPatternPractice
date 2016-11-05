package struct.functional.bridge;

public class Main {
	public static void main(String[] args) {
		GameRender render = new UserRender(new WindowsGraphics());
		render.render();
	}
}
