package engine.physics.collision;

import java.util.LinkedList;

import engine.layer.Layer;

public class CollisionLayer extends Layer
{
	private LinkedList<Collidable> collidables;
	
	public boolean testCollision(Collidable source)
	{
		for (Collidable collidable : collidables) 
		{
			if (collidable.checkCollision(null)) return false;
		}
		
		return false;
	}
	
	
	
	
}
