package simon;

public class MoveDerek implements MoveInterfaceDerek{

	ButtonInterfaceDerek button;
	
	public MoveDerek(ButtonInterfaceDerek button) {
		this.button = button;
	}
	@Override
	public ButtonInterfaceDerek getButton() {
		return button;
	}

}
