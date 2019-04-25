public class Ship
{
    private int row = UNSET;
    private int col = UNSET;
    private int length;
    private int direction = -1; //1:vertical, 0 horizontal
    
    public static final int UNSET = -1;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    
    public Ship(int length)
    {
        this.length = length;
    }
    
    public boolean isDirectionSet()
    {
        if(direction == -1)
        {
            return(false);
        }
        else
        {
            return(true);
        }
    }
    
    public void setLocation(int row, int col)
    {
        this.row = row;
        this.col = col;
        
        
    }
    
    //1 : vertical, 0 horizontal
    public void setDirection(int direction)
    {
        this.direction = direction;
        
    }
    
    public int getRow()
    {
        return(this.row);
    }
    
    public int getCol()
    {
        return(this.col);
    }
    
    public int getLength()
    {
        return(this.length);
    }
    
    public int getDirection()
    {
        return(this.direction);
    }
    
    private String directionToString()
    {
        return("The direction of the ship is: " + this.direction);
    }
    
    private String locationToString()
    {
        return(String.format("The location of the ship is row %s and column %s.", this.row, this.col));
    }
    
    public String toString()
    {
        if(isDirectionSet())
        {
            return(String.format("horizontal ship of length %s at (%s, %s)", this.length, this.row, this.col));
        }
        else
        {
            return(String.format("unset direction ship of length %s at (unset location)", this.length));
        }
        
    }

    public boolean isLocationSet()
    {
        if(this.row == UNSET || this.col == UNSET)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    
}
