package simon;

import java.util.ArrayList;
import java.util.List;

import com.sun.prism.paint.Color;

import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenDerek extends ClickableScreen implements Runnable{

	private TextLabel label;
	private ButtonInterfaceDerek[] buttons;
	public ProgressInterfaceDerek gameinfo;
	private ArrayList<MoveInterfaceDerek> store;
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	private Color[] colors;
	
	public SimonScreenDerek(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(ButtonInterfaceDerek b: buttons){ 
		    viewObjects.add(b); 
		}
		gameinfo = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		store = new ArrayList<MoveInterfaceDerek>();
		//add 2 moves to start
		lastSelectedButton = -1;
		store.add(randomMove());
		store.add(randomMove());
		roundNumber = 0;
		viewObjects.add(gameinfo);
		viewObjects.add(label);
	}

	private MoveInterfaceDerek randomMove() {
		 int bIndex = (int)(Math.random()*buttons.length);
		    while(bIndex == lastSelectedButton){
		        bIndex = (int)(Math.random()*buttons.length);
		    }
		   return getMove(bIndex);		
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterfaceDerek getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private MoveInterfaceDerek addButtons() {
		int numberofButtons = 10;
		
		return null;
		
	}

	private  MoveInterfaceDerek getMove(int bIndex) {
		// TODO Auto-generated method stub
		return null;
	}		
}

