package studio7;

public class Die {

	private int n; //number of sides on the die
	
	public Die (int inputSides)
	{
		n = inputSides;
	}
	
	public int values()
	{
		return (int)((Math.random()*n)+1);
	}
	
	public static void main(String[] args)
	{
		Die d1 = new Die(39);
		for (int i=0;i<10;i++) 
		{
			System.out.println("Round" + (i+1) + ":"+ d1.values());
		}
	}
}
