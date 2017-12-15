package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Backpacks extends Component{
	
	private String brand;
	private double price;
	private boolean worthIt;
	
	
	public Backpacks(String brand, double price, boolean worthIt) {
		super(40,40,100,100);
		this.brand = brand;
		this.price = price;
		this.worthIt = worthIt;
//		addSequence("resources/pegasus sprite sheet.png", 150, 0, 0, 255, 179, 4);
//		Thread animation = new Thread(this);
//		animation.start();
		update(); //doesn't need parameters because it is a method from the super class
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "brand" + "price" + "worthIt";
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.BLUE);
		g.fillRect(0,0,getWidth(), getHeight());
	}
	
	
}
