package graphics.display;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import graphics.frame.Mat;
import graphics.frame.Pixel;
import graphics.transformations.ImageTransformer;

public class Renderer 
{
	
	
	public void setPixel(int x, int y, double[] argb)
	{
		BufferedImage frame = Display.getInstance().getFrame();
		Graphics2D g2 = frame.createGraphics();
		g2.setColor(Color.black);
		g2.fillRect(x, y, 1, 1);
	}
	
	public void setPixel(Pixel p)
	{	
		setPixel(p.getX(), p.getY(), p.getData());
	}
	
	public void drawMat(int x, int y, Mat mat, ImageTransformer transform)
	{
		
	}
	
	
	public void render()
	{
		Display.getInstance().renderFrame(Display.getInstance().getFrame());
	}
	
}
	
	
