package game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import graphics.display.Display;
import graphics.display.Renderer;
import graphics.frame.Mat;
import graphics.frame.Pixel;
import graphics.transformations.ImageTransformer;
import graphics.transformations.Vector2;

public class Main
{
	
	static double[] a;
	
	public static void main(String[] args)
	{
		BufferedImage frame = Display.getInstance().generateFrameTemplate();
		
		Graphics2D g2 = frame.createGraphics();
		Renderer renderer = new Renderer();
	
		
		g2.setColor(Color.black);
		double[] color = new double[4];
		color[0] = 0.1;
		color[1] = 0.1;
		color[2] = 0.1;
		color[3] = 0.1;
		
		
		BufferedImage img = new BufferedImage(500, 500, BufferedImage.TYPE_4BYTE_ABGR);
		img.createGraphics().fillRect(0, 0, 500, 500);
		
		Mat mat = new Mat(img, 300, 300);
		ImageTransformer transformer = new ImageTransformer(mat, new Vector2(100, 100));
		transformer.setRotation(2);
		
		
		for (int i = 0; i < 50; i++) 
		{
			for (int x = 0; x < 50; x++) 
			{
				Pixel p = transformer.getRotated(i, x);
				renderer.setPixel(p);
			}
		}
		
		renderer.render();
		
		Display.getInstance().renderFrame(img);
		
		System.out.println(a);
	}
}