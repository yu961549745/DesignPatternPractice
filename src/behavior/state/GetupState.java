package behavior.state;

public class GetupState implements State {

	@Override
	public void exec(Human h) {
		System.out.println(h + "起床");
		h.setStateType(StateType.EAT);
	}

}
