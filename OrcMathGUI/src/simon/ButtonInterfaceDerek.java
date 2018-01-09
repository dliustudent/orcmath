package simon;

import java.awt.Color;
import guiTeacher.components.Action;
import guiTeacher.interfaces.Clickable;

public interface ButtonInterfaceDerek extends Clickable{

	void setColor(Color white);

	void setAction(Action a);

	void highlight();

	void dim();
	void getButton();
}
