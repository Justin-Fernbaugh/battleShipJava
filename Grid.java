public class Grid
{
    private Location[][] grid;
    
    // Constants for number of rows and columns.
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLS = 10;
    public static final char[] NUM_COLS_CHAR = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    
    // Write your Grid class here
    // Create a new Grid. Initialize each Location in the grid
    // to be a new Location object.
    public Grid()
    {
        grid = new Location[10][10];
        for(int row = 0; row < NUM_ROWS; row++)
            for(int col = 0; col < NUM_COLS; col++)
                grid[row][col] = new Location();
        
    }
    
    // Mark a hit in this location by calling the markHit method
    // on the Location object.  
    public void markHit(int row, int col)
    {
        grid[row][col].markHit();
    }
    
    // Mark a miss on this location.    
    public void markMiss(int row, int col)
    {
        grid[row][col].markMiss();
        
    }
    
    // Set the status of this location object.
    public void setStatus(int row, int col, int status)
    {
        grid[row][col].setStatus(status);
    }
    
    // Get the status of this location in the grid  
    public int getStatus(int row, int col)
    {
        
        return(grid[row][col].getStatus());
        
    }
    
    // Return whether or not this Location has already been guessed.
    public boolean alreadyGuessed(int row, int col)
    {
        if(grid[row][col].isUnguessed())
        {
            return(false);
        }
        else
        {
            return(true);
        }
        
    }
    
    // Set whether or not there is a ship at this location to the val   
    public void setShip(int row, int col, boolean val)
    {
        grid[row][col].setShip(val);
    }
    
    // Return whether or not there is a ship here   
    public boolean hasShip(int row, int col)
    {
        if(grid[row][col].hasShip())
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    
    
    // Get the Location object at this row and column position
    public Location get(int row, int col)
    {
        return(grid[0][0]);
        
    }
    
    // Return the number of rows in the Grid
    public int numRows()
    {
        
        return(NUM_ROWS);
        
    }
    
    // Return the number of columns in the grid
    public int numCols()
    {
        
        return(NUM_COLS);
        
    }
        
    public void printStatus()
    {
        System.out.println(" 1 2 3 4 5 6 7 8 9 10");
        for(int row = 0; row < numRows(); row++)
        {
            System.out.print((char)(65+row) + " " );
            for(int col = 0; col < numCols(); col++)
            {
                if(grid[row][col].checkHit())
                {
                    System.out.print("X ");
                }
                else if(grid[row][col].checkMiss())
                {
                    System.out.print("O ");
                }
                else if(grid[row][col].isUnguessed())
                {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
        
        
    }
    public void printShips()
    {
        System.out.println(" 1 2 3 4 5 6 7 8 9 10");
        for(int row = 0; row < numRows(); row++)
        {
            System.out.print((char)(65+row) + " " );
            for(int col = 0; col < numCols(); col++)
            {
                if(grid[row][col].hasShip())
                {
                    System.out.print("X ");
                }
                else
                {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
    }

    
}
