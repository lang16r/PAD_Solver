 
public class Orb 
{
	private String type;
	private int indicator;
	private boolean mark;
	private String Orbs[] = { "Hearts", "Fire", "Water" , "Wood", "Light", "Dark" };
	
	public Orb()
	{
		indicator = (int) Math.random()*5;
		type = Orbs[indicator];
		mark = false;
	}
	
	public String getType()
	{
		return type;
	}

	public boolean markedOn()
	{
		return mark;
	}
	
	public void setMark()
	{
		mark = true;
	}
	
	public void clearMark()
	{
		mark = false;
	}
}
