import java.security.Key;

public class OfficeSuppliesTester
{
    public static void main(String[] args)
    {
        int testsPassed = 0;

        // testing WaterDispenser.java
        System.out.println("===========");
        System.out.println();
        System.out.println("TESTING WATERDISPENSER");
        System.out.println();
        System.out.print("Creating a new WaterDispenser...");
        WaterDispenser w = new WaterDispenser();
        testsPassed++;
        System.out.print("test passed. WaterDispenser object created.");
        System.out.println();
        System.out.print("Getting a cup of water for myself...");
        w.fillcup();
        testsPassed++;
        System.out.print("test passed. " + w.getCups() + " cups left. (Started with 32)");
        System.out.println();
        System.out.print("filling 10 more cups of water for coworkers...");
        w.fillcup(10);
        testsPassed++;
        System.out.print("test passed. Filled " + (32 - w.getCups()) + " cups");
        System.out.println();
        System.out.print("counting how many cups are left...");
        if (w.getCups() == 21)
        {
            testsPassed++;
            System.out.print("21 cups remaining. Test passed.");
        }
        else
        {
            System.out.print("test failed.");
        }
        System.out.println();
        System.out.print("seeing how much water is left in the 5-gallon jug...");
        if(w.getWater() == 4.3125)
        {
            testsPassed++;
            System.out.print(w.getWater() + " gallons" + " remaining. Test passed.");
        }
        else
        {
            System.out.print("test failed.");
        }
        System.out.println();
        System.out.println("Tests passed: " + testsPassed + "/5");

        testsPassed = 0;

        //Testing Book.java
        System.out.println("===========");
        System.out.println();
        System.out.println("TESTING BOOK");
        System.out.println();
        System.out.print("Creating a new Book...");
        Book b = new Book("Communist Manifesto", "Karl Marx", 68);
        testsPassed++;
        System.out.print("test passed. Book object created.");
        System.out.println();
        System.out.println("Reading: " + b.getTitle() + " by " + b.getAuthor());
        System.out.print("Creating pages...");
        b.editPage(0, "A spectre is haunting Europe – the spectre of communism. All the powers of old Europe have entered into a holy alliance to exorcise this spectre: Pope and Tsar, Metternich and Guizot, French Radicals and German police-spies.");
        testsPassed++;
		b.editPage(1, "Where is the party in opposition that has not been decried as communistic by its opponents in power? Where is the opposition that has not hurled back the branding reproach of communism, against the more advanced opposition parties, as well as against its reactionary adversaries?");
        testsPassed++;
		b.editPage(2, "To this end, Communists of various nationalities have assembled in London and sketched the following manifesto, to be published in the English, French, German, Italian, Flemish and Danish languages. ");
        testsPassed++;
        System.out.print("tests passed. Created 3 pages.");
        System.out.println();
        System.out.println("Reading pages 1, 2, and 3...");
        System.out.println();
        System.out.println(b.readPages(3));
        testsPassed++;
        System.out.println("Test passed. Pages read. Bookmark currently set to page 3");
        System.out.print("Setting bookmark back to page 1 ...");
        b.setBookmark(1);
        testsPassed++;
        System.out.print("test passed. Bookmark saved.");
        System.out.println();
        System.out.println();
        System.out.println("Reading 1 page...");
        System.out.println();
		System.out.println(b.readPages(1));
        testsPassed++;
        System.out.println("Test passed. Read 1 page from bookmark.");
        System.out.println("Total Book tests passed: " + testsPassed + "/7");

        testspassed = 0;

        //testing Keyboard.java
        
        System.out.println("===========");
        System.out.println();
        System.out.println("TESTING KEYBOARD");
        System.out.println();
        System.out.print("Creating a new Keyboard...");
        Keyboard k  = new Keyboard();
        testsPassed++;
        System.out.print("test passed. Keyboard object created.");
        System.out.println();
        System.out.println("Typing 'hello' ...");
        k.pressKey("h", true);
		k.pressKey("e", false);
		k.pressKey("l", false);
		k.unpressKey("l");
		k.pressKey("l", false);
		k.pressKey("o", false);
		System.out.println("The keyboard recorded: " + k.getLog());
        testsPassed++;
        System.out.println("Test passed.");

		System.out.println("Showing keys pressed right now: ");
		for (Key key : k.getKeysPressed())
		{
			System.out.print(key.getValue() + " ");
		}
        testsPassed++;
        System.out.println("Test passed.");
        System.out.println();
        System.out.println("Unpressing all keys and typing 'world!' ");
		System.out.print("\n");
		k.pressKey("w", false);
		k.unpressKey("o");
		k.pressKey("o", false);
		k.pressKey("r", false);
		k.unpressKey("l");
		k.pressKey("l", false);
		k.pressKey("d", false);
		k.pressKey("1", true);
		System.out.println("The keyboard recorded: " + k.getLog());
        testsPassed++;
        System.out.println("Test passed.");
        System.out.println();
		System.out.println("Showing eys pressed right now: ");
		for (Key key : k.getKeysPressed())
		{
			System.out.print(key.getValue() + " ");
		}
		System.out.print("\n");
        testsPassed++;
        System.out.println("Test passed.");
        System.out.println();
		System.out.println("Unpressing all keys...");
		k.unpressKey("h");
		k.unpressKey("e");
		k.unpressKey("l");
		k.unpressKey("o");
		k.unpressKey("w");
		k.unpressKey("r");
		k.unpressKey("d");
		k.unpressKey("1");
		System.out.println("The keyboard recorded: " + k.getLog());
		System.out.println("Keys pressed right now are: ");
		for (Key key : k.getKeysPressed())
		{
			System.out.print(key.getValue() + " ");
		}
		System.out.print("\n");
        testsPassed++;
        System.out.println("Test passed.");
        System.out.println();
        System.out.println("Total Keyboard tests passed: " + testsPassed + "/6");
        
    

	}
}


    

