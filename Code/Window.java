package zazd5Ball;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;





public class Window extends JFrame{
	
	
	private JPanel ButtonPanel = new JPanel();
	private PanelOfBalling BallPanel= new PanelOfBalling();
	
	public Window() 
	{
		
		this.setVisible(true);
		
		this.setSize(400, 400);
		
	
		
		add(BallPanel,BorderLayout.CENTER);
		
		ButtonAdd("Dodaj",new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 
				BallAdd();
				
			}
		});
		
		ButtonAdd("Wyjdz", new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		
		this.add(ButtonPanel,BorderLayout.PAGE_END);
		
		
	}
	
	
	public void ButtonAdd(String name, ActionListener listener)
	{
		JButton button = new JButton(name);
		button.addActionListener(listener);
		ButtonPanel.add(button);
	}
	

	public void BallAdd()
	{
		
		Ball ball = new Ball();
		
	    Runnable run = new BallRunable(ball,BallPanel);
		Thread thread = new Thread(run);
		thread.start();
		
		
		
	}
	
	
	
}
