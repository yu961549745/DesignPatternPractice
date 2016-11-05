package struct.functional.bridge;

public class UserRender extends GameRender {

	public UserRender(RenderGraphics graphics) {
		super(graphics);
	}

	@Override
	public void render() {
		getGraphics().drawLine();
		getGraphics().drawPoint();
	}

}
