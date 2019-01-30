import java.awt.*;
import java.text.*;
import java.util.*;

import javax.swing.*;

public class gui extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int currentSpeedVar;
	
	public gui() {
		car car = new car();
		currentSpeedVar = car.currentSpeed();
		
		interfaces inter = new interfaces();
		String[] layout = inter.changeLayout();
		System.out.println(layout);
	}
	
	final DateFormat timeFormat = new SimpleDateFormat("HH:mm");
	
	Date date = new Date();
	String time = timeFormat.format(date);
	
	int imageX = 90;
	int imageY = 90;
	
	public int frameSizeX = 1030;
	public int frameSizeY = 684;
	
	public int framePositionX = 1030;
	public int framePositionY = 684;
	
	public ImageIcon backgroundImage = new ImageIcon("images/window.jpg");
	
	public ImageIcon allowedSpeedImage = new ImageIcon("null");
	
	public ImageIcon directionImage = new ImageIcon("null");
	
	public ImageIcon yelpImage = new ImageIcon("null");
	
	ImageIcon image50 = new ImageIcon("images/50.png");

	ImageIcon image70 = new ImageIcon("images/70.png");
	
	ImageIcon imageLeft = new ImageIcon("images/left.png");
	
	ImageIcon imageRight = new ImageIcon("images/right.png");
	
	ImageIcon imageStraight = new ImageIcon("images/straight.png");
	
	ImageIcon imageYelp = new ImageIcon("images/yelp.png");
	
	int width = image50.getIconWidth() / 2;
    int height = image50.getIconHeight() / 2;
	
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		int fontSize = 30;
		Font f = new Font("Arial", Font.BOLD, fontSize);
		g2.setFont(f);
		
		backgroundImage.paintIcon(this, g, 0, 0);
		
		g2.drawString(time, 300, 300);
		
		allowedSpeedImage.paintIcon(this, g, 900, frameSizeY/2 - (imageY/2 + 20));
		
		yelpImage.paintIcon(this, g, 900, frameSizeY/2 - (imageY + 30));
		
		directionImage.paintIcon(this, g, frameSizeX/2 + 110, frameSizeY/2 - (imageY/2 + 160));
		
		fontSize = 80;
		Font f1 = new Font("Arial", Font.BOLD, fontSize);
		g2.setFont(f1);
		
		g2.drawString(Integer.toString(currentSpeedVar), frameSizeX/2 + 110, frameSizeY/2 - 30);
	}
	
	public void increseSpeed() {
		currentSpeedVar = currentSpeedVar + 5;
		System.out.println("increseSpeed");
		repaint();
	}
	
	public void decreseSpeed() {
		currentSpeedVar = currentSpeedVar - 5;
		System.out.println("decreseSpeed");
		repaint();
	}
	
	public void turnLeft() {
		directionImage = imageLeft;
		repaint();
	}
	
	public void turnRight() {
		directionImage = imageRight;
		repaint();
	}
	
	public void goStraight() {
		directionImage = imageStraight;
		repaint();
	}
	
	public int getFrameSizeX() {
		return frameSizeX;
	}
	
	public void setFrameSizeX(int frameSizeX) {
		this.frameSizeX = frameSizeX;
	}
	
	public int getFrameSizeY() {
		return frameSizeY;
	}
	
	public void setFrameSizeY(int frameSizeY) {
		this.frameSizeY = frameSizeY;
	}
	
	public int getFramePositionX() {
		return framePositionX;
	}
	
	public void setFramePositionX(int framePositionX) {
		this.framePositionX = framePositionX;
	}
	
	public int getFramePositionY() {
		return framePositionY;
	}
	
	public void setFramePositionY(int framePositionY) {
		this.framePositionY = framePositionY;
	}
	
	public void updateTime() {
		date = new Date();
		time = timeFormat.format(date);
		System.out.println(time);
		repaint();
	}
	
	public void showYelp() {
		yelpImage = imageYelp;
		System.out.println("showYelp");
		repaint();
	}
	
	public void hideYelp() {
		yelpImage = new ImageIcon("null");
		System.out.println("hideYelp");
		repaint();
	}
	
	public void speed50() {
		allowedSpeedImage = image50;
		System.out.println("50");
		repaint();
	}
	
	public void speed70() {
		allowedSpeedImage = image70;
		System.out.println("70");
		repaint();
	}
}