import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class main extends JFrame implements KeyListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static gui GUI;
	
	public void keyPressed(KeyEvent e) {
        //System.out.println("keyPressed");
    }
	
	public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
            GUI.turnRight();
        else if(e.getKeyCode() == KeyEvent.VK_LEFT)
        	GUI.turnLeft();
        else if(e.getKeyCode() == KeyEvent.VK_UP)
        	GUI.goStraight();
        else if(e.getKeyCode() == KeyEvent.VK_U)
        	GUI.updateTime();
        else if(e.getKeyCode() == KeyEvent.VK_W)
        	GUI.increseSpeed();
        else if(e.getKeyCode() == KeyEvent.VK_S)
        	GUI.decreseSpeed();
        else if(e.getKeyCode() == KeyEvent.VK_Y)
        	GUI.showYelp();
        else if(e.getKeyCode() == KeyEvent.VK_X)
        	GUI.hideYelp();
        else if(e.getKeyCode() == KeyEvent.VK_5)
        	GUI.speed50();
        else if(e.getKeyCode() == KeyEvent.VK_7)
        	GUI.speed70();
    } 
	
	public void keyTyped(KeyEvent e) {
        //System.out.println("keyTyped");
    }
	
	public main() {
		main.GUI = new gui();
		addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				main gui = new main();
				gui.setTitle("Head-Up-Display");
				gui.setResizable(false);
				gui.setSize(1030, 684);
				gui.setMinimumSize(new Dimension(1030, 684));
				gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gui.getContentPane().add(main.GUI);
				gui.pack();
                gui.setVisible(true);
			}
		});
	}
}