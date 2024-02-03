/**
 * Keyboard.java
 * @author August Cho
 * @author Jamie Hsieh
 * @version 2024-02-03
 */

public class Keyboard
{
	private Key[] keyArray;

	public Keyboard()
	{
		keyArray = new Key[26];
		keyArray[0] = new Key("a");
		keyArray[1] = new Key("b");
		keyArray[2] = new Key("c");
		keyArray[3] = new Key("d");
		keyArray[4] = new Key("e");
		keyArray[5] = new Key("f");
		keyArray[6] = new Key("g");
		keyArray[7] = new Key("h");
		keyArray[8] = new Key("i");
		keyArray[9] = new Key("j");
		keyArray[10] = new Key("k");
		keyArray[11] = new Key("l");
		keyArray[12] = new Key("m");
		keyArray[13] = new Key("n");
		keyArray[14] = new Key("o");
		keyArray[15] = new Key("p");
		keyArray[16] = new Key("q");
		keyArray[17] = new Key("r");
		keyArray[18] = new Key("s");
		keyArray[19] = new Key("t");
		keyArray[20] = new Key("u");
		keyArray[21] = new Key("v");
		keyArray[22] = new Key("w");
		keyArray[23] = new Key("x");
		keyArray[24] = new Key("y");
		keyArray[25] = new Key("z");
	}
}
