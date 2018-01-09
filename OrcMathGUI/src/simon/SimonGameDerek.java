package simon;

import guiTeacher.GUIApplication;

public class SimonGameDerek extends GUIApplication{

	public static SimonGameDerek example;
	public static SimonScreenDerek screen;
	
	public SimonGameDerek(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		example = new SimonGameDerek(800, 550);
		Thread begin = new Thread(example);
		begin.start();	
	}
	
	@Override
	public void initScreen() {
		screen = new SimonScreenDerek(getWidth(), getHeight());
		setScreen(screen);		
	}
	
}
