/**
 * Keyboard.java
 * @author August Cho
 * @author Jamie Hsieh
 * @version 2024-02-03
 */

public class Keyboard
{
	private Key[] keyArray;
	private String outLog;

	public Keyboard()
	{
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