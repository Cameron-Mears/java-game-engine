package engine.core;

public class Engine implements Runnable
{
	private static Engine instance;
	
	
	private boolean doRender;
	private boolean doTick;
	
	private int tickRate;
	private int frameRate;
	
	
	public static synchronized Engine getInstance()
	{
		return instance;
	}
	
	Engine()
	{
		
	}

	@Override
	public void run() 
	{
		instance = this;		
	}
}
