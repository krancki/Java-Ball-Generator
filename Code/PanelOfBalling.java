package zazd5Ball;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class PanelOfBalling extends JPanel {
	
	private static int WIDTH=500;
	private static int HEIGHT=500;
	
	private List<Ball> ballList= Ball.BallList;
	
	public PanelOfBalling()
	{
		setSize(WIDTH, HEIGHT);
		
		setBackground(Color.yellow);
		
	}
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		for(Ball ball : ballList)
		{
			
			g2.setColor(ball.ballColor);
		
			
			g2.fill(ball.getShape());
		}
		
		
	}
	
}
