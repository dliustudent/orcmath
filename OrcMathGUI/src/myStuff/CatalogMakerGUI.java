package myStuff;

import java.util.List;

import guiTeacher.GUIApplication;
import guiTeacher.components.AnimatedComponent;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogMakerGUI extends GUIApplication{

	public CatalogMakerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		CatalogScreen a = new CatalogScreen(getWidth(), getHeight());
		setScreen(a);
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args){
		CatalogMakerGUI sample = new CatalogMakerGUI(800, 550);
		Thread go = new Thread(sample);
		go.start();
	}
}

