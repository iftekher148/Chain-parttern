package chain_pattern;

public class Numbers {
	
	private int num1, num2;
	private String calWanted;
	public int getNumber2;
	
	public Numbers(int num1, int num2, String calWanted) 
	{
		this.num1 = num1;
		this.num2 = num2;
		this.calWanted = calWanted;
	}

	public String getCalculationWantwd() 
	{
		return calWanted;
	}

	public int getNumber1() 
	{
		return num1;
	}

	public int getNumber2() {
		return num2;
	}

}
