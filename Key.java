public class Key
{
    private boolean on;
    private String value;
    private String valuetwo;


    public Key(String value, String valuetwo)
    {
        this.value = value;
	this.valuetwo = valuetwo;
	this.on = false;
    }

    public void keyOff()
    {
        on = false;
    }
    public boolean getOn()
    {
	return on;
    }
	public String getValue()
	{
		return value;
	}

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
