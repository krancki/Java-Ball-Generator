package zazd5Ball;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Ball extends Component {
	
	 private static final int XSIZE = 15;
	 private static final int YSIZE = 15;
	
	 
	
	 public static List<Ball> BallList = new ArrayList<>();

	 
	 private static int BallsId=0;
	 private int BallId;
	 
	 Color ballColor = Color.BLUE;
	 
	 private double x = 0;
	 private double y = 0;
	 
	 Random random = new Random();
	 
	 private  double dx =  (random.nextDouble()+0.1)*4;
	 private  double dy = (random.nextDouble()+0.1)*4;
	
	public Ball()
	{
		BallList.add(this);
		BallId=BallsId;
		BallsId++;
		
	}
	 
	 
	public void move(Rectangle2D bounds)
	{
		 x += dx;
		 y += dy;
		 if (x < bounds.getMinX())
		 {
		 x = bounds.getMinX();
		 dx = -dx;
		 }
		 if (x + XSIZE >= bounds.getMaxX())
		 {
		 x = bounds.getMaxX() - XSIZE;
		 dx = -dx;
		 }
		 if (y < bounds.getMinY())
		 {
		 y = bounds.getMinY();
		 dy = -dy;
		 }
		 if (y + YSIZE >= bounds.getMaxY())
		 {
		 y = bounds.getMaxY() - YSIZE;
		 dy = -dy;
		 }
		 
		 
			 
	}
	
	public  void collision ()
	{
		int collised =0;
		
		for(Ball ball : BallList)
		 {
		
			 if(ball!=this) 
			 {
				if(x + XSIZE/2 + ball.XSIZE/2> ball.x && x < ball.x+ XSIZE/2+ ball.XSIZE/2 && y+ YSIZE/2 +ball.YSIZE/2> ball.y && y < ball.y + YSIZE/2 + ball.YSIZE/2)
				{
					collised++;
					
				}
			
				
			 }
			 
			 if(collised>=1)
			 {
				 ballColor = Color.RED;
			 }
			 else
			 {
				 ballColor = Color.BLUE;
			 }
		}
		
		
		
	}
	
	
	
	 public Ellipse2D getShape()
	 {
		 return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
	 }
	
}
