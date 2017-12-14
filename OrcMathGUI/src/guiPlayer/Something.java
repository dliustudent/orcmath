package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class Something extends Component{

	public Something() {
		super(40,40,100,100);
		
		update(); //doesn't need parameters because it is a method from the super class
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.BLUE);
		g.fillRect(0,0,getWidth(), getHeight());
	}

	
}
