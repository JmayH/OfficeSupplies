public class WaterDispenser
{
    private int cups;
    private int water;

    public  WaterDispenser()
    {
        cups = 32;
        water  = 80; 

    }

    public void fillcup()
    {
        if (cup > 0 && water > 0)
        {
            cups--;
            water --;
        }
        else
        {
           if (cups ==0)
            System.out.println("No more cups. Please restock");
        
            if(water ==0)
                System.out.println("Ran out of water. Please restock");
        }
    }
    public void fillcup(int x)
    {
        if (cup >= x && water >= x)
        {
            cups-x;
            water -x;
        }
        else
        {
           if (cups < x )
            System.out.println("Not enough cups. Please fill a lower number or restock");
        
            if(water < 0)
                System.out.println("Ran out of water. Please fill a lower number of cups or restock");
        }
    }
    
    public void restockCups()
    {
        cups = 32;
    }

    public void reloadWater()
    {
        water = 80;
    }
    public int getCups()
    {
        return cups;
    }
    public getWater()
    {
        return water/16.0 + " gallons" ; 
    }
}