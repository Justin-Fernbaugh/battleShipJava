public class Location
{
    
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    
    // -1 unIntialized.
    public int shipStatus = -1;
    public boolean hasShip = false;
        
    //Implement the Location class here
    
    public Location()
    {
        
    }
    
    public void markMiss()
    {
        
    }

    // Return whether or not this location has a ship.
    public boolean hasShip()
    {
        
        return(hasShip);
    }
    
    // Set the value of whether this location has a ship.
    public void setShip(boolean val)
    {
        hasShip = val;
    }
    
    // Set the status of this Location.
    public void setStatus(int status)
    {
        
    }
    
    // Get the status of this Location.
    public int getStatus()
    {
        return(0);
    }
    
    public void markHit()
    {
        
    }
    
    public boolean isUnguessed()
    {
        if(UNGUESSED == 0)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    
    public boolean checkHit()
    {
        if(HIT == 1)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    
    public boolean checkMiss()
    {
        if(MISSED == 2)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    
    
}
