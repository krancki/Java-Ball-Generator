package zazd5Ball;

import java.awt.EventQueue;

public class Application {

	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				new Window();
				
				
			}
		});

	}

}
