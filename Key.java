/**
 * Keyboard.java models a keyboard and allows for you to type
 * @author Jamie Hsieh
 * @author August Cho
 * @version 2024-02-03
 */

public class Key
{
    private boolean on;
    private String value;
    private String valuetwo;

// constructor for objects in Key class
    public Key(String value, String valuetwo)
    {
        this.value = value;
	this.valuetwo = valuetwo;
	this.on = false;
    }
/**
 * keyOff method sets value of key as off (not pressed)
 * 
 */
    public void keyOff()
    {
        on = false;
    }
/**
 * getOn method returns whether or not a key is pressed
 * 
 * @return on 
 */
    public boolean getOn()
    {
	return on;
    }
/**
 * getValue method returns value of key
 * @return value
 */
	public String getValue()
	{
		return value;
	}
/**
 * press method turns on a key and returns its value
 * 
 * @param shift  if shift key is pressed or off
 * @return value of key pressed (upper or lower)
 */
    public String press(boolean shift)
    {
	on = true;
        
	if (shift == false)
        {
            return value;
        }
        else
        {
            return valuetwo;
        }
    }
}
