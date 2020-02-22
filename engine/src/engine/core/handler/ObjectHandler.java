package engine.core.handler;

public class ObjectHandler
{
    private static ObjectHandler instance;

    public static synchronized ObjectHandler getInstance()
    {
        if (instance == null)
        {
            instance = new ObjectHandler();
        }
        return instance;
    }
    
    
    

    private ObjectHandler()
    {
        
    }
}