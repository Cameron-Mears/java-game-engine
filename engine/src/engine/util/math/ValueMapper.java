package engine.util.math;

public class ValueMapper 
{
	private Range in;
	private Range out;
	
	public ValueMapper(Range in, Range out)
	{
		this.in = in;
		this.out = out;
	}
	
	
	public double map(double value)
	{
		return (value/(in.getUpperBound() - in.getLowerBound())) * (out.getUpperBound() - out.getLowerBound()) + out.getLowerBound();
	}
}
