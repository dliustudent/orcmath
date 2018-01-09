package simon;

import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressDerek extends Component implements ProgressInterfaceDerek{

	private int roundNum;
	private int sequenceNum;
	private int round;

	public ProgressDerek(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
		round = 0;
	}

	@Override
	public void gameOver() {
		System.out.println("Game Over");
		update();
	}

	@Override
	public void setNum(int round,int seq) {
		roundNum = round;
		sequenceNum = seq;
		update();
		
	}
	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

}
