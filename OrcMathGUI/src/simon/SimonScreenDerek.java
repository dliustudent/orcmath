package simon;

import java.util.ArrayList;
import java.util.List;

import java.awt.Color;
import guiTeacher.components.Action;
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
	public void run(){
	    label.setText("");
	    nextRound();
	    store.add(randomMove());
	    setRound();  
	    setSequenceSize();
	    changeText("yes");
	    label.setText("");
	    playSequence();
	}

	private void playSequence() {
		ButtonInterfaceDerek b = null;
		 for(int i = 0; i < store.size();i++)
		 {
			 if(b != null)
			 {
				 b.dim();
				 b.getButton();
				 b.highlight();
				 int sleepTime;
				 sleepTime = roundNumber +1;
				 try {
						Thread.sleep(800);
						} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}		
	
			 }
		 }
		 b.dim();
		 
	}

	private void changeText(String string) {
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}		
	}

	private void setSequenceSize() {
		// TODO Auto-generated method stub
		
	}

	private void setRound() {
		// TODO Auto-generated method stub
		
	}

	private void nextRound() {
		acceptingInput = false;
		roundNumber++;
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
		int numberofButtons = 2;
		buttons = new ButtonInterfaceDerek[numberofButtons];
		Color button1 = Color.BLUE;
		Color button2 = Color.RED;
		for(int i =0; i <numberofButtons; i++) {
			ButtonInterfaceDerek b = getAButton();
			buttons[i] = b;
			b.setColor(Color.WHITE);
		    b.setX(5);
		    b.setY(2);
		    b.setAction(new Action(){

		    	public void act(){
		    		if(acceptingInput) {
		    			Thread blink = new Thread(new Runnable(){

		    				public void run(){
		    				
		    			    final ButtonInterfaceDerek b = getAButton();
		    			    b.highlight();
		    			    try {
		    			    Thread.sleep(800);
		    			    } catch (InterruptedException e) {
		    			    // TODO Auto-generated catch block
		    			    e.printStackTrace();
		    			    }
		    			    b.dim();
		    				}});
		    			blink.start();
		    		}
		    		
		    		if(b == store.get(sequenceIndex).getButton()) {
						sequenceIndex++;

					}
					else {

						gameinfo.gameOver();
					}
					if(sequenceIndex == store.size()){ 
						Thread nextRound = new Thread(SimonScreenDerek.this); 
						nextRound.start(); 
					
		    	}

		    	}});
		}
		return null;		
	}

	/**
	Placeholder until partner finishes implementation of ButtonInterface
	*/
	private ButtonInterfaceDerek getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

	private  MoveInterfaceDerek getMove(int bIndex) {
		// TODO Auto-generated method stub
		return null;
	}		
}

