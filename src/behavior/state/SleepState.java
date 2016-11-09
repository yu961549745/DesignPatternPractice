package behavior.state;

public class SleepState implements State {

	@Override
	public void exec(Human h) {
		System.out.println(h + "睡觉");
		h.setStateType(StateType.GETUP);
	}

}
