package myStuff;

import java.util.List;

import guiTeacher.components.Button;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen{

	private TextField mainField;
	private Button add;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		mainField = new TextField(40,40,200,30, "Text goes here");
		viewObjects.add(mainField);
		
		mainField = new TextField(40,40,200,30, "You go here");
		viewObjects.add(mainField);
		
		add = new Button(100,100,100,100, "BigButton", new Act());
		viewObjects.add(add);
	
}
	public void Act() {
		mainField.setText("You clicked the button");
		
	}
	
}
