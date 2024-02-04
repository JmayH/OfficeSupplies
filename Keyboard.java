/**
 * Keyboard.java models a keyboard and allows for you to type
 * @author August Cho
 * @author Jamie Hsieh
 * @version 2024-02-03
 */

public class Keyboard
{
	private Key[] keyArray;
	private String outLog;
    /**
     * Constructor for objects of Keyboard class
     */
	public Keyboard()
	{
		keyArray = new Key[46];
		outLog = "";
		String[] l = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=",
						"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]", "\\",
						"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'",
						"z", "x", "c", "v", "b", "n", "m", ",", ".", "/"};
		String[] u = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+",
						"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "{", "}", "|",
						"A", "S", "D", "F", "G", "H", "J", "K", "L", ":", "\"",
						"Z", "X", "C", "V", "B", "N", "M", "<", ">", "?"};
		for (int i = 0; i < l.length; i++)
		{
			keyArray[i] = new Key(l[i], u[i]);
		}
	}
	/**
     * pressKey method takes in a key value and whether or not the the [shift] key is on
     * 
     * @param value  the value of the primary value of key pressed
     * @param shift whether or not shift is on when pressing the key 
     */
	public void pressKey(String value, boolean shift)
	{
		for (Key k : keyArray)
		{
			if (k.getValue() == value)
			{
				outLog += k.press(shift);
			}
		}
	}
    /**
     * unpressKey method takes in a key value that was previously set as on and changes it to false
     * 
     * @param value  value of key being unpressed
     */
	public void unpressKey(String value)
	{
		for (Key k : keyArray)
		{
			if (k.getValue() == value)
			{
				k.keyOff();
			}
		}
	}
	/**
     * getLog method returns log of keys typed and clears it
     * 
     * @return returnlog  log of keys pressed
     */
	public String getLog()
	{
		// Returns log and clears it
		String returnlog = outLog;
		outLog = "";
		return returnlog;
	}
	/**
	 * getKeysPressed method returns the keys that have have the boolean value "on" as true
	 * @return pressed  array of keys on
	 */

	public Key[] getKeysPressed()
	{
		int total = 0;
		for (Key k : keyArray)
		{
			if (k.getOn())
			{
				total++;
			}
		}
		Key[] pressed = new Key[total];
		int i = 0;
		for (Key k : keyArray)
		{
			if (k.getOn())
			{
				pressed[i] = k;
				i++;
			}
		}
		return pressed;
	}
}
