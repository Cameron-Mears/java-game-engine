package graphics.frame;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class Mat 
{
	private int x, y;
	private int width, height;
	private double[][][] data;
	
	private Pixel[][] pixels;
	
	public Mat(BufferedImage image, int x, int y)
	{
		this.x = x;
		this.y = y;
		width = image.getWidth();
		height = image.getHeight();
		pixels = new Pixel[width][height];
		
		WritableRaster raster = image.getRaster();
		
		
		for (int i = 0; i < image.getWidth(); i++) 
		{
			for (int j = 0; j < image.getHeight(); j ++)
			{
				double[] data = new double[4];
				raster.getPixel(i, j, data);
				pixels[i][j] = new Pixel(i,j,data);
			}
		}
	}
	
	public Pixel getPixel(int x, int y)
	{
		return pixels[x][y];
	}
}
