package zazd5Ball;

import java.awt.Component;

public class BallRunable implements Runnable {

		private Ball ball;
		private  Component component;
		
		
	public BallRunable(Ball _ball,Component _component)
	{
		ball= _ball;
		component= _component;
	}
	
	@Override
	public void run() {
		
		try
		{
			while(true)
			{
				
			ball.move(component.getBounds());
			ball.collision();
			component.repaint();
			Thread.sleep(20);
			}
		}
		catch(Exception e)
		{
			
		}
		
		
	}

	
}




			
	