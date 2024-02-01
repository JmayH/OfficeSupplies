public class WaterDispenserTester
{
    public static void main(String[] args)
    {
         System.out.println("Initializing a dispenser...\n");
        WaterDispenser w = new WaterDispenser();
        System.out.println("getting water for myself.../n");
        w.fillcup();
        System.out.println("filling 10 more cups of water for coworkers.../n");
        w.fillcup(10);
        System.out.println("counting how many cups are left.../n");
        w.getCups();
        


    }


}