package graphics.transformations;


import graphics.frame.Mat;
import graphics.frame.Pixel;

public class ImageTransformer
{   
	private Mat mat;
	private Vector2 origin;
	private Matrix matrix;

    public ImageTransformer(Mat mat, Vector2 origin)
    {
        this.mat = mat;
        this.origin = origin;
        
    }

    public void setRotation(double radians)
    {
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);    
        matrix = new Matrix(cos, -sin, sin, cos);
    }
    
    public Pixel getRotated(int x, int y)
    {
    	Pixel pixel = mat.getPixel(x, y);
    	Vector2 vec = new Vector2(x, y);
    	vec = matrix.multiply(vec);
    	return new Pixel((int)(vec.getX() + origin.getX()), (int)(vec.getY() + origin.getY()), pixel.getData());
    	
    }
}