package behavior.state;

public class EatState implements State {

	@Override
	public void exec(Human h) {
		System.out.println(h + "吃饭");
		h.setStateType(StateType.SLEEP);
	}

}
