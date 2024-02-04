public class KeyboardTester
{
	public static void main(String[] args)
	{
		Keyboard k = new Keyboard();
		k.pressKey("h", true);
		k.pressKey("e", false);
		k.pressKey("l", false);
		k.unpressKey("l");
		k.pressKey("l", false);
		k.pressKey("o", false);
		System.out.println("The keyboard recorded: " + k.getLog());
		System.out.println("Keys pressed right now are: ");
		for (Key key : k.getKeysPressed())
		{
			System.out.print(key.getValue() + " ");
		}
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
		System.out.println("Keys pressed right now are: ");
		for (Key key : k.getKeysPressed())
		{
			System.out.print(key.getValue() + " ");
		}
		System.out.print("\n");
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

	}
}
