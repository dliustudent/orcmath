package simon;

import guiTeacher.GUIApplication;

public class SimonGameDerek extends GUIApplication{

	public SimonGameDerek(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		SimonGameDerek example = new SimonGameDerek(800, 550);
		Thread begin = new Thread(example);
		begin.start();	
	}
	
	@Override
	public void initScreen() {
		SimonScreenDerek screen = new SimonScreenDerek(getWidth(), getHeight());
		setScreen(screen);		
	}
	
}
