		package myStuff;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiPlayer.CustomLabel;
import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button implements CustomLabel{

	private String s1;
	private String s2;
	private Color iconColor;
	
	public CustomButton(int x, int y) {
		super(x,y, 300,100,"",null);
		update();
		}


	
	@Override
	public void updateString1(String string) {
		s1 = string;
		
	}

	@Override
	public void updateString2(String string) {
		s2 = string;
	
	}

	public void drawButton(Graphics2D g, boolean hover){
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.WHITE);
		g.fillRect(0,0,getWidth(),getHeight());
		g.setColor(Color.BLACK);
		if(s1 != null)
		g.drawString(s1, 5, 20);
		if(s2 != null)
		g.drawString(s2, 5, 40);
		g.setColor(iconColor);
		g.fillRect(280, 5, 20, 100);
	}

	@Override
	public void setIconColor(Color color) {
		iconColor = color;
	
	}
	
}
