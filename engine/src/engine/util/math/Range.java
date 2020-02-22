package engine.util.math;

public class Range 
{
	private double lowerBound;
	private double upperBound;
	
	public Range(double lowerBound, double upperBound)
	{
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	
	public boolean contains(double value)
	{
		return value >= lowerBound && value <= upperBound;
	}

	public double getLowerBound() 
	{
		return lowerBound;
	}

	public void setLowerBound(double lowerBound) 
	{
		this.lowerBound = lowerBound;
	}

	public double getUpperBound() 
	{
		return upperBound;
	}

	public void setUpperBound(double upperBound) 
	{
		this.upperBound = upperBound;
	}
	
}
