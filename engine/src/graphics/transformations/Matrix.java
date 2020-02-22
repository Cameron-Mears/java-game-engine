package graphics.transformations;

public class Matrix 
{
	public double[][] matrix;
	
	public Matrix(double x1, double x2, double y1, double y2)
	{
		matrix = new double[2][2];
		matrix[0][0] = x1;
		matrix[1][0] = x2;
		matrix[0][1] = y1;
		matrix[1][1] = y2;
	}
	
	public Vector2 multiply(Vector2 vec)
	{
		return new Vector2(vec.getX()*matrix[0][0] + vec.getX()*matrix[0][1], vec.getY()*matrix[1][0] + vec.getY()*matrix[1][1]);
	}
}
