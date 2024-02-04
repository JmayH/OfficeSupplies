/**
 * Keyboard.java models a keyboard and allows for you to type
 * @author Jamie Hsieh
 * @author August Cho
 * @version 2024-02-03
 */

public class WaterDispenser
{
    private int cups;
    private int water;
/**
 * constructor for objects in WaterDispenser class
 */
    public  WaterDispenser()
    {
        cups = 32;
        water  = 80; 

    }
/**
 * fillcup method imitates the act of filling a cup with water
 */
    public void fillcup()
    {
        if (cups > 0 && water > 0)
        {
            cups = cups - 1; 
            water = water - 1; 
        }
        else
        {
           if (cups ==0)
            System.out.println("No more cups. Please restock");
        
            if(water ==0)
                System.out.println("Ran out of water. Please restock");
        }
    }
/**
 * overlad fillcup method allows for you to not only fill up your cup but your coworker's cups too
 * @param x  number of cups filled
 */
    public void fillcup(int x)
    {
        if (cups >= x && water >= x)
        {
            cups = cups-x;
            water = water -x;
        }
        else
        {
           if (cups < x )
            System.out.println("Not enough cups. Please fill a lower number or restock");
        
            if(water < 0)
                System.out.println("Ran out of water. Please fill a lower number of cups or restock");
        }
    }
    /**
     * restockCups method restocks the number of cups to original amount
     */
    public void restockCups()
    {
        cups = 32;
    }
    /**
     * reloadWater method restocks amount of water to the original amount (5 gallons)
     */
    public void reloadWater()
    {
        water = 80;
    }
    /**
     * getCups method returns the number of cups in stock
     * @return cups  number of cups
     */
    public int getCups()
    {
        return cups;
    }
    /**
     * getWater method returns the amount of water in stock in gallons
     * @return water  in gallons
     */
    public double getWater()
    {
        return water/16.0; 
    }
}