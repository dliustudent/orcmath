package simon;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressDerek extends Component implements ProgressInterfaceDerek{

	private int roundNum;
	private int sequenceNum;
	private boolean defeat;

	public ProgressDerek() {
		super(250,50,400,200);
	}

	@Override
	public void lose() {
		defeat = true;
		update();
	} 

	@Override
	public void setNum(int round,int seq) {
		this.roundNum = round;
		this.sequenceNum = seq;
		update();
		
	}

	@Override
	public void update(Graphics2D g) {
		clear();
		if(defeat) {
			g.setColor(Color.BLUE);
			g.drawString("You have lost.",5,50);
		}else {
			g.setColor(Color.GREEN);
			g.drawString("Round: "+roundNum,5,55);
			g.drawString("Current Sequence Length: "+sequenceNum,5,100);
		}

	}
		
}

