package myStuff;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen{

	private TextField mainField;
	private Button add;
	private TextArea area;
	private String b;

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

	//	mainField.setInputType(TextField.INPUT_TYPE_NUMBERIC);
		add = new Button(100,100,100,100, "BigButton", new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				mainField.setText("You clicked the button");
				
			}
		});
		viewObjects.add(add);

		area = new TextArea(140,200,200,100, "This is a textarea");
		viewObjects.add(area);
	}

	protected void addButtonClick() {
//		String name =                                                                 
	}

}