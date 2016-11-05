package struct.functional.bridge;

public abstract class GameRender {
	protected RenderGraphics graphics;

	public GameRender(RenderGraphics graphics) {
		this.graphics = graphics;
	}

	public RenderGraphics getGraphics() {
		return graphics;
	}

	public abstract void render();
}
