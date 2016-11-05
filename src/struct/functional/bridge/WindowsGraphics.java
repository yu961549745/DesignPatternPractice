package struct.functional.bridge;

public class WindowsGraphics implements RenderGraphics {

	@Override
	public void drawLine() {
		System.out.println("Windows: 画了一条线");
	}

	@Override
	public void drawPoint() {
		System.out.println("Windows: 画了一个点");
	}

}
