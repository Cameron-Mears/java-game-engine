package graphics.display;

import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Display extends JFrame implements WindowListener
{
	private int width, height;
	private BufferedImage frame;

	private static Display instance;
	

	public static synchronized Display getInstance()
	{
		if (instance == null)
		{
			instance = new Display();
		}
		
		return instance;
	}
	
	private Display()
	{
		this.setSize(900, 700);
		this.addWindowListener(this);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		width = 900;
		height = 700;
		
		frame = generateFrameTemplate();
		
	}
	
	public void renderFrame(BufferedImage frame)
	{
		
		new Thread(()->{
			
			BufferStrategy bs = this.getBufferStrategy();
			if (bs == null)
			{
				this.createBufferStrategy(2);
				bs = this.getBufferStrategy();
			}
			Graphics g = bs.getDrawGraphics();
			g.drawImage(frame, 0, 0, null);
			bs.show();
			g.dispose();
			
		}).start();
	}
	
	public BufferedImage getFrame()
	{
		return frame;
	}
	
	public BufferedImage generateFrameTemplate()
	{
		return new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	}

	@Override
	public void windowActivated(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) 
	{
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
