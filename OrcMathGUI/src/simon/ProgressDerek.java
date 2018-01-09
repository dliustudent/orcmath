package simon;

import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressDerek extends Component implements ProgressInterfaceDerek{

	private int round;

	public ProgressDerek(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
		round = 0;
	}

	@Override
	public void setRound() {
		this.round = round;
	}

	@Override
	public void gameOver() {
		System.out.println("Game Over");
	}

	@Override
	public void setSequenceSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		round++;
		setRound();
	}

}
