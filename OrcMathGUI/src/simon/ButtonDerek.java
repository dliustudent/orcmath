package simon;

import java.awt.Color;
import java.awt.Graphics2D;
import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonDerek extends Button implements ButtonInterfaceDerek{

	private Color buttoncolor;
	private Action action;


	public ButtonDerek(int x, int y, int w, int h, String text, Object object) {
		super(x, y, w, h, "", null);
		update();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setColor(Color white) {
		buttoncolor = white;
		this.setBackground(white);
		update();		
	}

	@Override
	public void highlight() {
		this.setBackground(Color.BLUE);
		update();		
	}

	@Override
	public void dim() {
		this.setBackground(this.buttoncolor);
		update();
	}

	@Override
	public void setAction(Action a) {
		this.action = a;

	}
}
