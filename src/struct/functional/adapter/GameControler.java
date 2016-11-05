package struct.functional.adapter;

public class GameControler implements GameListener {

	@Override
	public void onGameEvent(GameEvent event) {
		System.out.println(event);
	}

}
