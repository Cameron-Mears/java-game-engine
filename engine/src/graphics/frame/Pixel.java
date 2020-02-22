package graphics.frame;

public class Pixel 
{
	private int x, y;
	private double[] data;
	
	public Pixel(int x, int y, double[] data)
	{
		this.x = x;
		this.y = y;
		this.data = data;
	}
	
	public double[] getData()
	{
		return data;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public void setY(int y) 
	{
		this.y = y;
	}

	public void setData(double[] data) 
	{
		this.data = data;
	}
	
	
	
}
