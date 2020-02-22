package engine.layer;

import java.util.HashMap;

public class LayerManager 
{
	private HashMap<String, Layer> layers;
	
	private static LayerManager instance;
	
	public synchronized LayerManager getInstance()
	{
		if (instance == null)
		{
			instance = new LayerManager();
		}
		
		return instance;
	}
	
	private LayerManager()
	{
		
	}

	
	
}
