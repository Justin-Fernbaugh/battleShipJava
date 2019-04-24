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
        shipStatus = MISSED;
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
        shipStatus = status;
    }
    
    // Get the status of this Location.
    public int getStatus()
    {
        return(shipStatus);
    }
    
    public void markHit()
    {
        shipStatus = HIT;
    }
    
    public boolean isUnguessed()
    {
        if(shipStatus == UNGUESSED)
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
        if(shipStatus == HIT)
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
        if(shipStatus == MISSED)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    
    
}
