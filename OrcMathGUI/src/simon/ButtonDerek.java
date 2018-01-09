package simon;

import java.awt.Color;
import java.awt.Graphics2D;
import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonDerek extends Button implements ButtonInterfaceDerek{

	public ButtonDerek(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, "", null);
		// TODO Auto-generated constructor stub
	}

	public void drawButton(Graphics2D g, boolean hover) {
		
	}

	@Override
	public void setColor(Color white) {
		this.setBackgroundColor(white);
	}

	@Override
	public void highlight() {
		
	}

	@Override
	public void dim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getButton() {
		// TODO Auto-generated method stub
		
	}
	
}
