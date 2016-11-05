package struct.functional.adapter;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SwingAdapter implements KeyListener {
	private GameListener control;

	public SwingAdapter(GameListener listener) {
		control = listener;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			control.onGameEvent(GameEvent.UP);
			break;
		case KeyEvent.VK_DOWN:
			control.onGameEvent(GameEvent.DOWN);
			break;
		case KeyEvent.VK_LEFT:
			control.onGameEvent(GameEvent.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			control.onGameEvent(GameEvent.RIGHT);
			break;
		default:
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
