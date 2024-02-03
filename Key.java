public class Key
{
    private boolean on;
    private String value;
    private boolean shift;


    public Key(String value, boolean shift)
    {
        this.value = value;
        this.name = name;
        this.shift = false;
    }

    public void keyOn()
    {
        on = true;
    }
    public void keyOff()
    {
        on = false;
    }

    public String getValue()
    {
        if (shift == false)
        {
            return value
        }
        else
        {
            return value.toUpperCase();

        }
    }



}